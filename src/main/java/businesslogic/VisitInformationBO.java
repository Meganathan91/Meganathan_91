package businesslogic;
import entity.*;
import generateid.HMSUtility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VisitInformationBO {

/* create visit information for given appointmentId. given appointmentId contain patientId compare with
   visit details -> appointment -> patient -> patientId. This patientId already have three visit, for this patient
   object setPatientType as "IP" and update this patient object in patientMap. After this patient converted from
   out-patient to in-patient and update patient object in patient map. And update newly created visit object into visit
   map.
*/
    public void createVisitLogInformation(Long appointmentId, Map<Long, Appointment> appointmentMap,
                                             Map<Long, VisitLogInformation> visitMap, List<Medicine> lstMedicines,
                                             String doctorRecommendation, Boolean followUpNeed, Long patientId,
                                             Map<Long, Patient> patientMap, Long doctorId,
                                             Map<Long, Doctor> doctorMap, String purposeOfVisit) {

        VisitLogInformation visit = new VisitLogInformation();
        IP inPatient = new IP();

        // check given parameter values are valid, calling checkException.
        try {
            checkException(appointmentId, appointmentMap, visitMap, lstMedicines, doctorRecommendation, followUpNeed);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Appointment appointment = getAppointment(appointmentId, appointmentMap, patientId, patientMap, doctorId, doctorMap, purposeOfVisit);

        System.out.println(appointment);

        Patient patient = appointment.getPatient();

        Boolean status = isInPatient(visitMap, patient);
        patientMap.put(patient.getPatientId(), patient);

        visit.setVisitId(HMSUtility.getId(new ArrayList<Long>(visitMap.keySet())));
        visit.setDoctorRecommendation(doctorRecommendation);
        visit.setFollowUpNeed(followUpNeed);
        visit.setListOfMedicine(lstMedicines);
        visit.setAppointment(appointment);

        visitMap.put(visit.getVisitId(), visit);

        System.out.println(visit);
    }

    private void checkException(Long appointmentId, Map<Long, Appointment> appointmentMap,
                                Map<Long, VisitLogInformation> visitMap,
                                List<Medicine> medicines, String doctorRecommendation,
                                Boolean followUpNeed) throws Exception {
        if (appointmentId == null) {
            throw new Exception("create appointment ");
        }
        if (doctorRecommendation == null) {
            throw new Exception("need doctor advice ");
        }
        if (followUpNeed == null) {
            throw new Exception("check with doctor for followup ");
        }
        if (appointmentMap.isEmpty()) {
            throw new Exception(" appointmentMap empty ");
        }
        if (visitMap.isEmpty()) {
            throw new Exception(" visitMap empty ");
        }
        if (medicines.isEmpty()) {
            throw new Exception(" medicines not available ");
        }
    }

    private Boolean isInPatient(Map<Long, VisitLogInformation> visitDetails, Patient patient) {
        Iterator<Long> itr = visitDetails.keySet().iterator();
        VisitLogInformation visitLog;
        int visitCount = 0;
        while (itr.hasNext()) {
            visitLog = visitDetails.get(itr.next());
            if (visitLog.getAppointment().getPatient().getPatientId() == patient.getPatientId()) {
                visitCount++;
            }
        }
        System.out.println("visitCount : " + visitCount);

        if (visitCount >= 3) {
            patient.setPatientType("IP");
            return true;
        }
        return false;
    }


    private Appointment getAppointment(Long appointmentId, Map<Long, Appointment> appointmentMap, Long patientId,
                                       Map<Long, Patient> patientMap, Long doctorId, Map<Long, Doctor> doctorMap,
                                       String purposeOfVisit) {
        AppointmentBO appointmentBO = new AppointmentBO();
        Appointment appointment;
        if (appointmentMap.containsKey(appointmentId)) {
            appointment = appointmentMap.get(appointmentId);
        } else {
            appointment = appointmentBO.createAppointment(patientId, patientMap, doctorId, doctorMap, purposeOfVisit,
                                                            appointmentMap);
            System.out.println(" newly created appointment " + appointment);
        }
        return appointment;
    }
}

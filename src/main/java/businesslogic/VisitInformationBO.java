package businesslogic;

import entity.*;
import utility.HMSUtility;

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

        VisitLogInformation visit;

        // check given parameter values are valid, calling checkException.
        try {
            validateVisitInformationFields(appointmentId, appointmentMap, visitMap, lstMedicines, doctorRecommendation, followUpNeed);

        /* calling getAppointment method, create visit for given appointment,
         appointment is not having for patient create appointment .*/

            Appointment appointment = getAppointment(appointmentId, appointmentMap, patientId, patientMap, doctorId, doctorMap, purposeOfVisit);
            Patient patient = appointment.getPatient();

            Boolean status = isInPatient(visitMap, patient);
            patientMap.put(patient.getPatientId(), patient);

            visit = new VisitLogInformation();
            visit.setVisitId(HMSUtility.getId(new ArrayList<>(visitMap.keySet())));
            visit.setDoctorRecommendation(doctorRecommendation);
            visit.setFollowUpNeed(followUpNeed);
            visit.setListOfMedicine(lstMedicines);
            visit.setAppointment(appointment);

            visitMap.put(visit.getVisitId(), visit);
        } catch (Exception e) {
            System.out.println("create visit log information" + e.getMessage());
        }

    }

    private void validateVisitInformationFields(Long appointmentId, Map<Long, Appointment> appointmentMap,
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
            throw new Exception("appointmentMap empty ");
        }
        if (visitMap.isEmpty()) {
            throw new Exception("visitMap empty ");
        }
        if (medicines.isEmpty()) {
            throw new Exception("medicines not available ");
        }
    }

    private Boolean isInPatient(Map<Long, VisitLogInformation> visitDetails, Patient patient) {
        Iterator<Long> visitId = visitDetails.keySet().iterator();
        VisitLogInformation visitLog;
        int visitCount = 0;
        while (visitId.hasNext()) {
            visitLog = visitDetails.get(visitId.next());
            if (visitLog.getAppointment().getPatient().getPatientId() == patient.getPatientId()) {
                visitCount++;
            }
        }
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
        }
        return appointment;
    }
}

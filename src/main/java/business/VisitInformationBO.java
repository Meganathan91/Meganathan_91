package business;

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
    public Patient createVisitLogInformation(Appointment appointment, Map<Long, VisitLogInformation> visitMap, List<Medicine> lstMedicines,
                                             Map<Long, Patient> patientMap) {
        /* check given parameter values are valid, calling validateVisitInformationFields.
         calling getAppointment method, create visit for given appointment,
         appointment is not having for patient create appointment .*/
        VisitLogInformation visit;
        Patient patient = null;
        try {
            validateVisitInformationFields(appointment, visitMap, lstMedicines);

            if(appointment.getPatient() != null) {
                patient = appointment.getPatient();
            }
            if (isInPatient(visitMap, patient)) {
                patient.setPatientType("IP");
                patientMap.put(patient.getPatientId(), patient);
            }

            visit = new VisitLogInformation();
            visit.setVisitId(HMSUtility.getId(new ArrayList<>(visitMap.keySet())));
            visit.setDoctorRecommendation("best, mouthwashes for better dental care");
            visit.setFollowUpNeed(true);
            visit.setListOfMedicine(lstMedicines);
            visit.setAppointment(appointment);

            visitMap.put(visit.getVisitId(), visit);
        } catch (Exception e) {
            System.out.println("VisitLog Exception " + e.getMessage());
        }
        return patient;
    }

    private void validateVisitInformationFields(Appointment appointment, Map<Long, VisitLogInformation> visitMap,
                                                List<Medicine> medicines) throws Exception {
        if (appointment == null ) {
            throw new Exception("Appointment is not Available ");
        }
        if (visitMap.isEmpty()) {
            throw new Exception("visitMap empty ");
        }
        if (medicines.isEmpty()) {
            throw new Exception("medicines not available ");
        }
    }

    private boolean isInPatient(Map<Long, VisitLogInformation> visitDetails, Patient patient) {
        Iterator<Long> visitId = visitDetails.keySet().iterator();
        VisitLogInformation visitLog;
        int visitCount = 0;
        while (visitId.hasNext()) {
            visitLog = visitDetails.get(visitId.next());
            if (visitLog.getAppointment() != null && visitLog.getAppointment().getPatient() != null && visitLog.getAppointment().getPatient().getPatientId() == patient.getPatientId()) {
                visitCount++;
                if(visitCount == 3) {
                    break;
                }
            }
        }
        if (visitCount >= 3) {
            return true;
        }
        return false;
    }
}

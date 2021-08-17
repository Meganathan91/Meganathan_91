package business;

import entity.*;
import utility.HMSUtility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VisitLogInformationBO {
    public VisitLogInformation createVisitLogInformation(Appointment appointment, Map<Long, VisitLogInformation> visitMap, List<Medicine> lstMedicines,
                                             Map<Long, Patient> patientMap) {

        VisitLogInformation visitLogInformation = null;
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

            visitLogInformation = new VisitLogInformation();
            visitLogInformation.setVisitId(HMSUtility.getId(new ArrayList<>(visitMap.keySet())));
            visitLogInformation.setDoctorRecommendation("best, mouthwashes for better dental care");
            visitLogInformation.setFollowUpNeed(true);
            visitLogInformation.setListOfMedicine(lstMedicines);
            visitLogInformation.setAppointment(appointment);

            System.out.println("VisitLogInformation created successfully ....." + "\n" +visitLogInformation +"\n");

            visitMap.put(visitLogInformation.getVisitId(), visitLogInformation);
        } catch (Exception e) {
            System.out.println("VisitLog Exception " + e.getMessage());
        }
        return visitLogInformation;
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

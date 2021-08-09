package businesslogic;

import entity.Appointment;
import entity.Medicine;
import entity.Patient;
import entity.VisitLogInformation;
import generateid.GenerateVisitId;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VisitInformationBO {

    public Patient createVisitLogInformation(Long appointmentId, Map<Long, Appointment> appointmentMap,
                                             Map<Long, VisitLogInformation> visitDetails,
                                             List<Medicine> medicines, String doctorRecommendation,
                                             Boolean followUpNeed) throws Exception {

        if (appointmentId == null) {
            throw new Exception(" appointmentId is null ");
        }
        if (doctorRecommendation == null) {
            throw new Exception(" doctorRecommendation is null ");
        }
        if (followUpNeed == null) {
            throw new Exception(" followUpNeed is null ");
        }
        if (appointmentMap.isEmpty()) {
            throw new Exception(" appointmentMap empty ");
        }
        if (visitDetails.isEmpty()) {
            throw new Exception(" visitDetails empty ");
        }
        if (medicines.isEmpty()) {
            throw new Exception(" medicines empty ");
        }

        Appointment appointment = new Appointment();
        if (appointmentMap.containsKey(appointmentId)) {
            appointment = appointmentMap.get(appointmentId);
        }

        Patient patient = appointment.getPatient();

        VisitLogInformation information = new VisitLogInformation();
        information.setVisitId(GenerateVisitId.getVisitId(new ArrayList<>(visitDetails.keySet())));
        information.setDoctorRecommendation(doctorRecommendation);
        information.setFollowUpNeed(followUpNeed);
        information.setListOfMedicine(medicines);
        information.setAppointment(appointment);

        Boolean status = checkPatientType(visitDetails, patient);
        visitDetails.put(information.getVisitId(), information);

        return patient;
    }

    private Boolean checkPatientType(Map<Long, VisitLogInformation> visitDetails, Patient patient) {

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
}

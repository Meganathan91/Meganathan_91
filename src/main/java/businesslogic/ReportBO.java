package businesslogic;

import entity.Appointment;
import entity.InPatient;
import entity.Patient;
import entity.VisitLogInformation;
import practice.DateDemo;

import java.util.*;

public class ReportBO {

    public void getPatientDetail(Map<Long, Patient> patientDetails, Long patientId, String patientName) throws Exception {

        Patient patient = new Patient();

        if (patientDetails.isEmpty())
            throw new Exception("patient detail is null");

        if (patientId == null || patientId.longValue() == 0)
            throw new Exception("patient id is null");

        if (patientName == null || patientName.length() == 0)
            throw new Exception("patient name is is null");

        if (patientDetails.containsKey(patientId)) {
            patient = patientDetails.get(patientId);
            //System.out.println("Patient detail for given patient id : " + patient);
        }

        Patient patient1 = new Patient();
        Iterator<Long> itr = patientDetails.keySet().iterator();
        while (itr.hasNext()) {
            patient1 = patientDetails.get(itr.next());
            if (patient1.getPatientName().equals(patientName)) {
                //System.out.println(" Patient detail for given patient name : " + patient1);
            }
        }
        System.out.println("");
    }

    public void listOfVisitForPatientId(Map<Long, VisitLogInformation> visitDetails, Long patientId) throws Exception {

        if (visitDetails.isEmpty())
            throw new Exception("visit details is empty : ");

        if (patientId == null || patientId.longValue() == 0)
            throw new Exception("patient id is null : ");

        VisitLogInformation visitLogInformation = new VisitLogInformation();
        Iterator<Long> itr = visitDetails.keySet().iterator();
        while (itr.hasNext()) {

            visitLogInformation = visitDetails.get(itr.next());
            if (visitLogInformation.getAppointment().getPatient().getPatientId() == patientId) {
                //System.out.println(" list of visit for patient id : " + visitLogInformation);
            }
        }
        System.out.println("");
    }

    public void displayOutPatient(Map<Long, Patient> patientDetails) throws Exception {

        if (patientDetails.isEmpty())
            throw new Exception("patient detail is null");

        Patient patient = new Patient();
        Iterator<Long> itr = patientDetails.keySet().iterator();
        while (itr.hasNext()) {
            patient = patientDetails.get(itr.next());
            if (patient.getPatientType().equals("OP")) {
                //System.out.println(" out-patient detail : " + patient);
            }
        }
        System.out.println("");
    }

    public void displayInPatient(Map<Long, InPatient> inPatientDetail) throws Exception {

        if (inPatientDetail.isEmpty())
            throw new Exception("in-patient detail is null");

        Iterator<Long> itr = inPatientDetail.keySet().iterator();
        InPatient inPatient;
        while (itr.hasNext()) {
            inPatient = inPatientDetail.get(itr.next());
            //System.out.println(" InPatient Detail: " + inPatient.getPatient());
        }
    }

    public void displayPatientByDoctorId(Map<Long, Appointment> appointmentDetails, Long doctorId) throws Exception {

        if (appointmentDetails.isEmpty())
            throw new Exception("patient detail is null");

        if (doctorId == null || doctorId.longValue() == 0)
            throw new Exception("patient detail is null");

        Iterator<Long> itr = appointmentDetails.keySet().iterator();
        while (itr.hasNext()) {
            Appointment appointment = appointmentDetails.get(itr.next());
            if (appointment.getDoctor().getDoctorId() == doctorId) {
                //System.out.println(" list of patient by doctor id (1l): " + appointment.getPatient());
            }
        }
    }

    public void patientFollowUpVisit(Map<Long, VisitLogInformation> visitDetails) {

        Iterator<Long> itr = visitDetails.keySet().iterator();
        while (itr.hasNext()) {
            VisitLogInformation followUp = visitDetails.get(itr.next());
            if (followUp.getFollowUpNeed() == true) {
                //System.out.println("  patient needs the follow up visit : " + followUp.getAppointment().getPatient());
            }
        }
    }
}

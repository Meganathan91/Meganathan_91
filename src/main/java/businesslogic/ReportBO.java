package businesslogic;

import entity.Appointment;
import entity.IP;
import entity.Patient;
import entity.VisitLogInformation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ReportBO {
    /* 1. Generated report for patient detail for given patient name/id,
       2. Displayed list of visit for given patientId
       3. Displayed out-patient details from patient map.
       4. Displayed in-patient from in-patient map.
       5. Displayed list of patient details for followup visit.
       6. Displayed patients list for given doctorId.
     */
    public void getPatientDetail(Map<Long, Patient> patientDetails, Long patientId,
                                 String patientName) throws Exception {

        Patient patient;

        if (patientDetails.isEmpty())
            throw new Exception("patient detail is null");

        if (patientId == null || patientId.longValue() == 0)
            throw new Exception("patient id is null");

        if (patientName == null || patientName.length() == 0)
            throw new Exception("patient name is is null");

        if (patientDetails.containsKey(patientId)) {
            patient = patientDetails.get(patientId);
            //System.out.println("1. Patient detail for given patient id : " + patient);
        }

        Patient patient1;
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

    public void displayInPatient(Map<Long, IP> inPatientDetail) {

        Iterator<Long> itr = inPatientDetail.keySet().iterator();
        IP inPatient;
        while (itr.hasNext()) {
            inPatient = inPatientDetail.get(itr.next());
            //System.out.println(" inPatientDetail : " + inPatient.getPatient());
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
                //System.out.println(" patient needs the follow up visit : " + followUp.getAppointment().getPatient());
            }
        }
    }

    /*
       Displayed today visited patient details,
       Displayed visit details for given date range.
     */
    public void getVisitDetail(Map<Long, VisitLogInformation> visitDetails) {
        VisitLogInformation logInformation;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-mm-yyyy");
        Iterator<Long> itr = visitDetails.keySet().iterator();
        while (itr.hasNext()) {
            logInformation = visitDetails.get(itr.next());
            Date date = logInformation.getAppointment().getDateOfVisit();
            String dateOne = dateFormat.format(date);
            String dateTwo = dateFormat1.format(Calendar.getInstance().getTime());
            if (dateOne.equals(dateTwo)) {
                //System.out.println("today visited patient detail " + logInformation.getAppointment().getPatient());
            }
        }

        SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd");
        Iterator<Long> itr1 = visitDetails.keySet().iterator();
        Date date;
        while (itr1.hasNext()) {
            logInformation = visitDetails.get(itr1.next());
            date = logInformation.getAppointment().getDateOfVisit();
            try {
                Date visitDate = new SimpleDateFormat("yyyy/mm/dd").parse(format.format(date));
                Date startDate = new SimpleDateFormat("yyyy/mm/dd").parse("2021/01/01");
                Date endDate = new SimpleDateFormat("yyyy/mm/dd").parse("2021/03/12");
                if (visitDate.after(startDate) && visitDate.before(endDate)) {
                    //System.out.println("Visit Details given Date Range " + logInformation);
                }
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}

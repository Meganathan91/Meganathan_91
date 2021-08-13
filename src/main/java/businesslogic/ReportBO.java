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
        System.out.println(" ======= Patient detail for given patient id ======= ");
        Patient patient;

        if (patientDetails.isEmpty())
            throw new Exception("patient detail is null");

        if (patientId == null || patientId.longValue() == 0)
            throw new Exception("patient id is null");

        if (patientName == null || patientName.length() == 0)
            throw new Exception("patient name is is null");

        if (patientDetails.containsKey(patientId)) {
            patient = patientDetails.get(patientId);
            System.out.println(patient);
        }

        System.out.println(" ======= Patient detail for given patient name ======= ");

        Patient _patient;
        Iterator<Long> itr = patientDetails.keySet().iterator();
        while (itr.hasNext()) {
            _patient = patientDetails.get(itr.next());
            if (_patient.getPatientName().equals(patientName)) {
                System.out.println(_patient);
            }
        }
    }

    public void listOfVisitForPatientId(Map<Long, VisitLogInformation> visitDetails, Long patientId) throws Exception {
        System.out.println(" ======= list of visit for patient id ======= ");

        if (visitDetails.isEmpty())
            throw new Exception("visit details is empty : ");

        if (patientId == null || patientId.longValue() == 0)
            throw new Exception("patient id is null : ");

        VisitLogInformation visitLogInformation;
        Iterator<Long> itr = visitDetails.keySet().iterator();
        while (itr.hasNext()) {
            visitLogInformation = visitDetails.get(itr.next());
            if (visitLogInformation.getAppointment().getPatient().getPatientId() == patientId) {
                System.out.println(visitLogInformation);
            }
        }
    }

    public void displayOutPatient(Map<Long, Patient> patientDetails) throws Exception {
        System.out.println("======== OutPatient Details =======" );

        if (patientDetails.isEmpty())
            throw new Exception("patient detail is empty");

        Patient patient;
        Iterator<Long> itr = patientDetails.keySet().iterator();
        while (itr.hasNext()) {
            patient = patientDetails.get(itr.next());
            if (patient.getPatientType().equals("OP")) {
                System.out.println(patient);
            }
        }
    }

    public void displayInPatient(Map<Long, IP> inPatientDetail) {
        System.out.println("======== InPatient Details =======" );

        Iterator<Long> itr = inPatientDetail.keySet().iterator();
        IP inPatient;
        while (itr.hasNext()) {
            inPatient = inPatientDetail.get(itr.next());
            System.out.println(inPatient.getPatient());
        }
    }

    public void displayPatientByDoctorId(Map<Long, Appointment> appointmentDetails, Long doctorId) throws Exception {
        System.out.println("======= list of patient by doctor id =======" );

        if (appointmentDetails.isEmpty())
            throw new Exception("patient detail is null");

        if (doctorId == null || doctorId.longValue() == 0)
            throw new Exception("patient detail is null");

        Iterator<Long> itr = appointmentDetails.keySet().iterator();
        while (itr.hasNext()) {
            Appointment appointment = appointmentDetails.get(itr.next());
            if (appointment.getDoctor().getDoctorId() == doctorId) {
                System.out.println(appointment.getPatient());
            }
        }
    }

    public void patientFollowUpVisit(Map<Long, VisitLogInformation> visitDetails) {
        System.out.println("======patient who's needs the follow up visit======");

        Iterator<Long> itr = visitDetails.keySet().iterator();
        while (itr.hasNext()) {
            VisitLogInformation followUp = visitDetails.get(itr.next());
            if (followUp.getFollowUpNeed() == true) {
                System.out.println(followUp.getAppointment().getPatient());
            }
        }

    }

    /*
       Displayed today visited patient details,
       Displayed visit details for given date range.
     */
    public void getVisitDetail(Map<Long, VisitLogInformation> visitDetails) {
        System.out.println("======today visited patient detail======");
        VisitLogInformation logInformation;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd");
        Iterator<Long> itr = visitDetails.keySet().iterator();
        while (itr.hasNext()) {
            logInformation = visitDetails.get(itr.next());
            Date date = logInformation.getAppointment().getDateOfVisit();
            String dateOne = dateFormat.format(date);
            String dateTwo = dateFormat1.format(Calendar.getInstance().getTime());
            if (dateOne.equals(dateTwo)) {
                System.out.println(logInformation.getAppointment().getPatient());
            }
        }

        System.out.println("======visit details between date range======");

        SimpleDateFormat dateFormats = new SimpleDateFormat("yyyy/MM/dd");
        Iterator<Long> itr1 = visitDetails.keySet().iterator();
        Date date;
        while (itr1.hasNext()) {
            logInformation = visitDetails.get(itr1.next());
            date = logInformation.getAppointment().getDateOfVisit();
            try {
                Date visitDate = dateFormats.parse(dateFormats.format(date));
                Date startDate = new SimpleDateFormat("yyyy/MM/dd").parse("2021/1/1");
                Date endDate = new SimpleDateFormat("yyyy/MM/dd").parse("2021/7/12");
                if (visitDate.after(startDate) && visitDate.before(endDate)) {
                    System.out.println(logInformation);
                }
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

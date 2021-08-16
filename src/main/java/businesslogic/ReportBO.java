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
       7. Displayed today visited patient details,
       8. Displayed visit details for given date range.
     */
    public void getPatientDetail(Map<Long, Patient> patientDetails, Long patientId,
                                 String patientName) throws Exception {

        System.out.println("======= Patient detail for given patient id =======");
        Patient patient;

        if (patientDetails.isEmpty())
            throw new Exception("Patient details is empty ");

        if (patientId == null || patientId == 0)
            throw new Exception("invalid patient id ");

        if (patientName == null || patientName.length() == 0)
            throw new Exception("invalid patient name ");

        if (patientDetails.containsKey(patientId)) {
            patient = patientDetails.get(patientId);
            System.out.println(patient);
        }

        System.out.println(" ======= Patient detail for given patient name ======= ");

        Patient _patient;
        for (Long patientIds : patientDetails.keySet()) {
            _patient = patientDetails.get(patientIds);
            if (_patient.getPatientName().equals(patientName)) {
                System.out.println(_patient);
            }
        }
    }

    public void listOfVisitForPatientId(Map<Long, VisitLogInformation> visitDetails, Long patientId) throws Exception {
        System.out.println(" ======= list of visit for patient id ======= ");

        if (visitDetails.isEmpty())
            throw new Exception("visit details is empty ");

        if (patientId == null || patientId == 0)
            throw new Exception("invalid patient id ");

        VisitLogInformation visitLogInformation;
        for (Long visitId : visitDetails.keySet()) {
            visitLogInformation = visitDetails.get(visitId);
            if (visitLogInformation.getAppointment().getPatient().getPatientId().equals(patientId)) {
                System.out.println(visitLogInformation);
            }
        }
    }

    public void displayOutPatient(Map<Long, Patient> patientDetails) throws Exception {
        System.out.println("======== OutPatient Details =======" );

        if (patientDetails.isEmpty())
            throw new Exception("patient detail is empty");

        Patient patient;
        for (Long patientId : patientDetails.keySet()) {
            patient = patientDetails.get(patientId);
            if (patient.getPatientType().equals("OP")) {
                System.out.println(patient);
            }
        }
    }

    public void displayInPatient(Map<Long, IP> inPatientDetail) throws Exception {
        System.out.println("======== InPatient Details =======" );

        if(inPatientDetail.isEmpty())
            throw new Exception("inPatient details is empty ");

        Iterator<Long> ipIdentificationNumber = inPatientDetail.keySet().iterator();
        IP inPatient;
        while (ipIdentificationNumber.hasNext()) {
            inPatient = inPatientDetail.get(ipIdentificationNumber.next());
            System.out.println(inPatient.getPatient());
        }
    }

    public void displayPatientByDoctorId(Map<Long, Appointment> appointmentDetails, Long doctorId) throws Exception {
        System.out.println("======= list of patient by doctor id =======" );

        if (appointmentDetails.isEmpty())
            throw new Exception("appointment details is empty ");

        if (doctorId == null || doctorId == 0)
            throw new Exception("invalid doctor id ");

        for (Long appointmentId : appointmentDetails.keySet()) {
            Appointment appointment = appointmentDetails.get(appointmentId);
            if (appointment.getDoctor().getDoctorId().equals(doctorId)) {
                System.out.println(appointment.getPatient());
            }
        }
    }

    public void patientFollowUpVisit(Map<Long, VisitLogInformation> visitDetails) {
        System.out.println("======patient who's needs the follow up visit======");

        for (Long visitId : visitDetails.keySet()) {
            VisitLogInformation followUp = visitDetails.get(visitId);
            if (followUp.getFollowUpNeed()) {
                System.out.println(followUp.getAppointment().getPatient());
            }
        }
    }

    public void getVisitDetail(Map<Long, VisitLogInformation> visitDetails) {
        System.out.println("======today visited patient detail======");
        VisitLogInformation logInformation;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd");

        for (Long visitId : visitDetails.keySet()) {
            logInformation = visitDetails.get(visitId);
            Date date = logInformation.getAppointment().getDateOfVisit();
            String dateOne = dateFormat.format(date);
            String dateTwo = dateFormat1.format(Calendar.getInstance().getTime());
            if (dateOne.equals(dateTwo)) {
                System.out.println(logInformation.getAppointment().getPatient());
            }
        }

        System.out.println("======visit details between date range======");

        SimpleDateFormat dateFormats = new SimpleDateFormat("yyyy/MM/dd");
        Iterator<Long> visitIds = visitDetails.keySet().iterator();
        Date date;
        while (visitIds.hasNext()) {
            logInformation = visitDetails.get(visitIds.next());
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

package business;

import entity.Appointment;
import entity.InPatient;
import entity.Patient;
import entity.VisitLogInformation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

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
    public void generateHospitalReport(Map<Long, Patient> patientDetails, Map<Long, Appointment> appointmentDetails,
                                       Map<Long, VisitLogInformation> visitDetails, Map<Long, InPatient> inPatientDetails) {

        try {
            displayPatientDetail(patientDetails);
            visitDetailForPatientId(visitDetails);
            displayOutPatientDetail(patientDetails);
            displayInPatientDetail(inPatientDetails);
            followUpVisitPatientDetail(visitDetails);
            displayPatientByDoctorId(appointmentDetails);
            todayVisitedPatientDetail(visitDetails);
            visitDetailGivenDateRange(visitDetails);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void displayPatientDetail(Map<Long, Patient> patientMap) {
        System.out.println("Patient detail for given patient id .....");
        Patient patient = null;
        if (patientMap.containsKey(2L)) {                                  // input patientId 2L
            patient = patientMap.get(2L);
            System.out.println(patient);
        } else {
            System.out.println("Patient detail not available for given patient id");
        }

        System.out.println();
        System.out.println("Patient detail for given patient name .....");
        for (Long patientId : patientMap.keySet()) {
            patient = patientMap.get(patientId);
            if (patient.getPatientName().equals("Mohan")) {                 // input patient name "Mohan"
                System.out.println();
                System.out.println(patient);
            }
        }
    }

    private void visitDetailForPatientId(Map<Long, VisitLogInformation> visitDetails) {
        System.out.println("List of visit for patient id .....");
        VisitLogInformation visitLogInformation;
        for (Long visitId : visitDetails.keySet()) {
            visitLogInformation = visitDetails.get(visitId);
            if (visitLogInformation.getAppointment().getPatient().getPatientId().equals(5L)) {    // input patientId 5L
                System.out.println(visitLogInformation);
            }
        }
        System.out.println();
    }

    private void displayOutPatientDetail(Map<Long, Patient> patientDetails) {
        System.out.println("OutPatient Details .....");
        for (Long patientId : patientDetails.keySet()) {
            Patient patient = patientDetails.get(patientId);
            if (patient.getPatientType().equals("OP")) {                 // input patientType "OP"
                System.out.println(patient);
            }
        }
    }

    private void displayInPatientDetail(Map<Long, InPatient> inPatientMap) {
        System.out.println("InPatient Details .....");
        Iterator<Long> ipIdentificationNumber = inPatientMap.keySet().iterator();
        InPatient inPatient;
        while (ipIdentificationNumber.hasNext()) {
            inPatient = inPatientMap.get(ipIdentificationNumber.next());
            System.out.println(inPatient.getPatient());
        }
    }

    private void followUpVisitPatientDetail(Map<Long, VisitLogInformation> visitDetails) {
        System.out.println("Patient who's needs the follow up visit .....");
        for (Long visitId : visitDetails.keySet()) {
            VisitLogInformation _visitLogInformation = visitDetails.get(visitId);
            if (_visitLogInformation.getFollowUpNeed()) {
                System.out.println(_visitLogInformation.getAppointment().getPatient());
            }
        }
    }

    private void displayPatientByDoctorId(Map<Long, Appointment> appointmentDetails) {
        System.out.println("List of patient by doctor id .....");
        for (Long appointmentId : appointmentDetails.keySet()) {
            Appointment appointment = appointmentDetails.get(appointmentId);
            if (appointment.getDoctor().getDoctorId().equals(5L)) {    // display patient details by doctorId 2L
                System.out.println(appointment.getPatient());
            }
        }
    }

    private void todayVisitedPatientDetail(Map<Long, VisitLogInformation> visitDetails) {
        System.out.println("Today visited patient detail .....");
        VisitLogInformation _visitLogInformation;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd");

        for (Long visitId : visitDetails.keySet()) {
            _visitLogInformation = visitDetails.get(visitId);
            Date date = _visitLogInformation.getAppointment().getDateOfVisit();
            String dateOne = dateFormat.format(date);
            String dateTwo = dateFormat1.format(Calendar.getInstance().getTime());
            if (dateOne.equals(dateTwo)) {
                System.out.println(_visitLogInformation.getAppointment().getPatient());    // displayed today visited patient details
            }
        }
    }

    private void visitDetailGivenDateRange(Map<Long, VisitLogInformation> visitDetails) {
        System.out.println("Visit details between date range .....");
        Iterator<Long> visitId = visitDetails.keySet().iterator();
        VisitLogInformation logInformation;
        while (visitId.hasNext()) {
            logInformation = visitDetails.get(visitId.next());
                Date visitDate = logInformation.getAppointment().getDateOfVisit();
                Date startDate = getDate("2021/3/1");  // VisitLogInformation between 2021/1/1 to 2021/7/12
                Date endDate = getDate("2021/8/12");
                if (visitDate.after(startDate) && visitDate.before(endDate)) {
                    System.out.println(logInformation);
                }
            }
        }

    public static Date getDate(String s) {
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date date = null;
        try {
            date = format.parse(s);
        } catch (ParseException e) {
            System.out.println("Date format exception");
        }
        return date;
    }
    }

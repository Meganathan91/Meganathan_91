package business;

import entity.Appointment;
import entity.InPatient;
import entity.Patient;
import entity.VisitLogInformation;
import utility.DateUtility;
import utility.DateWithoutTimeUsingCalendar;

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
        boolean isReportExist = true;
        System.out.println("Patient detail for given patient id .....");
        Patient patient;
        if (patientMap.containsKey(2L)) {                                  // input patientId 2L
            patient = patientMap.get(2L);
            System.out.println(patient);
        } else {
            System.out.println("Patient detail not available for given patient id");
        }

        System.out.println();
        System.out.println("Patient detail for given patient name .....");
        for (Long _patientId : patientMap.keySet()) {
            patient = patientMap.get(_patientId);
            if (patient.getPatientName().equalsIgnoreCase("Mohan")) {                 // input patient name "Mohan"
                System.out.println(patient);
                isReportExist = false;
            }
        }
        if (isReportExist) {
            System.out.println("patient detail not exist given name ");
        }
        System.out.println();
    }

    private void visitDetailForPatientId(Map<Long, VisitLogInformation> visitDetails) {
        boolean isReportExist = true;
        System.out.println("List of visit for patient id .....");
        VisitLogInformation visitLogInformation;
        for (Long visitId : visitDetails.keySet()) {
            visitLogInformation = visitDetails.get(visitId);
            if (visitLogInformation.getAppointment().getPatient().getPatientId() == 2L) {    // input patientId 5L
                System.out.println(visitLogInformation);
                isReportExist = false;
            }
        }
        if (isReportExist) {
            System.out.println("Visit Details not Exist given Patient Id");
        }
        System.out.println();
    }

    private void displayOutPatientDetail(Map<Long, Patient> patientDetails) {
        boolean isReportExist = true;
        System.out.println("OutPatient Details .....");
        for (Long patientId : patientDetails.keySet()) {
            Patient patient = patientDetails.get(patientId);
            if (patient.getPatientType().equalsIgnoreCase("OP")) {                 // input patientType "OP"
                System.out.println(patient);
                isReportExist = false;
            }
        }
        if (isReportExist) {
            System.out.println("OutPatient detail not exist");
        }
        System.out.println();
    }

    private void displayInPatientDetail(Map<Long, InPatient> inPatientMap) {
        boolean isReportExist = true;
        System.out.println("InPatient Details .....");
        Iterator<Long> ipIdentificationNumber = inPatientMap.keySet().iterator();
        InPatient inPatient;
        while (ipIdentificationNumber.hasNext()) {
            inPatient = inPatientMap.get(ipIdentificationNumber.next());
            System.out.println(inPatient.getPatient());
            isReportExist = false;
        }
        if (isReportExist) {
            System.out.println("InPatient Detail not Exist");
        }
        System.out.println();
    }

    private void followUpVisitPatientDetail(Map<Long, VisitLogInformation> visitDetails) {
        boolean isReportExist = true;
        System.out.println("Patient who's needs the follow up visit .....");
        for (Long visitId : visitDetails.keySet()) {
            VisitLogInformation _visitLogInformation = visitDetails.get(visitId);
            if (_visitLogInformation.getFollowUpNeed()) {
                System.out.println(_visitLogInformation.getAppointment().getPatient());
                isReportExist = false;
            }
        }
        if (isReportExist) {
            System.out.println("FollowUp Visit Patient Detail not exist");
        }
        System.out.println();
    }

    private void displayPatientByDoctorId(Map<Long, Appointment> appointmentDetails) {
        boolean isReportExist = true;
        System.out.println("List of patient by doctor id .....");
        for (Long appointmentId : appointmentDetails.keySet()) {
            Appointment appointment = appointmentDetails.get(appointmentId);
            if (appointment.getDoctor().getDoctorId() == 1L) {    // display patient details by doctorId 2L
                System.out.println(appointment.getPatient());
                isReportExist = false;
            }
        }
        if (isReportExist) {
            System.out.println("Patient detail not exist given doctor id");
        }
        System.out.println();
    }

    private void todayVisitedPatientDetail(Map<Long, VisitLogInformation> visitDetails) {
        boolean isReportExist = true;
        System.out.println("Today visited patient detail .....");
        VisitLogInformation _visitLogInformation;
        for (Long visitId : visitDetails.keySet()) {
            _visitLogInformation = visitDetails.get(visitId);
            Date visitDate = DateWithoutTimeUsingCalendar.getCurrentDate(_visitLogInformation.getAppointment().getDateOfVisit());
            Date todayDate = DateWithoutTimeUsingCalendar.getCurrentDate(Calendar.getInstance().getTime());
            if (visitDate.compareTo(todayDate) == 0) {
                System.out.println(_visitLogInformation.getAppointment().getPatient());
                isReportExist = false; // displayed today visited patient details
            }
        }
        if (isReportExist) {
            System.out.println("Patient not visited for today ");
        }
        System.out.println();
    }

    private void visitDetailGivenDateRange(Map<Long, VisitLogInformation> visitDetails) {
        boolean isReportExist = true;
        System.out.println("Visit details between date range .....");
        Iterator<Long> visitId = visitDetails.keySet().iterator();
        VisitLogInformation logInformation;
        while (visitId.hasNext()) {
            logInformation = visitDetails.get(visitId.next());
            Date visitDate = logInformation.getAppointment().getDateOfVisit();
            Date startDate = DateUtility.getDate(2021,7,30);  // VisitLogInformation between 2021/1/1 to 2021/7/12
            Date endDate = DateUtility.getDate(2021,11,30);
            if (visitDate.compareTo(startDate) == 0 || visitDate.compareTo(endDate) == 0 || (visitDate.after(startDate) && visitDate.before(endDate))) {
                System.out.println(logInformation);
                isReportExist = false;
            }
        }
        if (isReportExist) {
            System.out.println("Patient detail not exist given date range");
        }
        System.out.println();
    }
}
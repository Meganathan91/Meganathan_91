package business;

import entity.Appointment;
import entity.InPatient;
import entity.Patient;
import entity.VisitLogInformation;

import java.text.DateFormat;
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
    public void generateHospitalReport(Map<Long, Patient> patientDetails, Map<Long, Appointment> appointmentDetails,
                                       Map<Long, VisitLogInformation> visitDetails, Map<Long, InPatient> inPatientDetails) {
        boolean valid;
        Scanner scanner = new Scanner(System.in);

        try {
            do {
                System.out.println("Enter number between 1 - 8 ");
                int number = scanner.nextInt();
                if (number >= 1 && number < 9) {
                    valid = true;
                    if (number == 1) {
                        displayPatientDetail(patientDetails);
                        continue;
                    }
                    if (number == 2) {
                        visitDetailForPatientId(visitDetails);
                        continue;
                    }
                    if (number == 3) {
                        displayOutPatientDetail(patientDetails);
                        continue;
                    }
                    if (number == 4) {
                        displayInPatientDetail(inPatientDetails);
                        continue;
                    }
                    if (number == 5) {
                        followUpVisitPatientDetail(visitDetails);
                        continue;
                    }
                    if (number == 6) {
                        displayPatientByDoctorId(appointmentDetails);
                        continue;
                    }
                    if (number == 7) {
                        todayVisitedPatientDetail(visitDetails);
                        continue;
                    }
                    if (number == 8) {
                        visitDetailGivenDateRange(visitDetails);
                        continue;
                    }
                } else
                    System.out.println("invalid option ");
                valid = false;
            } while (valid);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void displayPatientDetail(Map<Long, Patient> patientMap) {
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        Patient patient;

        System.out.println();
        System.out.println("Enter Patient name to get Patient Detail.....");
        String name = scanner.next();
        for (Long patientId : patientMap.keySet()) {
            patient = patientMap.get(patientId);
            if (checkPatientName(name, patient.getPatientName())) {                 // input patient name "Mohan"
                System.out.println(patient);
                b = false;
            }
        }
        if (b) {
            System.out.println("patient detail not exist given name ");
        }
        System.out.println();
    }

    private boolean checkPatientName(String name, String patientName) {
        if (name.equalsIgnoreCase(patientName)) {
            return true;
        }
        return false;
    }

    private void visitDetailForPatientId(Map<Long, VisitLogInformation> visitDetails) {
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Patient Id to get No of Visit .....");
        int patientId = scanner.nextInt();
        VisitLogInformation visitLogInformation;
        for (Long visitId : visitDetails.keySet()) {
            visitLogInformation = visitDetails.get(visitId);
            if (visitLogInformation.getAppointment().getPatient().getPatientId().equals((long) patientId)) {    // input patientId 5L
                System.out.println(visitLogInformation);
                b = false;
            }
        }
        if (b) {
            System.out.println("Visit Details not Exist given Patient Id");
        }
        System.out.println();
    }

    private void displayOutPatientDetail(Map<Long, Patient> patientDetails) {
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patient type OutPatient(OP) to get OutPatient Details .....");
        String patientType = scanner.next();
        for (Long patientId : patientDetails.keySet()) {
            Patient patient = patientDetails.get(patientId);
            if (patient.getPatientType().equalsIgnoreCase(patientType)) {                 // input patientType "OP"
                System.out.println(patient);
                b = false;
            }
        }
        if (b) {
            System.out.println("Entered InPut is Not Valid, no OutPatient");
        }
        System.out.println();
    }

    private void displayInPatientDetail(Map<Long, InPatient> inPatientMap) {
        boolean b = true;
        System.out.println("InPatient Details .....");
        Scanner scanner = new Scanner(System.in);
        String _inPatient = scanner.next();
        Iterator<Long> ipIdentificationNumber = inPatientMap.keySet().iterator();
        InPatient inPatient;
        while (ipIdentificationNumber.hasNext()) {
            inPatient = inPatientMap.get(ipIdentificationNumber.next());
            if (inPatient.getPatient().getPatientType().equalsIgnoreCase(_inPatient)) {
                System.out.println(inPatient.getPatient());
                b = false;
            }
        }
        if (b) {
            System.out.println("No InPatient");
        }
        System.out.println();
    }

    private void followUpVisitPatientDetail(Map<Long, VisitLogInformation> visitDetails) {
        boolean b = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter (true) get patient Detail for follow up visit .....");
        boolean followUpVisit = scanner.nextBoolean();
        for (Long visitId : visitDetails.keySet()) {
            VisitLogInformation _visitLogInformation = visitDetails.get(visitId);
            if (_visitLogInformation.getFollowUpNeed() == followUpVisit) {
                System.out.println(_visitLogInformation.getAppointment().getPatient());
                b = false;
            }
        }
        if (b) {
            System.out.println("InPut is Not Valid");
        }
        System.out.println();
    }

    private void displayPatientByDoctorId(Map<Long, Appointment> appointmentDetails) {
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Doctor Id to get list of patient .....");
        int doctorId = scanner.nextInt();
        for (Long appointmentId : appointmentDetails.keySet()) {
            Appointment appointment = appointmentDetails.get(appointmentId);
            if (appointment.getDoctor().getDoctorId().equals((long) doctorId)) {    // display patient details by doctorId 2L
                System.out.println(appointment.getPatient());
                b = false;
            }
        }
        if (b) {
            System.out.println("Patient detail not exist given doctor id");
        }
        System.out.println();
    }

    private void todayVisitedPatientDetail(Map<Long, VisitLogInformation> visitDetails) {
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current date, to get today visited patient detail .....");
        String todayDate = scanner.next();
        VisitLogInformation _visitLogInformation;
        for (Long visitId : visitDetails.keySet()) {
            _visitLogInformation = visitDetails.get(visitId);
            Date date = _visitLogInformation.getAppointment().getDateOfVisit();
            String dateOne = get(date);
            String dateTwo = get(Calendar.getInstance().getTime());
            if (dateOne.equals(todayDate)) {
                System.out.println(_visitLogInformation.getAppointment().getPatient());    // displayed today visited patient details
                b = false;
            }
        }


        if (b) {
            System.out.println("Patient detail not exist given doctor id");
        }

    }

    private String get(Date date) {
        String _date;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        _date = dateFormat.format(date);

        return _date;
    }

    private void visitDetailGivenDateRange(Map<Long, VisitLogInformation> visitDetails) {
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Start and End Date to get Visit details given date range.....");
        System.out.println("Enter Start Date .....");
        String dateOne = scanner.next();
        System.out.println("Enter End Date.....");
        String dateTwo = scanner.next();
        Iterator<Long> visitId = visitDetails.keySet().iterator();
        VisitLogInformation logInformation;
        while (visitId.hasNext()) {
            logInformation = visitDetails.get(visitId.next());
            Date visitDate = logInformation.getAppointment().getDateOfVisit();
            Date startDate = getDate(dateOne);  // VisitLogInformation between 2021/1/1 to 2021/7/12
            Date endDate = getDate(dateTwo);
            if (visitDate.after(startDate) && visitDate.before(endDate)) {
                System.out.println(logInformation);
                b = false;
            }
        }
        System.out.println();
        if (b) {
            System.out.println("Patient detail not exist given doctor id");
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

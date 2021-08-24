package business;

import entity.Appointment;
import entity.InPatient;
import entity.Patient;
import entity.VisitLogInformation;
import hospitalmanagementsystem.HospitalManagementSystem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ReportBO extends HospitalManagementSystem {

    public void generateHospitalReport(Map<Long, Patient> patientDetails, Map<Long, Appointment> appointmentDetails,
                                       Map<Long, VisitLogInformation> visitDetails, Map<Long, InPatient> inPatientDetails) {
        boolean valid;
        Scanner scanner = new Scanner(System.in);

        try {
            displayReport();
            do {
                System.out.println("Enter number to get patient report, [ Number between ( 1 to 9 )] ");
                int number = scanner.nextInt();
                if (number >= 1 && number <= 9) {
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
                    if (number == 9) {
                        displayPatientDetailForFollowUpVisitDate(visitDetails);
                        continue;
                    }
                } else
                    System.out.println("Selected Invalid Option ");
                valid = false;
            } while (valid);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void displayPatientDetailForFollowUpVisitDate(Map<Long, VisitLogInformation> visitDetails) {
        boolean isValid = true;
        Scanner scanner = new Scanner(System.in);
        VisitLogInformation visitLogInformation;

        System.out.println();
        System.out.print("Enter date to get follow up visit Patient Detail, Date format ( yyyy/MM/dd ) ... ");
        String date = scanner.next();
        for (Long visitId : visitDetails.keySet()) {
            visitLogInformation = visitDetails.get(visitId);
            if (get(visitLogInformation.getAppointment().getDateOfVisit()).equals(date)) {                // input patient name "Mohan"
                System.out.println(visitLogInformation.getAppointment().getPatient());
                isValid = false;
            }
        }
        if (isValid) {
            System.out.println("followup visit Patient Detail not exist given date ");
        }
        System.out.println();

    }


    private void displayPatientDetail(Map<Long, Patient> patientMap) {
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        Patient patient;

        System.out.println();
        System.out.print("Enter Patient name to get Patient Detail ... ");
        String name = scanner.next();
        for (Long patientId : patientMap.keySet()) {
            patient = patientMap.get(patientId);
            if (patient.getPatientName().equalsIgnoreCase(name)) {                 // input patient name "Mohan"
                System.out.println(patient);
                b = false;
            }
        }
        if (b) {
            System.out.println("patient detail not exist given name ");
        }
        System.out.println();
    }


    private void visitDetailForPatientId(Map<Long, VisitLogInformation> visitDetails) {
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Patient Id to get No of Visit ... ");
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
        for (Long patientId : patientDetails.keySet()) {
            Patient patient = patientDetails.get(patientId);
            if (patient.getPatientType().equalsIgnoreCase("OP")) {                 // input patientType "OP"
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
        Iterator<Long> ipIdentificationNumber = inPatientMap.keySet().iterator();
        InPatient inPatient;
        while (ipIdentificationNumber.hasNext()) {
            inPatient = inPatientMap.get(ipIdentificationNumber.next());
            if (inPatient.getPatient().getPatientType().equalsIgnoreCase("IP")) {
                System.out.println(inPatient.getPatient());
                b = false;
            }
        }
        if (b) {
            System.out.println("InPatient not Exist");
        }
        System.out.println();
    }

    private void followUpVisitPatientDetail(Map<Long, VisitLogInformation> visitDetails) {
        boolean b = false;
        for (Long visitId : visitDetails.keySet()) {
            VisitLogInformation _visitLogInformation = visitDetails.get(visitId);
            if (_visitLogInformation.getFollowUpNeed()) {
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
        System.out.print("Enter Doctor Id to get list of patient ... ");
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
        System.out.print("Enter current date, to get today visited patient detail date format ( yyyy/MM/dd ) ... ");
        String todayDate = scanner.next();
        VisitLogInformation _visitLogInformation;
        for (Long visitId : visitDetails.keySet()) {
            _visitLogInformation = visitDetails.get(visitId);
            Date date = _visitLogInformation.getAppointment().getDateOfVisit();
            String visitDate = get(date);
            String dateTwo = get(Calendar.getInstance().getTime());
            if (visitDate.equals(todayDate)) {
                System.out.println(_visitLogInformation.getAppointment().getPatient());    // displayed today visited patient details
                b = false;
            }
        }
        if (b) {
            System.out.println("Patient not visited for today ");
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
        System.out.println("Enter Start and End Date to get Visit details given date range ... ");
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
            System.out.println("Patient detail not exist given date range");
        }

    }

    public static Date getDate(String s) {
        boolean isValid = false;
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date date = null;
        do {
            try {
                date = format.parse(s);
            } catch (ParseException e) {
                System.out.println("Enter valid Date format ( yyyy/MM/dd ) ");
                isValid = true;
            }

        } while (isValid);
        return date;
    }

    private void displayReport() {
        System.out.println("PATIENT REPORT \n");
        Map<Integer, String> reportMap = new HashMap<>();
        reportMap.put(1, "Display patient details for the patient name");
        reportMap.put(2, "Display the list of visit for the patient id");
        reportMap.put(3, "Display only the out-patient");
        reportMap.put(4, "Display all patient who are in-patient");
        reportMap.put(5, "Display the list of patient who needs the follow up visit");
        reportMap.put(6, "Display the list of patient by doctor id");
        reportMap.put(7, "Display visited patient for given date");
        reportMap.put(8, "Display the visit details for given date range");
        reportMap.put(9, "Display the list of patient who needs the follow up visit given date \n");
        for (Map.Entry<Integer, String> report : reportMap.entrySet()) {
            System.out.println(report.getKey() + "  " + report.getValue());
        }
    }

}

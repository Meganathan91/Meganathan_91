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
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter patient id to get Patient Detail.....");
        int _patientId = scanner.nextInt();
        Patient patient = null;
        if (patientMap.containsKey((long)_patientId)) {                                  // input patientId 2L
            patient = patientMap.get((long)_patientId);
            System.out.println(patient);
        } else {
            System.out.println("Entered InValid Patient Id");
        }

        System.out.println();
        System.out.println("Enter Patient name to get Patient Detail.....");
        String name = scanner.next();
        for (Long patientId : patientMap.keySet()) {
            patient = patientMap.get(patientId);
            if (name.equalsIgnoreCase(patient.getPatientName())) {                 // input patient name "Mohan"
                System.out.println(patient);
            } else {
                System.out.println("Entered incorrect Patient Name");
                break;
            }
        }
        System.out.println();
    }

    private void visitDetailForPatientId(Map<Long, VisitLogInformation> visitDetails) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Patient Id to get No of Visit .....");
        int patientId = scanner.nextInt();
        VisitLogInformation visitLogInformation;
        for (Long visitId : visitDetails.keySet()) {
            visitLogInformation = visitDetails.get(visitId);
            if (visitLogInformation.getAppointment().getPatient().getPatientId().equals((long)patientId)) {    // input patientId 5L
                System.out.println(visitLogInformation);
            } else {
                System.out.println("Visit Details not Exist given Patient Id");
                break;
            }
        }
        System.out.println();
    }

    private void displayOutPatientDetail(Map<Long, Patient> patientDetails) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patient type OutPatient(OP) to get OutPatient Details .....");
        String patientType = scanner.next();
        for (Long patientId : patientDetails.keySet()) {
            Patient patient = patientDetails.get(patientId);
            if (patient.getPatientType().equalsIgnoreCase(patientType)) {                 // input patientType "OP"
                System.out.println(patient);
            } else {
                System.out.println("Entered InPut is Not Valid, no OutPatient");
                break;
            }
        }
        System.out.println();
    }

    private void displayInPatientDetail(Map<Long, InPatient> inPatientMap) {
        System.out.println("InPatient Details .....");
        Scanner scanner = new Scanner(System.in);
        String _inPatient = scanner.next();
        Iterator<Long> ipIdentificationNumber = inPatientMap.keySet().iterator();
        InPatient inPatient;
        while (ipIdentificationNumber.hasNext()) {
            inPatient = inPatientMap.get(ipIdentificationNumber.next());
            if (inPatient.getPatient().getPatientType().equalsIgnoreCase(_inPatient)) {
                System.out.println(inPatient.getPatient());
            } else {
                System.out.println("No InPatient");
                break;
            }
        }
        System.out.println();
    }

    private void followUpVisitPatientDetail(Map<Long, VisitLogInformation> visitDetails) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter (true) get patient Detail for follow up visit .....");
        boolean followUpVisit = scanner.nextBoolean();
        for (Long visitId : visitDetails.keySet()) {
            VisitLogInformation _visitLogInformation = visitDetails.get(visitId);
            if (_visitLogInformation.getFollowUpNeed() == followUpVisit) {
                System.out.println(_visitLogInformation.getAppointment().getPatient());
            } else {
                System.out.println("InPut is Not Valid");
                break;
            }
        }
        System.out.println();
    }

    private void displayPatientByDoctorId(Map<Long, Appointment> appointmentDetails) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Doctor Id to get list of patient .....");
        int doctorId = scanner.nextInt();
        for (Long appointmentId : appointmentDetails.keySet()) {
            Appointment appointment = appointmentDetails.get(appointmentId);
            if (appointment.getDoctor().getDoctorId().equals((long)doctorId)) {    // display patient details by doctorId 2L
                System.out.println(appointment.getPatient());
            } else {
                System.out.println("Patient detail not exist given doctor id");
                break;
            }
        }
        System.out.println();
    }

    private void todayVisitedPatientDetail(Map<Long, VisitLogInformation> visitDetails) {
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
            } else {
                System.out.println("Given date not valid");
                break;
            }
        }
        System.out.println();
    }

    private String get(Date date) {
        String _date = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        _date = dateFormat.format(date);

        return _date;
    }

    private void visitDetailGivenDateRange(Map<Long, VisitLogInformation> visitDetails) {
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
                } else {
                    System.out.println("Given invalid date range");
                    break;
                }
            }
        System.out.println();
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

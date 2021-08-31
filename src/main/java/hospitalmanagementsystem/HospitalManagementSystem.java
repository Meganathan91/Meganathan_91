package hospitalmanagementsystem;

import business.AppointmentBO;
import business.InPatientBO;
import business.ReportBO;
import business.VisitLogInformationBO;
import entity.*;
import utility.DateUtility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HospitalManagementSystem {

    static private Map<Long, Hospital> hospitalDetails;

    static private Map<Long, Doctor> doctorDetails;

    static private Map<Long, Patient> patientDetails;

    static private Map<Long, Appointment> appointmentDetails;

    static private Map<Long, Medicine> medicineDetails;

    static private Map<Long, VisitLogInformation> visitDetails;

    static private Map<Long, InPatient> inPatientDetails;

    static private Map<Long, Bed> bedDetails;

    static private List<Medicine> medicineList;

    static {

        hospitalDetails = new HashMap<>();

        Hospital hospital = getHospitalDetail(1L, "Kauvery", "Chennai");
        hospitalDetails.put(hospital.getHospitalId(), hospital);

        Doctor cardiologistDoctor = getDoctor(1L, "Rahim", "Cardiologists");
        Doctor orthopedicDoctor = getDoctor(2L, "Vishal", "Orthopedic");
        Doctor dentistDoctor = getDoctor(3L, "Suganya", "Dentist");
        Doctor neurologistDoctor = getDoctor(4L, "Anu", "Neurologist");
        Doctor pulmonologistDoctor = getDoctor(5L, "VelRaj", "Pulmonologist");

        doctorDetails = new HashMap<>();
        doctorDetails.put(cardiologistDoctor.getDoctorId(), cardiologistDoctor);
        doctorDetails.put(orthopedicDoctor.getDoctorId(), orthopedicDoctor);
        doctorDetails.put(dentistDoctor.getDoctorId(), dentistDoctor);
        doctorDetails.put(neurologistDoctor.getDoctorId(), neurologistDoctor);
        doctorDetails.put(pulmonologistDoctor.getDoctorId(), pulmonologistDoctor);

        Patient patientSelvam = getPatient(1L, "Selvam", DateUtility.getDate(1991, 2, 1), "9870654320", "Trichy", "OP");
        Patient patientRagu = getPatient(2L, "Ragu", DateUtility.getDate(1989, 5, 10), "7639238764", "Chennai", "OP");
        Patient patientVimal = getPatient(3L, "Vimal", DateUtility.getDate(1995, 6, 13), "9790654302", "Salem", "OP");
        Patient patientAnu = getPatient(4L, "Anu", DateUtility.getDate(1998, 9, 17), "9790654320", "Thanjavur", "OP");
        Patient patientMohan = getPatient(5L, "Mohan", DateUtility.getDate(1993, 4, 21), "9500768912", "kumbakonam", "OP");
        Patient patientRajini = getPatient(6L, "Rajini", DateUtility.getDate(2000, 8, 8), "6345876301", "Madurai", "OP");
        Patient patientSomu = getPatient(7L, "Rajini", DateUtility.getDate(1981, 11, 19), "9790238764", "Ariyalur", "OP");
        Patient patientSelvi = getPatient(8L, "Selvi", DateUtility.getDate(1975, 12, 16), "7639128707", "Karur", "OP");

        patientDetails = new HashMap<>();
        patientDetails.put(patientSelvam.getPatientId(), patientSelvam);
        patientDetails.put(patientRagu.getPatientId(), patientRagu);
        patientDetails.put(patientVimal.getPatientId(), patientVimal);
        patientDetails.put(patientAnu.getPatientId(), patientAnu);
        patientDetails.put(patientMohan.getPatientId(), patientMohan);
        patientDetails.put(patientRajini.getPatientId(), patientRajini);
        patientDetails.put(patientSomu.getPatientId(), patientSomu);
        patientDetails.put(patientSelvi.getPatientId(), patientSelvi);

        Appointment appointmentOne = getAppointment(1L, 1L, 2L, DateUtility.getDate(2021, 3, 1), "HeartPain", 120.5, 90.5, true);
        Appointment appointmentTwo = getAppointment(2L, 1L, 2L, DateUtility.getDate(2021, 2, 13), "BonesPain", 140.7, 89.1, true);
        Appointment appointmentThree = getAppointment(3L, 3L, 3L, DateUtility.getDate(2021, 3, 9), "TeethPain", 135.3, 81.4, true);
        Appointment appointmentFour = getAppointment(4L, 1L, 4L, DateUtility.getDate(2021, 7, 30), "Headaches", 154.4, 79.5, true);
        Appointment appointmentFive = getAppointment(5L, 5L, 5L, DateUtility.getDate(2021, 9, 30), "LungCancer", 120.5, 90.5, true);
        Appointment appointmentSix = getAppointment(6L,1L,1L,DateUtility.getDate(2021, 11, 30),"HeartPain",110.5,80.5,true);
        Appointment appointmentSeven = getAppointment(7L,4L,2L,DateUtility.getDate(2021, 7, 30), "HeartPain", 120.7, 76.1, true);
        Appointment appointmentEight = getAppointment(8L,5L,5L,DateUtility.getDate(2021, 8, 30), "HeartPain",119.5,81.5,true);
        Appointment appointmentNine = getAppointment(9L,2L, 2L,DateUtility.getDate(2021, 10, 30),"BonesPain", 120.5, 90.5, true);
        Appointment appointmentTen = getAppointment(10L,2L,5L,DateUtility.getDate(2021, 3, 21), "BonesPain",135.5,76.5,true);

        appointmentDetails = new HashMap<>();
        appointmentDetails.put(appointmentOne.getAppointmentId(), appointmentOne);
        appointmentDetails.put(appointmentTwo.getAppointmentId(), appointmentTwo);
        appointmentDetails.put(appointmentThree.getAppointmentId(), appointmentThree);
        appointmentDetails.put(appointmentFour.getAppointmentId(), appointmentFour);
        appointmentDetails.put(appointmentFive.getAppointmentId(), appointmentFive);
        appointmentDetails.put(appointmentSix.getAppointmentId(), appointmentSix);
        appointmentDetails.put(appointmentSeven.getAppointmentId(), appointmentSeven);
        appointmentDetails.put(appointmentEight.getAppointmentId(), appointmentEight);
        appointmentDetails.put(appointmentNine.getAppointmentId(), appointmentNine);
        appointmentDetails.put(appointmentTen.getAppointmentId(), appointmentTen);

        Medicine medicineForCardiologist = getMedicines(1L,"HeartPain","Aspirin","a01",DateUtility.getDate(2025, 7, 12));
        Medicine medicineForOrthopedic = getMedicines(2L,"BonesPain","Methocarbamol","m02",DateUtility.getDate(2024, 3, 8));
        Medicine medicineForDentist = getMedicines(3L,"TeethPain","Clindamycin","c03",DateUtility.getDate(2023, 6, 10));
        Medicine medicineForNeurologist = getMedicines(4L,"BrainPain","Lamotrigine","l04",DateUtility.getDate(2022, 2, 8));
        Medicine medicineForPulmonologist = getMedicines(5L,"lung cancer","ciclesonide","c05",DateUtility.getDate(2024, 11, 12));

        medicineDetails = new HashMap<>();
        medicineDetails.put(medicineForCardiologist.getMedicineId(), medicineForCardiologist);
        medicineDetails.put(medicineForOrthopedic.getMedicineId(), medicineForOrthopedic);
        medicineDetails.put(medicineForDentist.getMedicineId(), medicineForDentist);
        medicineDetails.put(medicineForNeurologist.getMedicineId(), medicineForNeurologist);
        medicineDetails.put(medicineForPulmonologist.getMedicineId(), medicineForPulmonologist);

        Bed bedOne = getBed(1L, "Manual Bed", "A");
        Bed bedTwo = getBed(2L, "Manual Bed", "B");
        Bed bedThree = getBed(3l, "Manual Bed","C");
        Bed bedFour = getBed(4l, "Manual Bed","D");
        Bed bedFive = getBed(5l, "Manual Bed","E");

        bedDetails = new HashMap<>();
        bedDetails.put(bedOne.getBedId(), bedOne);
        bedDetails.put(bedTwo.getBedId(), bedTwo);
        bedDetails.put(bedThree.getBedId(), bedThree);
        bedDetails.put(bedFour.getBedId(), bedFour);
        bedDetails.put(bedFive.getBedId(), bedFive);

        inPatientDetails = new HashMap<>();
    }

    private static Bed getBed(Long bedId, String bedType, String roomName) {

        Bed bed = new Bed();
        bed.setBedId(bedId);
        bed.setBedType(bedType);
        bed.setRoomName(roomName);

        return bed;
    }

    private static Medicine getMedicines(Long medicineId, String purposeOfMedicine, String medicineName, String batchNumber, Date expiryDate) {
        Medicine medicine = new Medicine();
        medicine.setMedicineId(medicineId);
        medicine.setPurposeOfMedicine(purposeOfMedicine);
        medicine.setMedicineName(medicineName);
        medicine.setBatchNumber(batchNumber);
        medicine.setExpiryDate(expiryDate);
        return medicine;
    }

    private static Appointment getAppointment(Long appointmentId, Long doctorId, Long patientId, Date dateOfVisit, String purposeOfVisit, double bp, double temperature, boolean isFirstVisit) {
        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentId);
        appointment.setDoctor(doctorDetails.get(doctorId));
        appointment.setPatient(patientDetails.get(patientId));
        appointment.setDateOfVisit(dateOfVisit);
        appointment.setPurposeOfVisit(purposeOfVisit);
        appointment.setBp(bp);
        appointment.setTemperature(temperature);
        appointment.setIsFirstVisit(isFirstVisit);

        return appointment;
    }

    private static Patient getPatient(Long patientId, String name, Date dateOfBirth, String phoneNumber, String location, String patientType) {
        Patient patient = new Patient();
        patient.setPatientId(patientId);
        patient.setPatientName(name);
        patient.setDob(dateOfBirth);
        patient.setPhoneNumber(phoneNumber);
        patient.setAddress(location);
        patient.setPatientType(patientType);
        return patient;
    }

    private static Doctor getDoctor(Long doctorId, String name, String specialisation) {
        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorId);
        doctor.setDoctorName(name);
        doctor.setSpecialisation(specialisation);
        return doctor;
    }

    private static Hospital getHospitalDetail(Long hospitalId, String name, String location) {
        Hospital hospital = new Hospital();
        hospital.setHospitalId(hospitalId);
        hospital.setHospitalName(name);
        hospital.setHospitalLocation(location);
        return hospital;
    }

    static public List<Medicine> getMedicine() {
        int randomNumber;
        medicineList = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 3; i++) {
            randomNumber = random.nextInt(5);
            if (randomNumber == 0) {
                randomNumber += 1;
            }
            if (medicineDetails.containsKey((long) randomNumber)) ;
            medicineList.add(medicineDetails.get((long) randomNumber));
        }

        return medicineList;
    }

    static public void populateVisitInformation() {
        VisitLogInformation heartCheckUp = getVisitInformation(1L, 2L, "any little pain visit again", false, getMedicine());
        VisitLogInformation boneCheckUp = getVisitInformation(2L, 9L, "Every week come for check up", false, getMedicine());
        VisitLogInformation teethCheckUp = getVisitInformation(3L, 10L, "Brush carefully and gently along your gum line", false, getMedicine());
        VisitLogInformation brainCheckUp = getVisitInformation(4L, 3L, "Seek immediately take scan", true, getMedicine());
        VisitLogInformation lungCheckUp = getVisitInformation(5L, 5L, "breathe issue visit immediately and take scan", true, getMedicine());
        VisitLogInformation cavitiesCheckUp = getVisitInformation(6L, 8L, "Brush carefully and gently along your gum line", false, getMedicine());
        VisitLogInformation headCheckUp = getVisitInformation(7L, 7L, "Seek immediately take scan", false, getMedicine());
        VisitLogInformation spirometryCheckUp = getVisitInformation(8L, 6L, "breathe issue visit immediately and take scan", false, getMedicine());

        visitDetails = new HashMap<>();
        visitDetails.put(heartCheckUp.getVisitId(), heartCheckUp);
        visitDetails.put(boneCheckUp.getVisitId(), boneCheckUp);
        visitDetails.put(teethCheckUp.getVisitId(), teethCheckUp);
        visitDetails.put(brainCheckUp.getVisitId(), brainCheckUp);
        visitDetails.put(lungCheckUp.getVisitId(), lungCheckUp);
        visitDetails.put(cavitiesCheckUp.getVisitId(), cavitiesCheckUp);
        visitDetails.put(headCheckUp.getVisitId(), headCheckUp);
        visitDetails.put(spirometryCheckUp.getVisitId(), spirometryCheckUp);

    }

    private static VisitLogInformation getVisitInformation(Long visitId, Long appointmentId, String doctorRecommendation, boolean followUpNeed, List<Medicine> medicine) {
        VisitLogInformation information = new VisitLogInformation();
        information.setVisitId(visitId);
        information.setAppointment(appointmentDetails.get(appointmentId));
        information.setDoctorRecommendation(doctorRecommendation);
        information.setFollowUpNeed(followUpNeed);
        information.setListOfMedicine(medicine);
        return information;
    }

    public static void main(String[] args) {
        try {
            populateVisitInformation();
            AppointmentBO appointmentBO = new AppointmentBO();
            VisitLogInformationBO visitInformation = new VisitLogInformationBO();
            InPatientBO inPatientBO = new InPatientBO();
            ReportBO reportBO = new ReportBO();
            VisitLogInformation visitLogInformation = null;

            Appointment appointment = appointmentBO.createAppointment(2L, patientDetails, 5L, doctorDetails, appointmentDetails);
            if (appointment != null) {
                visitLogInformation = visitInformation.createVisitLogInformation(appointment, visitDetails, medicineList, patientDetails);
            }
            if (visitLogInformation != null && visitLogInformation.getAppointment().getPatient() != null && ("IP").equalsIgnoreCase(visitLogInformation.getAppointment().getPatient().getPatientType())) {
                inPatientBO.patientConvertAsInPatient(visitLogInformation.getAppointment().getPatient(), bedDetails, inPatientDetails);
            }
            reportBO.generateHospitalReport(patientDetails, appointmentDetails, visitDetails, inPatientDetails);
        } catch (Exception e) {
            System.out.println("HMS Exception " + e.getMessage());
        }
    }
}

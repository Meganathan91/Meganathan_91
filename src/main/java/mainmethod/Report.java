package mainmethod;

import businesslogic.AppointmentBO;
import businesslogic.InPatientBO;
import businesslogic.ReportBO;
import businesslogic.VisitInformationBO;
import entity.*;

import java.util.*;

public class Report {

    static private Map<Long, Hospital> hospitalDetails;
    static private Hospital hospital;

    static private Map<Long, Doctor> doctorDetails;
    static private Doctor cardiologistDoctor;
    static private Doctor orthopedicDoctor;
    static private Doctor dentistDoctor;
    static private Doctor neurologistDoctor;
    static private Doctor pulmonologistDoctor;

    static private Map<Long, Patient> patientDetails;
    static private Patient patientSelvam;
    static private Patient patientRagu;
    static private Patient patientVimal;
    static private Patient patientAnu;
    static private Patient patientMohan;
    static private Patient patientRajini;
    static private Patient patientSomu;
    static private Patient patientSelvi;

    static private Map<Long, Appointment> appointmentDetails;
    static private Appointment appointmentOne;
    static private Appointment appointmentTwo;
    static private Appointment appointmentThree;
    static private Appointment appointmentFour;
    static private Appointment appointmentFive;
    static private Appointment appointmentSix;
    static private Appointment appointmentSeven;
    static private Appointment appointmentEight;
    static private Appointment appointmentNine;
    static private Appointment appointmentTen;
    static private Appointment appointmentEleven;
    static private Appointment appointmentTwelve;
    static private Appointment appointmentThirteen;
    static private Appointment appointmentFourteen;

    static private Map<Long, Medicine> medicineDetails;
    static private Medicine medicineForCardiologist;
    static private Medicine medicineForOrthopedic;
    static private Medicine medicineForDentist;
    static private Medicine medicineForNeurologist;
    static private Medicine medicineForPulmonologist;

    static private Map<Long, VisitLogInformation> visitDetails;
    static private VisitLogInformation heartCheckUp;
    static private VisitLogInformation boneCheckUp;
    static private VisitLogInformation teethCheckUp;
    static private VisitLogInformation brainCheckUp;
    static private VisitLogInformation lungCheckUp;
    static private VisitLogInformation cavitiesCheckUp;
    static private VisitLogInformation headCheckUp;
    static private VisitLogInformation spirometryCheckUp;

    static private Map<Long, InPatient> inPatientDetails;
    static private InPatient patient;

    static private Map<Long, Bed> bedDetails;
    static private Bed bedOne;
    static private Bed bedTwo;
    static private Bed bedThree;
    static private Bed bedFour;
    static private Bed bedFive;
    static private Bed bedSix;
    static private Bed bedSeven;
    static private Bed bedEight;

    private static List<Medicine> medicineList;

    private static Calendar calendar;


    static {

        hospitalDetails = new HashMap<>();

        hospital = new Hospital();
        hospital.setHospitalId(1l);
        hospital.setHospitalName("Kauvery");
        hospital.setHospitalLocation("Chennai");

        hospitalDetails.put(hospital.getHospitalId(), hospital);

        cardiologistDoctor = new Doctor();
        cardiologistDoctor.setDoctorId(1l);
        cardiologistDoctor.setDoctorName("Rahim");
        cardiologistDoctor.setSpecialisation("Cardiologists");

        orthopedicDoctor = new Doctor();
        orthopedicDoctor.setDoctorId(2l);
        orthopedicDoctor.setDoctorName("Vishal");
        orthopedicDoctor.setSpecialisation("Orthopedic");

        dentistDoctor = new Doctor();
        dentistDoctor.setDoctorId(3l);
        dentistDoctor.setDoctorName("Suganya");
        dentistDoctor.setSpecialisation("Dentist");

        neurologistDoctor = new Doctor();
        neurologistDoctor.setDoctorId(4l);
        neurologistDoctor.setDoctorName("Anu");
        neurologistDoctor.setSpecialisation("Neurologist");

        pulmonologistDoctor = new Doctor();
        pulmonologistDoctor.setDoctorId(5l);
        pulmonologistDoctor.setDoctorName("VelRaj");
        pulmonologistDoctor.setSpecialisation("Pulmonologist");

        doctorDetails = new HashMap<>();
        doctorDetails.put(cardiologistDoctor.getDoctorId(), cardiologistDoctor);
        doctorDetails.put(orthopedicDoctor.getDoctorId(), orthopedicDoctor);
        doctorDetails.put(dentistDoctor.getDoctorId(), dentistDoctor);
        doctorDetails.put(neurologistDoctor.getDoctorId(), neurologistDoctor);
        doctorDetails.put(pulmonologistDoctor.getDoctorId(), pulmonologistDoctor);


        calendar = Calendar.getInstance();
        calendar.set(1991, 1, 1, 12, 10, 7);
        Date date = calendar.getTime();
        patientSelvam = new Patient();
        patientSelvam.setPatientId(1l);
        patientSelvam.setPatientName("Selvam");
        patientSelvam.setDob(date);
        patientSelvam.setPhoneNumber("9870654320");
        patientSelvam.setAddress("trichy");
        patientSelvam.setPatientType("OP");

        calendar = Calendar.getInstance();
        calendar.set(1989, 4, 10, 5, 30, 12);
        Date date1 = calendar.getTime();
        patientRagu = new Patient();
        patientRagu.setPatientId(2l);
        patientRagu.setPatientName("Ragu");
        patientRagu.setDob(date1);
        patientRagu.setPhoneNumber("7639238764");
        patientRagu.setAddress("Chennai");
        patientRagu.setPatientType("OP");


        calendar = Calendar.getInstance();
        calendar.set(1995, 6, 13, 7, 25, 5);
        Date date2 = calendar.getTime();
        patientVimal = new Patient();
        patientVimal.setPatientId(3l);
        patientVimal.setPatientName("Vimal");
        patientVimal.setDob(date2);
        patientVimal.setPhoneNumber("9790654302");
        patientVimal.setAddress("Salem");
        patientVimal.setPatientType("OP");

        calendar = Calendar.getInstance();
        calendar.set(1998, 8, 17, 2, 55, 10);
        Date date3 = calendar.getTime();
        patientAnu = new Patient();
        patientAnu.setPatientId(4l);
        patientAnu.setPatientName("Anu");
        patientAnu.setDob(date3);
        patientAnu.setPhoneNumber("9790654320");
        patientAnu.setAddress("Thanjavur");
        patientAnu.setPatientType("OP");

        calendar = Calendar.getInstance();
        calendar.set(1993, 3, 21, 8, 45, 25);
        Date date4 = calendar.getTime();
        patientMohan = new Patient();
        patientMohan.setPatientId(5l);
        patientMohan.setPatientName("Mohan");
        patientMohan.setDob(date4);
        patientMohan.setPhoneNumber("9500768912");
        patientMohan.setAddress("kumbakonam");
        patientMohan.setPatientType("OP");

        calendar = Calendar.getInstance();
        calendar.set(2000, 7, 8, 5, 10, 43);
        Date date5 = calendar.getTime();
        patientRajini = new Patient();
        patientRajini.setPatientId(6l);
        patientRajini.setPatientName("Rajini");
        patientRajini.setDob(date5);
        patientRajini.setPhoneNumber("6345876301");
        patientRajini.setAddress("Madurai");
        patientRajini.setPatientType("OP");

        calendar = Calendar.getInstance();
        calendar.set(1981, 10, 19, 10, 20, 60);
        Date date6 = calendar.getTime();
        patientSomu = new Patient();
        patientSomu.setPatientId(7l);
        patientSomu.setPatientName("Somu");
        patientSomu.setDob(date6);
        patientSomu.setAddress("Ariyalur");
        patientSomu.setPhoneNumber("9790238764");
        patientSomu.setPatientType("OP");

        calendar = Calendar.getInstance();
        calendar.set(1975, 11, 16, 9, 20, 51);
        Date date7 = calendar.getTime();
        patientSelvi = new Patient();
        patientSelvi.setPatientId(8l);
        patientSelvi.setPatientName("Selvi");
        patientSelvi.setDob(date7);
        patientSelvi.setAddress("Karur");
        patientSelvi.setPhoneNumber("7639128707");
        patientSelvi.setPatientType("OP");

        patientDetails = new HashMap<>();
        calendar = Calendar.getInstance();
        calendar.set(1997, 2, 9, 6, 19);
        Date date8 = calendar.getTime();
        patientDetails.put(patientSelvam.getPatientId(), patientSelvam);
        patientDetails.put(patientRagu.getPatientId(), patientRagu);
        patientDetails.put(patientVimal.getPatientId(), patientVimal);
        patientDetails.put(patientAnu.getPatientId(), patientAnu);
        patientDetails.put(patientMohan.getPatientId(), patientMohan);
        patientDetails.put(patientRajini.getPatientId(), patientRajini);
        patientDetails.put(patientSomu.getPatientId(), patientSomu);
        patientDetails.put(patientSelvi.getPatientId(), patientSelvi);

        calendar = Calendar.getInstance();
        calendar.set(2021, 1, 1, 1, 10);
        Date date22 = calendar.getTime();
        appointmentOne = new Appointment();
        appointmentOne.setAppointmentId(1l);
        appointmentOne.setDoctor(doctorDetails.get(1l));
        appointmentOne.setPatient(patientDetails.get(3l));
        appointmentOne.setDateOfVisit(date22);
        appointmentOne.setPurposeOfVisit("HeartPain");
        appointmentOne.setBp(120.5);
        appointmentOne.setTemperature(90.5);
        appointmentOne.setIsFirstVisit(false);

        calendar = Calendar.getInstance();
        calendar.set(2021, 2, 3, 4, 35);
        Date date9 = calendar.getTime();
        appointmentTwo = new Appointment();
        appointmentTwo.setAppointmentId(2l);
        appointmentTwo.setDoctor(doctorDetails.get(1l));
        appointmentTwo.setPatient(patientDetails.get(2l));
        appointmentTwo.setDateOfVisit(date9);
        appointmentTwo.setPurposeOfVisit("BonesPain");
        appointmentTwo.setBp(140.7);
        appointmentTwo.setTemperature(89.1);
        appointmentTwo.setIsFirstVisit(false);

        calendar = Calendar.getInstance();
        calendar.set(2021, 3, 3, 3, 49);
        Date date10 = calendar.getTime();
        appointmentThree = new Appointment();
        appointmentThree.setAppointmentId(3l);
        appointmentThree.setDoctor(doctorDetails.get(3l));
        appointmentThree.setPatient(patientDetails.get(3l));
        appointmentThree.setDateOfVisit(date10);
        appointmentThree.setPurposeOfVisit("TeethPain");
        appointmentThree.setBp(135.3);
        appointmentThree.setTemperature(81.4);
        appointmentThree.setIsFirstVisit(true);

        calendar = Calendar.getInstance();
        calendar.set(2021, 4, 4, 4, 27);
        Date date11 = calendar.getTime();
        appointmentFour = new Appointment();
        appointmentFour.setAppointmentId(4l);
        appointmentFour.setDoctor(doctorDetails.get(1l));
        appointmentFour.setPatient(patientDetails.get(4l));
        appointmentFour.setDateOfVisit(date11);
        appointmentFour.setPurposeOfVisit("Headaches");
        appointmentFour.setBp(154.4);
        appointmentFour.setTemperature(79.5);
        appointmentFour.setIsFirstVisit(false);

        appointmentFive = new Appointment();
        appointmentFive.setAppointmentId(5l);
        appointmentFive.setDoctor(doctorDetails.get(5l));
        appointmentFive.setPatient(patientDetails.get(5l));
        appointmentFive.setDateOfVisit(Calendar.getInstance().getTime());
        appointmentFive.setPurposeOfVisit("LungCancer");
        appointmentFive.setBp(120.5);
        appointmentFive.setTemperature(90.5);
        appointmentFive.setIsFirstVisit(true);

        calendar = Calendar.getInstance();
        calendar.set(2021, 9, 5, 8, 12);
        appointmentSix = new Appointment();
        appointmentSix.setAppointmentId(6l);
        appointmentSix.setDoctor(doctorDetails.get(1l));
        appointmentSix.setPatient(patientDetails.get(1l));
        appointmentSix.setDateOfVisit(calendar.getTime());
        appointmentSix.setPurposeOfVisit("HeartPain");
        appointmentSix.setBp(110.5);
        appointmentSix.setTemperature(80.5);
        appointmentSix.setIsFirstVisit(false);

        calendar = Calendar.getInstance();
        calendar.set(2021, 7, 10, 6, 39);
        Date date14 = calendar.getTime();
        appointmentSeven = new Appointment();
        appointmentSeven.setAppointmentId(7l);
        appointmentSeven.setDoctor(doctorDetails.get(1l));
        appointmentSeven.setPatient(patientDetails.get(1l));
        appointmentSeven.setDateOfVisit(date14);
        appointmentSeven.setPurposeOfVisit("HeartPain");
        appointmentSeven.setBp(120.7);
        appointmentSeven.setTemperature(76.1);
        appointmentSeven.setIsFirstVisit(false);

        calendar = Calendar.getInstance();
        calendar.set(2021, 11, 12, 5, 53);
        Date date15 = calendar.getTime();
        appointmentEight = new Appointment();
        appointmentEight.setAppointmentId(8l);
        appointmentEight.setDoctor(doctorDetails.get(1l));
        appointmentEight.setPatient(patientDetails.get(5l));
        appointmentEight.setDateOfVisit(date15);
        appointmentEight.setPurposeOfVisit("HeartPain");
        appointmentEight.setBp(135.3);
        appointmentEight.setTemperature(81.4);
        appointmentEight.setIsFirstVisit(false);

        calendar = Calendar.getInstance();
        calendar.set(2021, 06, 6, 4, 34);
        Date date16 = calendar.getTime();
        appointmentNine = new Appointment();
        appointmentNine.setAppointmentId(9l);
        appointmentNine.setDoctor(doctorDetails.get(2l));
        appointmentNine.setPatient(patientDetails.get(2l));
        appointmentNine.setDateOfVisit(date16);
        appointmentNine.setPurposeOfVisit("BonesPain");
        appointmentNine.setBp(154.4);
        appointmentNine.setTemperature(79.5);
        appointmentNine.setIsFirstVisit(false);

        calendar = Calendar.getInstance();
        calendar.set(2021, 8, 5, 7, 27);
        Date date17 = calendar.getTime();
        appointmentTen = new Appointment();
        appointmentTen.setAppointmentId(10l);
        appointmentTen.setDoctor(doctorDetails.get(2l));
        appointmentTen.setPatient(patientDetails.get(2l));
        appointmentTen.setDateOfVisit(Calendar.getInstance().getTime());
        appointmentTen.setPurposeOfVisit("BonesPain");
        appointmentTen.setBp(120.5);
        appointmentTen.setTemperature(90.5);
        appointmentTen.setIsFirstVisit(false);

        calendar = Calendar.getInstance();
        calendar.set(2021, 7, 21, 8, 21);
        Date date18 = calendar.getTime();
        appointmentEleven = new Appointment();
        appointmentEleven.setAppointmentId(11l);
        appointmentEleven.setDoctor(doctorDetails.get(2l));
        appointmentEleven.setPatient(patientDetails.get(2l));
        appointmentEleven.setDateOfVisit(date18);
        appointmentEleven.setPurposeOfVisit("BonesPain");
        appointmentEleven.setBp(135.5);
        appointmentEleven.setTemperature(76.5);
        appointmentEleven.setIsFirstVisit(false);

        calendar = Calendar.getInstance();
        calendar.set(2021, 5, 3, 9, 47);
        Date date19 = calendar.getTime();
        appointmentTwelve = new Appointment();
        appointmentTwelve.setAppointmentId(12l);
        appointmentTwelve.setDoctor(doctorDetails.get(2l));
        appointmentTwelve.setPatient(patientDetails.get(2l));
        appointmentTwelve.setDateOfVisit(date19);
        appointmentTwelve.setPurposeOfVisit("BonesPain");
        appointmentTwelve.setBp(140.7);
        appointmentTwelve.setTemperature(89.1);
        appointmentTwelve.setIsFirstVisit(false);

        calendar = Calendar.getInstance();
        calendar.set(2021, 9, 6, 7, 27);
        Date date20 = calendar.getTime();
        appointmentThirteen = new Appointment();
        appointmentThirteen.setAppointmentId(13l);
        appointmentThirteen.setDoctor(doctorDetails.get(3l));
        appointmentThirteen.setPatient(patientDetails.get(5l));
        appointmentThirteen.setDateOfVisit(date20);
        appointmentThirteen.setPurposeOfVisit("TeethPain");
        appointmentThirteen.setBp(135.3);
        appointmentThirteen.setTemperature(81.4);
        appointmentThirteen.setIsFirstVisit(false);

        calendar = Calendar.getInstance();
        calendar.set(2021, 3, 9, 3, 17);
        Date date21 = calendar.getTime();
        appointmentFourteen = new Appointment();
        appointmentFourteen.setAppointmentId(14l);
        appointmentFourteen.setDoctor(doctorDetails.get(4l));
        appointmentFourteen.setPatient(patientDetails.get(5l));
        appointmentFourteen.setDateOfVisit(date21);
        appointmentFourteen.setPurposeOfVisit("Headaches");
        appointmentFourteen.setBp(154.4);
        appointmentFourteen.setTemperature(79.5);
        appointmentFourteen.setIsFirstVisit(false);

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
        appointmentDetails.put(appointmentEleven.getAppointmentId(), appointmentEleven);
        appointmentDetails.put(appointmentTwelve.getAppointmentId(), appointmentTwelve);
        appointmentDetails.put(appointmentThirteen.getAppointmentId(), appointmentThirteen);
        appointmentDetails.put(appointmentFourteen.getAppointmentId(), appointmentFourteen);

        calendar = Calendar.getInstance();
        calendar.set(2025, 12, 12, 6, 30, 27);
        medicineForCardiologist = new Medicine();
        medicineForCardiologist.setMedicineId(1l);
        medicineForCardiologist.setPurposeOfMedicine("HeartPain");
        medicineForCardiologist.setMedicineName("Aspirin");
        medicineForCardiologist.setBatchNumber("a01");
        medicineForCardiologist.setExpiryDate(calendar.getTime());

        calendar = Calendar.getInstance();
        calendar.set(2024, 2, 8, 10, 29, 59);
        medicineForOrthopedic = new Medicine();
        medicineForOrthopedic.setMedicineId(2l);
        medicineForOrthopedic.setPurposeOfMedicine("BonesPain");
        medicineForOrthopedic.setMedicineName("Methocarbamol");
        medicineForOrthopedic.setBatchNumber("m02");
        medicineForOrthopedic.setExpiryDate(calendar.getTime());

        calendar = Calendar.getInstance();
        calendar.set(2023, 6, 10);
        medicineForDentist = new Medicine();
        medicineForDentist.setMedicineId(3l);
        medicineForDentist.setPurposeOfMedicine("TeethPain");
        medicineForDentist.setMedicineName("Clindamycin");
        medicineForDentist.setBatchNumber("c03");
        medicineForDentist.setExpiryDate(calendar.getTime());

        calendar = Calendar.getInstance();
        calendar.set(2022, 1, 8, 11, 40, 29);
        medicineForNeurologist = new Medicine();
        medicineForNeurologist.setMedicineId(4l);
        medicineForNeurologist.setPurposeOfMedicine("BrainPain");
        medicineForNeurologist.setMedicineName("Lamotrigine");
        medicineForNeurologist.setBatchNumber("l04");
        medicineForNeurologist.setExpiryDate(calendar.getTime());

        calendar = Calendar.getInstance();
        calendar.set(2024, 10, 12, 8, 34, 34);
        medicineForPulmonologist = new Medicine();
        medicineForPulmonologist.setMedicineId(5l);
        medicineForPulmonologist.setPurposeOfMedicine("lung cancer");
        medicineForPulmonologist.setMedicineName("ciclesonide");
        medicineForPulmonologist.setBatchNumber("c05");
        medicineForPulmonologist.setExpiryDate(calendar.getTime());

        medicineDetails = new HashMap<>();
        medicineDetails.put(medicineForCardiologist.getMedicineId(), medicineForCardiologist);
        medicineDetails.put(medicineForOrthopedic.getMedicineId(), medicineForOrthopedic);
        medicineDetails.put(medicineForDentist.getMedicineId(), medicineForDentist);
        medicineDetails.put(medicineForNeurologist.getMedicineId(), medicineForNeurologist);
        medicineDetails.put(medicineForPulmonologist.getMedicineId(), medicineForPulmonologist);

        bedOne = new Bed();
        bedOne.setBedId(1l);
        bedOne.setBedType("Manual Bed");
        bedOne.setRoomName("A");

        bedTwo = new Bed();
        bedTwo.setBedId(2l);
        bedTwo.setBedType("Manual Bed");
        bedTwo.setRoomName("B");

        bedThree = new Bed();
        bedThree.setBedId(3l);
        bedThree.setBedType("Manual Bed");
        bedThree.setRoomName("C");

        bedFour = new Bed();
        bedFour.setBedId(4l);
        bedFour.setBedType("Manual Bed");
        bedFour.setRoomName("D");

        bedFive = new Bed();
        bedFive.setBedId(5l);
        bedFive.setBedType("Manual Bed");
        bedFive.setRoomName("E");

        bedSix = new Bed();
        bedSix.setBedId(6l);
        bedSix.setBedType("Manual Bed");
        bedSix.setRoomName("F");

        bedSeven = new Bed();
        bedSeven.setBedId(7l);
        bedSeven.setBedType("Manual Bed");
        bedSeven.setRoomName("G");

        bedEight = new Bed();
        bedEight.setBedId(8l);
        bedEight.setBedType("Manual Bed");
        bedEight.setRoomName("H");

        bedDetails = new HashMap<>();
        bedDetails.put(bedOne.getBedId(), bedOne);
        bedDetails.put(bedTwo.getBedId(), bedTwo);
        bedDetails.put(bedThree.getBedId(), bedThree);
        bedDetails.put(bedFour.getBedId(), bedFour);
        bedDetails.put(bedFive.getBedId(), bedFive);
        bedDetails.put(bedSix.getBedId(), bedSix);
        bedDetails.put(bedSeven.getBedId(), bedSeven);
        bedDetails.put(bedEight.getBedId(), bedEight);

        inPatientDetails = new HashMap<>();
        patient = new InPatient();
        patient.setIpIdentificationNumber(1l);
        patient.setPatient(patientDetails.get(1l));
        patient.setBed(bedDetails.get(1l));

        inPatientDetails.put(patient.getIpIdentificationNumber(), patient);


    }

    static public List<Medicine> getMedicine() {

        medicineList = new ArrayList<>();

        Random random = new Random();
        int randomNumber;
        for (int i = 0; i < 3; i++) {
            randomNumber = random.nextInt(5);
            if (medicineDetails.containsKey(new Long(randomNumber)))
                medicineList.add(medicineDetails.get(new Long(randomNumber)));
        }

        return medicineList;
    }

    static public void populateVisitInformation() {
        heartCheckUp = new VisitLogInformation();
        heartCheckUp.setVisitId(1l);
        heartCheckUp.setAppointment(appointmentDetails.get(10l));
        heartCheckUp.setDoctorRecommendation("any little pain visit again");
        heartCheckUp.setFollowUpNeed(false);
        heartCheckUp.setListOfMedicine(getMedicine());

        boneCheckUp = new VisitLogInformation();
        boneCheckUp.setVisitId(2l);
        boneCheckUp.setAppointment(appointmentDetails.get(9l));
        boneCheckUp.setDoctorRecommendation("Every week come for check up");
        boneCheckUp.setFollowUpNeed(false);
        boneCheckUp.setListOfMedicine(getMedicine());

        teethCheckUp = new VisitLogInformation();
        teethCheckUp.setVisitId(3l);
        teethCheckUp.setAppointment(appointmentDetails.get(11l));
        teethCheckUp.setDoctorRecommendation("Brush carefully and gently along your gum line");
        teethCheckUp.setFollowUpNeed(false);
        teethCheckUp.setListOfMedicine(getMedicine());

        brainCheckUp = new VisitLogInformation();
        brainCheckUp.setVisitId(4l);
        brainCheckUp.setAppointment(appointmentDetails.get(1l));
        brainCheckUp.setDoctorRecommendation("Seek immediately take scan");
        brainCheckUp.setFollowUpNeed(true);
        brainCheckUp.setListOfMedicine(getMedicine());

        lungCheckUp = new VisitLogInformation();
        lungCheckUp.setVisitId(5l);
        lungCheckUp.setAppointment(appointmentDetails.get(5l));
        lungCheckUp.setDoctorRecommendation("breathe issue visit immediately and take scan");
        lungCheckUp.setFollowUpNeed(true);
        lungCheckUp.setListOfMedicine(getMedicine());

        cavitiesCheckUp = new VisitLogInformation();
        cavitiesCheckUp.setVisitId(6l);
        cavitiesCheckUp.setAppointment(appointmentDetails.get(8l));
        cavitiesCheckUp.setDoctorRecommendation("Brush carefully and gently along your gum line");
        cavitiesCheckUp.setFollowUpNeed(false);
        cavitiesCheckUp.setListOfMedicine(getMedicine());

        headCheckUp = new VisitLogInformation();
        headCheckUp.setVisitId(7l);
        headCheckUp.setAppointment(appointmentDetails.get(13l));
        headCheckUp.setDoctorRecommendation("Seek immediately take scan");
        headCheckUp.setFollowUpNeed(true);
        headCheckUp.setListOfMedicine(getMedicine());

        spirometryCheckUp = new VisitLogInformation();
        spirometryCheckUp.setVisitId(8l);
        spirometryCheckUp.setAppointment(appointmentDetails.get(14l));
        spirometryCheckUp.setDoctorRecommendation("breathe issue visit immediately and take scan");
        spirometryCheckUp.setFollowUpNeed(true);
        spirometryCheckUp.setListOfMedicine(getMedicine());

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

    public static void main(String[] args) {

        populateVisitInformation();

        AppointmentBO appointmentBO = new AppointmentBO();

        try {
            appointmentBO.createAppointment(5l, patientDetails, 5l, doctorDetails,
                    Calendar.getInstance().getTime(), "Bone Pain", appointmentDetails);

        } catch (Exception e) {
            System.out.println(" Patient id is null : " + e.getMessage());
        }

        VisitInformationBO visitInformation = new VisitInformationBO();

        try {
            Patient patient = visitInformation.createVisitLogInformation(10l, appointmentDetails, visitDetails, medicineList,
                    "TeethPain", true);

            patientDetails.put(patient.getPatientId(), patient);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        InPatientBO inPatientBO = new InPatientBO();

        try {
           inPatientBO.allocateBedForInPatient(2l, patientDetails, 7l, bedDetails, inPatientDetails, "Simple Bed",
                    "A");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ReportBO reportBO = new ReportBO();
        try {
            reportBO.getPatientDetail(patientDetails, 1l, "Mohan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            reportBO.listOfVisitForPatientId(visitDetails, 2l);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            reportBO.displayOutPatient(patientDetails);
        } catch (Exception e) {
            System.out.println(" Invalid Patient details : " + e.getMessage());
        }

        try {
            reportBO.displayInPatient(inPatientDetails);
        } catch (Exception e) {
            System.out.println(" Invalid InPatient details : " + e.getMessage());
        }

        try {
            reportBO.displayPatientByDoctorId(appointmentDetails, 1l);
        } catch (Exception e) {
            System.out.println(" appointmentDetails details is empty : " + e.getMessage());
        }

        try {
            reportBO.patientFollowUpVisit(visitDetails);
        } catch (Exception e) {
            System.out.println(" PatientFollowUpVisit details is empty : " + e.getMessage());
        }

        reportBO.getVisitDetailBetweenDateRange(visitDetails);
    }
}

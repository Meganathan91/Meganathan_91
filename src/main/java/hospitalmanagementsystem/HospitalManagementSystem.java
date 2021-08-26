package hospitalmanagementsystem;

import business.AppointmentBO;
import business.InPatientBO;
import business.ReportBO;
import business.VisitLogInformationBO;
import entity.*;
import org.springframework.http.converter.json.GsonBuilderUtils;
import utility.DateUtility;
import utility.HMSUtility;

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

    static private int patientId;
    static private int doctorId;
    static private Date appointmentDate;
    static Scanner scanner;

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

        Patient patientSelvam = getPatient(1L, "Selvam", getDate(1991, 2, 1), "9870654320", "Trichy", "OP");

        Patient patientRagu = new Patient();
        patientRagu.setPatientId(2L);
        patientRagu.setPatientName("Ragu");
        patientRagu.setDob(getDate(1989, 5, 10));
        patientRagu.setPhoneNumber("7639238764");
        patientRagu.setAddress("Chennai");
        patientRagu.setPatientType("OP");

        Patient patientVimal = new Patient();
        patientVimal.setPatientId(3L);
        patientVimal.setPatientName("Vimal");
        patientVimal.setDob(getDate(1995, 6, 13));
        patientVimal.setPhoneNumber("9790654302");
        patientVimal.setAddress("Salem");
        patientVimal.setPatientType("OP");

        Patient patientAnu = new Patient();
        patientAnu.setPatientId(4L);
        patientAnu.setPatientName("Anu");
        patientAnu.setDob(getDate(1998, 7, 17));
        patientAnu.setPhoneNumber("9790654320");
        patientAnu.setAddress("Thanjavur");
        patientAnu.setPatientType("OP");

        Patient patientMohan = new Patient();
        patientMohan.setPatientId(5L);
        patientMohan.setPatientName("Mohan");
        patientMohan.setDob(getDate(1993, 4, 21));
        patientMohan.setPhoneNumber("9500768912");
        patientMohan.setAddress("kumbakonam");
        patientMohan.setPatientType("OP");

        Patient patientRajini = new Patient();
        patientRajini.setPatientId(6L);
        patientRajini.setPatientName("Rajini");
        patientRajini.setDob(getDate(2000, 8, 8));
        patientRajini.setPhoneNumber("6345876301");
        patientRajini.setAddress("Madurai");
        patientRajini.setPatientType("OP");

        Patient patientSomu = new Patient();
        patientSomu.setPatientId(7L);
        patientSomu.setPatientName("Somu");
        patientSomu.setDob(getDate(1981, 9, 19));
        patientSomu.setAddress("Ariyalur");
        patientSomu.setPhoneNumber("9790238764");
        patientSomu.setPatientType("OP");

        Patient patientSelvi = new Patient();
        patientSelvi.setPatientId(8L);
        patientSelvi.setPatientName("Selvi");
        patientSelvi.setDob(getDate(1975, 10, 16));
        patientSelvi.setAddress("Karur");
        patientSelvi.setPhoneNumber("7639128707");
        patientSelvi.setPatientType("OP");

        patientDetails = new HashMap<>();
        patientDetails.put(patientSelvam.getPatientId(), patientSelvam);
        patientDetails.put(patientRagu.getPatientId(), patientRagu);
        patientDetails.put(patientVimal.getPatientId(), patientVimal);
        patientDetails.put(patientAnu.getPatientId(), patientAnu);
        patientDetails.put(patientMohan.getPatientId(), patientMohan);
        patientDetails.put(patientRajini.getPatientId(), patientRajini);
        patientDetails.put(patientSomu.getPatientId(), patientSomu);
        patientDetails.put(patientSelvi.getPatientId(), patientSelvi);

        Appointment appointmentOne = new Appointment();
        appointmentOne.setAppointmentId(1L);
        appointmentOne.setDoctor(doctorDetails.get(1L));
        appointmentOne.setPatient(patientDetails.get(3L));
        appointmentOne.setDateOfVisit(getDate(2021, 1, 1));
        appointmentOne.setPurposeOfVisit("HeartPain");
        appointmentOne.setBp(120.5);
        appointmentOne.setTemperature(90.5);
        appointmentOne.setIsFirstVisit(true);

        Appointment appointmentTwo = new Appointment();
        appointmentTwo.setAppointmentId(2L);
        appointmentTwo.setDoctor(doctorDetails.get(1L));
        appointmentTwo.setPatient(patientDetails.get(2L));
        appointmentTwo.setDateOfVisit(getDate(2021, 8, 3));
        appointmentTwo.setPurposeOfVisit("BonesPain");
        appointmentTwo.setBp(140.7);
        appointmentTwo.setTemperature(89.1);
        appointmentTwo.setIsFirstVisit(true);

        Appointment appointmentThree = new Appointment();
        appointmentThree.setAppointmentId(3L);
        appointmentThree.setDoctor(doctorDetails.get(3L));
        appointmentThree.setPatient(patientDetails.get(3L));
        appointmentThree.setDateOfVisit(getDate(2021, 6, 3));
        appointmentThree.setPurposeOfVisit("TeethPain");
        appointmentThree.setBp(135.3);
        appointmentThree.setTemperature(81.4);
        appointmentThree.setIsFirstVisit(true);

        Appointment appointmentFour = new Appointment();
        appointmentFour.setAppointmentId(4L);
        appointmentFour.setDoctor(doctorDetails.get(1L));
        appointmentFour.setPatient(patientDetails.get(4L));
        appointmentFour.setDateOfVisit(getDate(2021, 4, 4));
        appointmentFour.setPurposeOfVisit("Headaches");
        appointmentFour.setBp(154.4);
        appointmentFour.setTemperature(79.5);
        appointmentFour.setIsFirstVisit(true);

        Appointment appointmentFive = new Appointment();
        appointmentFive.setAppointmentId(5L);
        appointmentFive.setDoctor(doctorDetails.get(5L));
        appointmentFive.setPatient(patientDetails.get(5L));
        appointmentFive.setDateOfVisit(getDate(2021, 5, 1));
        appointmentFive.setPurposeOfVisit("LungCancer");
        appointmentFive.setBp(120.5);
        appointmentFive.setTemperature(90.5);
        appointmentFive.setIsFirstVisit(true);

        Appointment appointmentSix = new Appointment();
        appointmentSix.setAppointmentId(6L);
        appointmentSix.setDoctor(doctorDetails.get(1L));
        appointmentSix.setPatient(patientDetails.get(1L));
        appointmentSix.setDateOfVisit(getDate(2021, 5, 5));
        appointmentSix.setPurposeOfVisit("HeartPain");
        appointmentSix.setBp(110.5);
        appointmentSix.setTemperature(80.5);
        appointmentSix.setIsFirstVisit(false);

        Appointment appointmentSeven = new Appointment();
        appointmentSeven.setAppointmentId(7L);
        appointmentSeven.setDoctor(doctorDetails.get(1L));
        appointmentSeven.setPatient(patientDetails.get(1L));
        appointmentSeven.setDateOfVisit(getDate(2021, 7, 12));
        appointmentSeven.setPurposeOfVisit("HeartPain");
        appointmentSeven.setBp(120.7);
        appointmentSeven.setTemperature(76.1);
        appointmentSeven.setIsFirstVisit(true);

        Appointment appointmentEight = new Appointment();
        appointmentEight.setAppointmentId(8L);
        appointmentEight.setDoctor(doctorDetails.get(1L));
        appointmentEight.setPatient(patientDetails.get(5L));
        appointmentEight.setDateOfVisit(getDate(2021, 8, 12));
        appointmentEight.setPurposeOfVisit("HeartPain");
        appointmentEight.setBp(135.3);
        appointmentEight.setTemperature(81.4);
        appointmentEight.setIsFirstVisit(true);

        Appointment appointmentNine = new Appointment();
        appointmentNine.setAppointmentId(9L);
        appointmentNine.setDoctor(doctorDetails.get(2L));
        appointmentNine.setPatient(patientDetails.get(2L));
        appointmentNine.setDateOfVisit(getDate(2021, 1, 16));
        appointmentNine.setPurposeOfVisit("BonesPain");
        appointmentNine.setBp(154.4);
        appointmentNine.setTemperature(79.5);
        appointmentNine.setIsFirstVisit(true);

        Appointment appointmentTen = new Appointment();
        appointmentTen.setAppointmentId(10L);
        appointmentTen.setDoctor(doctorDetails.get(2L));
        appointmentTen.setPatient(patientDetails.get(2L));
        appointmentTen.setDateOfVisit(getDate(2021, 4, 6));
        appointmentTen.setPurposeOfVisit("BonesPain");
        appointmentTen.setBp(120.5);
        appointmentTen.setTemperature(90.5);
        appointmentTen.setIsFirstVisit(true);

        Appointment appointmentEleven = new Appointment();
        appointmentEleven.setAppointmentId(11L);
        appointmentEleven.setDoctor(doctorDetails.get(2L));
        appointmentEleven.setPatient(patientDetails.get(2L));
        appointmentEleven.setDateOfVisit(getDate(2021, 3, 21));
        appointmentEleven.setPurposeOfVisit("BonesPain");
        appointmentEleven.setBp(135.5);
        appointmentEleven.setTemperature(76.5);
        appointmentEleven.setIsFirstVisit(true);

        Appointment appointmentTwelve = new Appointment();
        appointmentTwelve.setAppointmentId(12L);
        appointmentTwelve.setDoctor(doctorDetails.get(2L));
        appointmentTwelve.setPatient(patientDetails.get(2L));
        appointmentTwelve.setDateOfVisit(getDate(2021, 2, 3));
        appointmentTwelve.setPurposeOfVisit("BonesPain");
        appointmentTwelve.setBp(140.7);
        appointmentTwelve.setTemperature(89.1);
        appointmentTwelve.setIsFirstVisit(true);

        Appointment appointmentThirteen = new Appointment();
        appointmentThirteen.setAppointmentId(13L);
        appointmentThirteen.setDoctor(doctorDetails.get(3L));
        appointmentThirteen.setPatient(patientDetails.get(5L));
        appointmentThirteen.setDateOfVisit(getDate(2021, 1, 6));
        appointmentThirteen.setPurposeOfVisit("TeethPain");
        appointmentThirteen.setBp(135.3);
        appointmentThirteen.setTemperature(81.4);
        appointmentThirteen.setIsFirstVisit(true);

        Appointment appointmentFourteen = new Appointment();
        appointmentFourteen.setAppointmentId(14L);
        appointmentFourteen.setDoctor(doctorDetails.get(4L));
        appointmentFourteen.setPatient(patientDetails.get(5L));
        appointmentFourteen.setDateOfVisit(getDate(2021, 4, 6));
        appointmentFourteen.setPurposeOfVisit("Headaches");
        appointmentFourteen.setBp(154.4);
        appointmentFourteen.setTemperature(79.5);
        appointmentFourteen.setIsFirstVisit(true);

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

        Medicine medicineForCardiologist = new Medicine();
        medicineForCardiologist.setMedicineId(1L);
        medicineForCardiologist.setPurposeOfMedicine("HeartPain");
        medicineForCardiologist.setMedicineName("Aspirin");
        medicineForCardiologist.setBatchNumber("a01");
        medicineForCardiologist.setExpiryDate(getDate(2025, 7, 12));

        Medicine medicineForOrthopedic = new Medicine();
        medicineForOrthopedic.setMedicineId(2L);
        medicineForOrthopedic.setPurposeOfMedicine("BonesPain");
        medicineForOrthopedic.setMedicineName("Methocarbamol");
        medicineForOrthopedic.setBatchNumber("m02");
        medicineForOrthopedic.setExpiryDate(getDate(2024, 3, 8));

        Medicine medicineForDentist = new Medicine();
        medicineForDentist.setMedicineId(3L);
        medicineForDentist.setPurposeOfMedicine("TeethPain");
        medicineForDentist.setMedicineName("Clindamycin");
        medicineForDentist.setBatchNumber("c03");
        medicineForDentist.setExpiryDate(getDate(2023, 6, 10));

        Medicine medicineForNeurologist = new Medicine();
        medicineForNeurologist.setMedicineId(4L);
        medicineForNeurologist.setPurposeOfMedicine("BrainPain");
        medicineForNeurologist.setMedicineName("Lamotrigine");
        medicineForNeurologist.setBatchNumber("l04");
        medicineForNeurologist.setExpiryDate(getDate(2022, 2, 8));

        Medicine medicineForPulmonologist = new Medicine();
        medicineForPulmonologist.setMedicineId(5L);
        medicineForPulmonologist.setPurposeOfMedicine("lung cancer");
        medicineForPulmonologist.setMedicineName("ciclesonide");
        medicineForPulmonologist.setBatchNumber("c05");
        medicineForPulmonologist.setExpiryDate(getDate(2024, 11, 12));

        medicineDetails = new HashMap<>();
        medicineDetails.put(medicineForCardiologist.getMedicineId(), medicineForCardiologist);
        medicineDetails.put(medicineForOrthopedic.getMedicineId(), medicineForOrthopedic);
        medicineDetails.put(medicineForDentist.getMedicineId(), medicineForDentist);
        medicineDetails.put(medicineForNeurologist.getMedicineId(), medicineForNeurologist);
        medicineDetails.put(medicineForPulmonologist.getMedicineId(), medicineForPulmonologist);

        Bed bedOne = new Bed();
        bedOne.setBedId(1L);
        bedOne.setBedType("Manual Bed");
        bedOne.setRoomName("A");

        Bed bedTwo = new Bed();
        bedTwo.setBedId(2L);
        bedTwo.setBedType("Manual Bed");
        bedTwo.setRoomName("B");

        Bed bedThree = new Bed();
        bedThree.setBedId(3L);
        bedThree.setBedType("Manual Bed");
        bedThree.setRoomName("C");

        Bed bedFour = new Bed();
        bedFour.setBedId(4L);
        bedFour.setBedType("Manual Bed");
        bedFour.setRoomName("D");

        Bed bedFive = new Bed();
        bedFive.setBedId(5L);
        bedFive.setBedType("Manual Bed");
        bedFive.setRoomName("E");

        bedDetails = new HashMap<>();
        bedDetails.put(bedOne.getBedId(), bedOne);
        bedDetails.put(bedTwo.getBedId(), bedTwo);
        bedDetails.put(bedThree.getBedId(), bedThree);
        bedDetails.put(bedFour.getBedId(), bedFour);
        bedDetails.put(bedFive.getBedId(), bedFive);

        inPatientDetails = new HashMap<>();
    }

    private static Patient getPatient(Long patientId, String name, Date dateOfBirth, String phoneNumber, String location, String patientType) {
        Patient patient = new Patient();
        patient.setPatientId(1L);
        patient.setPatientName("Selvam");
        patient.setDob(dateOfBirth);
        patient.setPhoneNumber("9870654320");
        patient.setAddress("Trichy");
        patient.setPatientType("OP");
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

    private static Date getDate(int year, int month, int date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, date);
        return calendar.getTime();
    }

    static public List<Medicine> getMedicine() {

        medicineList = new ArrayList<>();

        Random random = new Random();
        int randomNumber;
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
        VisitLogInformation heartCheckUp = new VisitLogInformation();
        heartCheckUp.setVisitId(1L);
        heartCheckUp.setAppointment(appointmentDetails.get(10L));
        heartCheckUp.setDoctorRecommendation("any little pain visit again");
        heartCheckUp.setFollowUpNeed(false);
        heartCheckUp.setListOfMedicine(getMedicine());

        VisitLogInformation boneCheckUp = new VisitLogInformation();
        boneCheckUp.setVisitId(2L);
        boneCheckUp.setAppointment(appointmentDetails.get(9L));
        boneCheckUp.setDoctorRecommendation("Every week come for check up");
        boneCheckUp.setFollowUpNeed(false);
        boneCheckUp.setListOfMedicine(getMedicine());

        VisitLogInformation teethCheckUp = new VisitLogInformation();
        teethCheckUp.setVisitId(3L);
        teethCheckUp.setAppointment(appointmentDetails.get(11L));
        teethCheckUp.setDoctorRecommendation("Brush carefully and gently along your gum line");
        teethCheckUp.setFollowUpNeed(false);
        teethCheckUp.setListOfMedicine(getMedicine());

        VisitLogInformation brainCheckUp = new VisitLogInformation();
        brainCheckUp.setVisitId(4L);
        brainCheckUp.setAppointment(appointmentDetails.get(1L));
        brainCheckUp.setDoctorRecommendation("Seek immediately take scan");
        brainCheckUp.setFollowUpNeed(true);
        brainCheckUp.setListOfMedicine(getMedicine());

        VisitLogInformation lungCheckUp = new VisitLogInformation();
        lungCheckUp.setVisitId(5L);
        lungCheckUp.setAppointment(appointmentDetails.get(5L));
        lungCheckUp.setDoctorRecommendation("breathe issue visit immediately and take scan");
        lungCheckUp.setFollowUpNeed(true);
        lungCheckUp.setListOfMedicine(getMedicine());

        VisitLogInformation cavitiesCheckUp = new VisitLogInformation();
        cavitiesCheckUp.setVisitId(6L);
        cavitiesCheckUp.setAppointment(appointmentDetails.get(8L));
        cavitiesCheckUp.setDoctorRecommendation("Brush carefully and gently along your gum line");
        cavitiesCheckUp.setFollowUpNeed(false);
        cavitiesCheckUp.setListOfMedicine(getMedicine());

        VisitLogInformation headCheckUp = new VisitLogInformation();
        headCheckUp.setVisitId(7L);
        headCheckUp.setAppointment(appointmentDetails.get(13L));
        headCheckUp.setDoctorRecommendation("Seek immediately take scan");
        headCheckUp.setFollowUpNeed(false);
        headCheckUp.setListOfMedicine(getMedicine());

        VisitLogInformation spirometryCheckUp = new VisitLogInformation();
        spirometryCheckUp.setVisitId(8L);
        spirometryCheckUp.setAppointment(appointmentDetails.get(14L));
        spirometryCheckUp.setDoctorRecommendation("breathe issue visit immediately and take scan");
        spirometryCheckUp.setFollowUpNeed(false);
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

    public static void createAppointmentUsingUserInput() {
        boolean isContinue = true;
        System.out.println("Hospital details ");
        for (Long id : hospitalDetails.keySet()) {
            System.out.print(hospitalDetails.get(id).getHospitalName() + " " + hospitalDetails.get(id).getHospitalLocation());
        }
        System.out.println();
        System.out.print("create appointment for Existing Patient select - 1 (OR) New Patient Select - 2 : ");
        scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Existing Patient Details.....");
                for (Long pid : patientDetails.keySet()) {
                    Patient patient = patientDetails.get(pid);
                    System.out.println(patient.getPatientId() + "  " + patient.getPatientName() + "  " + patient.getDob() + "  " + patient.getPhoneNumber() + "  " + patient.getPatientType());
                }
                System.out.println("select patient id");
                patientId = scanner.nextInt();
                if (!patientDetails.containsKey((long) patientId)) {
                    System.out.print("Given patient is not exist, You want to create new Patient (yes - 1 / no - 2)  : ");
                    int option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            createNewPatient();
                            break;
                        case 2:
                            do {
                                System.out.println("select patient id");
                                patientId = scanner.nextInt();
                                if (!patientDetails.containsKey((long) patientId)) {
                                    System.out.println("In correct patient id, Please Enter valid patient id.....");
                                    isContinue = true;
                                } else
                                    isContinue = false;
                            } while (isContinue);
                            break;
                        default:
                            System.out.println("selected option invalid, Please select valid option");
                    }
                }
                displayDoctorDetails();
                doctorId = checkDoctorAvailability();
                break;
            case 2:
                Patient patient = createNewPatient();
                patientId = Math.toIntExact(patient.getPatientId());

                displayDoctorDetails();
                doctorId = checkDoctorAvailability();
                break;
            default:
                System.out.println("Selected invalid option, Please select valid option ... ");

        }


        System.out.print("\n");
        System.out.print("Enter appointment date, format (yyyy/MM/dd) ...  ");

        appointmentDate = DateUtility.getDate(scanner.next());
    }

    private static int checkDoctorAvailability() {
        boolean isContinue;
        int doctorId;
        System.out.println("select doctor id");
        do {
            isContinue = false;
            doctorId = scanner.nextInt();
            if (!doctorDetails.containsKey((long) doctorId)) {
                System.out.println("In correct doctor id, Please Enter valid doctor id.....");
                isContinue = true;
            }
        } while (isContinue);
        return doctorId;
    }

    private static void displayDoctorDetails() {
        System.out.println("Doctor Details.....");
        for (Long did : doctorDetails.keySet()) {
            Doctor doctor = doctorDetails.get(did);
            System.out.println(doctor.getDoctorId() + " " + doctor.getDoctorName() + "" + doctor.getSpecialisation());
        }
    }

    private static Patient createNewPatient() {
        Patient patient = new Patient();
        scanner = new Scanner(System.in);

        System.out.println("Provide patient details.....");
        System.out.print("Name ... ");
        String name = scanner.next();

        System.out.print("Date of birth Format (yyyy/MM/dd) ... ");
        Date dateOfBirth = DateUtility.getDate(scanner.next());

        System.out.print("Address ... ");
        String address = scanner.next();

        System.out.print("PhoneNumber ... ");
        String phoneNumber = getNumber(scanner.next());


        patient.setPatientId(HMSUtility.getId(new ArrayList<>(patientDetails.keySet())));
        patient.setPatientName(name);
        patient.setDob(dateOfBirth);
        patient.setAddress(address);
        patient.setPhoneNumber(phoneNumber);
        patient.setPatientType("OP");

        System.out.println();

        patientDetails.put(patient.getPatientId(), patient);

        return patient;
    }

    private static String getNumber(String phoneNumber) {
        while (phoneNumber.trim().length() != 10) {
            System.out.print("Mobile number should be 10 digits ... ");
            phoneNumber = scanner.next();
        }
        return phoneNumber;
    }


    public static void main(String[] args) {
        try {
            populateVisitInformation();

            AppointmentBO appointmentBO = new AppointmentBO();
            VisitLogInformationBO visitInformation = new VisitLogInformationBO();
            InPatientBO inPatientBO = new InPatientBO();
            ReportBO reportBO = new ReportBO();
            VisitLogInformation visitLogInformation = null;

            createAppointmentUsingUserInput();
            Appointment appointment = appointmentBO.createAppointment((long) patientId, patientDetails, (long) doctorId, doctorDetails, appointmentDetails, appointmentDate);
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

package mainmethod;

import businesslogic.AppointmentBO;
import businesslogic.InPatientBO;
import businesslogic.VisitInformationBO;
import entity.*;

import java.util.*;

public class Report {

    private static Map<Long, Hospital> hospitalDetails;
    private static Hospital hospital;

    private static Map<Long, Doctor> doctorDetails;
    private static Doctor cardiologistDoctor;
    private static Doctor orthopedicDoctor;
    private static Doctor dentistDoctor;
    private static Doctor neurologistDoctor;
    private static Doctor pulmonologistDoctor;

    private static Map<Long, Patient> patientDetails;
    private static Patient patientSelvam;
    private static Patient patientRagu;
    private static Patient patientVimal;
    private static Patient patientAnu;
    private static Patient patientMohan;
    private static Patient patientRajini;
    private static Patient patientSomu;
    private static Patient patientSelvi;

    private static Map<Long, Appointment> appointmentDetails;
    private static Appointment appointmentOne;
    private static Appointment appointmentTwo;
    private static Appointment appointmentThree;
    private static Appointment appointmentFour;
    private static Appointment appointmentFive;
    private static Appointment appointmentSix;
    private static Appointment appointmentSeven;
    private static Appointment appointmentEight;
    private static Appointment appointmentNine;
    private static Appointment appointmentTen;
    private static Appointment appointmentEleven;
    private static Appointment appointmentTwelve;
    private static Appointment appointmentThirteen;
    private static Appointment appointmentFourteen;

    private static Map<Long, Medicine> medicineDetails;
    private static Medicine medicineForCardiologist;
    private static Medicine medicineForOrthopedic;
    private static Medicine medicineForDentist;
    private static Medicine medicineForNeurologist;
    private static Medicine medicineForPulmonologist;

    private static Map<Long, VisitLogInformation> visitDetails;
    private static VisitLogInformation heartCheckUp;
    private static VisitLogInformation boneCheckUp;
    private static VisitLogInformation teethCheckUp;
    private static VisitLogInformation brainCheckUp;
    private static VisitLogInformation lungCheckUp;

    private static Map<Long, InPatient> inPatientDetails;
    private static InPatient inPatientSelvam;
    private static InPatient inPatientRagu;
    private static InPatient inPatientVimal;
    private static InPatient inPatientAnu;
    private static InPatient inPatientMohan;
    private static InPatient inPatientRajini;
    private static InPatient inPatientSomu;
    private static InPatient inPatientSelvi;

    private static Map<Long, Bed> bedDetails;
    private static Bed bedOne;
    private static Bed bedTwo;
    private static Bed bedThree;
    private static Bed bedFour;
    private static Bed bedFive;
    private static Bed bedSix;
    private static Bed bedSeven;
    private static Bed bedEight;

    private static List<Medicine> medicineList;
    private static Medicine medicine;


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

        patientSelvam = new Patient();
        patientSelvam.setPatientId(1l);
        patientSelvam.setPatientName("Selvam");
        patientSelvam.setPhoneNumber("9870654320");
        patientSelvam.setAddress("trichy");
        patientSelvam.setPatientType("OP");

        patientRagu = new Patient();
        patientRagu.setPatientId(2l);
        patientRagu.setPatientName("Ragu");
        patientRagu.setPhoneNumber("7639238764");
        patientRagu.setAddress("Chennai");
        patientRagu.setPatientType("OP");


        patientVimal = new Patient();
        patientVimal.setPatientId(3l);
        patientVimal.setPatientName("Vimal");
        patientVimal.setPhoneNumber("9790654302");
        patientVimal.setAddress("Salem");
        patientVimal.setPatientType("OP");

        patientAnu = new Patient();
        patientAnu.setPatientId(4l);
        patientAnu.setPatientName("Anu");
        patientAnu.setPhoneNumber("9790654320");
        patientAnu.setAddress("Thanjavur");
        patientAnu.setPatientType("OP");

        patientMohan = new Patient();
        patientMohan.setPatientId(5l);
        patientMohan.setPatientName("Mohan");
        patientMohan.setPhoneNumber("9500768912");
        patientMohan.setAddress("kumbakonam");
        patientMohan.setPatientType("OP");

        patientRajini = new Patient();
        patientRajini.setPatientId(6l);
        patientRajini.setPatientName("Rajini");
        patientRajini.setPhoneNumber("6345876301");
        patientRajini.setAddress("Madurai");
        patientRajini.setPatientType("OP");

        patientSomu = new Patient();
        patientSomu.setPatientId(7l);
        patientSomu.setPatientName("Somu");
        patientSomu.setAddress("Ariyalur");
        patientSomu.setPhoneNumber("9790238764");
        patientSomu.setPatientType("OP");

        patientSelvi = new Patient();
        patientSelvi.setPatientId(8l);
        patientSelvi.setPatientName("Selvi");
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

        appointmentOne = new Appointment();
        appointmentOne.setAppointmentId(1l);
        appointmentOne.setDoctor(doctorDetails.get(1l));
        appointmentOne.setPatient(patientDetails.get(1l));
        appointmentOne.setPurposeOfVisit("HeartPain");
        appointmentOne.setBp(120.5);
        appointmentOne.setTemperature(90.5);
        appointmentOne.setIsFirstVisit(false);

        appointmentTwo = new Appointment();
        appointmentTwo.setAppointmentId(2l);
        appointmentTwo.setDoctor(doctorDetails.get(2l));
        appointmentTwo.setPatient(patientDetails.get(2l));
        appointmentTwo.setPurposeOfVisit("BonesPain");
        appointmentTwo.setBp(140.7);
        appointmentTwo.setTemperature(89.1);
        appointmentTwo.setIsFirstVisit(false);

        appointmentThree = new Appointment();
        appointmentThree.setAppointmentId(3l);
        appointmentThree.setDoctor(doctorDetails.get(3l));
        appointmentThree.setPatient(patientDetails.get(3l));
        appointmentThree.setPurposeOfVisit("TeethPain");
        appointmentThree.setBp(135.3);
        appointmentThree.setTemperature(81.4);
        appointmentThree.setIsFirstVisit(true);

        appointmentFour = new Appointment();
        appointmentFour.setAppointmentId(4l);
        appointmentFour.setDoctor(doctorDetails.get(4l));
        appointmentFour.setPatient(patientDetails.get(4l));
        appointmentFour.setPurposeOfVisit("Headaches");
        appointmentFour.setBp(154.4);
        appointmentFour.setTemperature(79.5);
        appointmentFour.setIsFirstVisit(false);

        appointmentFive = new Appointment();
        appointmentFive.setAppointmentId(5l);
        appointmentFive.setDoctor(doctorDetails.get(5l));
        appointmentFive.setPatient(patientDetails.get(5l));
        appointmentFive.setPurposeOfVisit("LungCancer");
        appointmentFive.setBp(120.5);
        appointmentFive.setTemperature(90.5);
        appointmentFive.setIsFirstVisit(true);

        appointmentSix = new Appointment();
        appointmentSix.setAppointmentId(6l);
        appointmentSix.setDoctor(doctorDetails.get(1l));
        appointmentSix.setPatient(patientDetails.get(1l));
        appointmentSix.setPurposeOfVisit("HeartPain");
        appointmentSix.setBp(110.5);
        appointmentSix.setTemperature(80.5);
        appointmentSix.setIsFirstVisit(false);

        appointmentSeven = new Appointment();
        appointmentSeven.setAppointmentId(7l);
        appointmentSeven.setDoctor(doctorDetails.get(1l));
        appointmentSeven.setPatient(patientDetails.get(1l));
        appointmentSeven.setPurposeOfVisit("HeartPain");
        appointmentSeven.setBp(120.7);
        appointmentSeven.setTemperature(76.1);
        appointmentSeven.setIsFirstVisit(false);

        appointmentEight = new Appointment();
        appointmentEight.setAppointmentId(8l);
        appointmentEight.setDoctor(doctorDetails.get(1l));
        appointmentEight.setPatient(patientDetails.get(1l));
        appointmentEight.setPurposeOfVisit("HeartPain");
        appointmentEight.setBp(135.3);
        appointmentEight.setTemperature(81.4);
        appointmentEight.setIsFirstVisit(false);

        appointmentNine = new Appointment();
        appointmentNine.setAppointmentId(9l);
        appointmentNine.setDoctor(doctorDetails.get(2l));
        appointmentNine.setPatient(patientDetails.get(2l));
        appointmentNine.setPurposeOfVisit("BonesPain");
        appointmentNine.setBp(154.4);
        appointmentNine.setTemperature(79.5);
        appointmentNine.setIsFirstVisit(false);

        appointmentTen = new Appointment();
        appointmentTen.setAppointmentId(10l);
        appointmentTen.setDoctor(doctorDetails.get(2l));
        appointmentTen.setPatient(patientDetails.get(2l));
        appointmentTen.setPurposeOfVisit("BonesPain");
        appointmentTen.setBp(120.5);
        appointmentTen.setTemperature(90.5);
        appointmentTen.setIsFirstVisit(false);

        appointmentEleven = new Appointment();
        appointmentEleven.setAppointmentId(11l);
        appointmentEleven.setDoctor(doctorDetails.get(2l));
        appointmentEleven.setPatient(patientDetails.get(2l));
        appointmentEleven.setPurposeOfVisit("BonesPain");
        appointmentEleven.setBp(135.5);
        appointmentEleven.setTemperature(76.5);
        appointmentEleven.setIsFirstVisit(false);

        appointmentTwelve = new Appointment();
        appointmentTwelve.setAppointmentId(12l);
        appointmentTwelve.setDoctor(doctorDetails.get(2l));
        appointmentTwelve.setPatient(patientDetails.get(2l));
        appointmentTwelve.setPurposeOfVisit("BonesPain");
        appointmentTwelve.setBp(140.7);
        appointmentTwelve.setTemperature(89.1);
        appointmentTwelve.setIsFirstVisit(false);

        appointmentThirteen = new Appointment();
        appointmentThirteen.setAppointmentId(13l);
        appointmentThirteen.setDoctor(doctorDetails.get(3l));
        appointmentThirteen.setPatient(patientDetails.get(3l));
        appointmentThirteen.setPurposeOfVisit("TeethPain");
        appointmentThirteen.setBp(135.3);
        appointmentThirteen.setTemperature(81.4);
        appointmentThirteen.setIsFirstVisit(false);

        appointmentFourteen = new Appointment();
        appointmentFourteen.setAppointmentId(14l);
        appointmentFourteen.setDoctor(doctorDetails.get(4l));
        appointmentFourteen.setPatient(patientDetails.get(4l));
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

        medicineForCardiologist = new Medicine();
        medicineForCardiologist.setMedicineId(1l);
        medicineForCardiologist.setPurposeOfMedicine("HeartPain");
        medicineForCardiologist.setMedicineName("Aspirin");
        medicineForCardiologist.setBatchNumber("a01");

        medicineForOrthopedic = new Medicine();
        medicineForOrthopedic.setMedicineId(2l);
        medicineForOrthopedic.setPurposeOfMedicine("BonesPain");
        medicineForOrthopedic.setMedicineName("Methocarbamol");
        medicineForOrthopedic.setBatchNumber("m02");

        medicineForDentist = new Medicine();
        medicineForDentist.setMedicineId(3l);
        medicineForDentist.setPurposeOfMedicine("TeethPain");
        medicineForDentist.setMedicineName("Clindamycin");
        medicineForDentist.setBatchNumber("c03");

        medicineForNeurologist = new Medicine();
        medicineForNeurologist.setMedicineId(4l);
        medicineForNeurologist.setPurposeOfMedicine("BrainPain");
        medicineForNeurologist.setMedicineName("Lamotrigine");
        medicineForNeurologist.setBatchNumber("l04");

        medicineForPulmonologist = new Medicine();
        medicineForPulmonologist.setMedicineId(5l);
        medicineForPulmonologist.setPurposeOfMedicine("lung cancer");
        medicineForPulmonologist.setMedicineName("ciclesonide");
        medicineForPulmonologist.setBatchNumber("c05");

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

        inPatientSelvam = new InPatient();
        inPatientSelvam.setPatientId(1l);
        inPatientSelvam.setIpIdentificationNumber(1l);
        inPatientSelvam.setBed(bedDetails.get(1l));

        inPatientRagu = new InPatient();
        inPatientRagu.setPatientId(2l);
        inPatientRagu.setIpIdentificationNumber(2l);
        inPatientRagu.setBed(bedDetails.get(2l));


        inPatientVimal = new InPatient();
        inPatientVimal.setPatientId(3l);
        inPatientVimal.setIpIdentificationNumber(3l);
        inPatientVimal.setBed(bedDetails.get(3l));

        inPatientAnu = new InPatient();
        inPatientAnu.setPatientId(4l);
        inPatientAnu.setIpIdentificationNumber(4l);
        inPatientAnu.setBed(bedDetails.get(4l));

        inPatientMohan = new InPatient();
        inPatientMohan.setPatientId(5l);
        inPatientMohan.setIpIdentificationNumber(5l);
        inPatientMohan.setBed(bedDetails.get(5l));

        inPatientRajini = new InPatient();
        inPatientRajini.setPatientId(6l);
        inPatientRajini.setIpIdentificationNumber(6l);
        inPatientRajini.setBed(bedDetails.get(6l));

        inPatientSomu = new InPatient();
        inPatientSomu.setPatientId(7l);
        inPatientSomu.setIpIdentificationNumber(7l);
        inPatientSomu.setBed(bedDetails.get(7l));

        inPatientSelvi = new InPatient();
        inPatientSelvi.setPatientId(8l);
        inPatientSelvi.setIpIdentificationNumber(8l);
        inPatientSelvi.setBed(bedDetails.get(8l));

        inPatientDetails = new HashMap<>();
        inPatientDetails.put(inPatientSelvam.getIpIdentificationNumber(), inPatientSelvam);
        inPatientDetails.put(inPatientRagu.getIpIdentificationNumber(), inPatientRagu);
        inPatientDetails.put(inPatientVimal.getIpIdentificationNumber(), inPatientVimal);
        inPatientDetails.put(inPatientAnu.getIpIdentificationNumber(), inPatientAnu);
        inPatientDetails.put(inPatientMohan.getIpIdentificationNumber(), inPatientMohan);
        inPatientDetails.put(inPatientRajini.getIpIdentificationNumber(), inPatientRajini);
        inPatientDetails.put(inPatientSomu.getIpIdentificationNumber(), inPatientSomu);
        inPatientDetails.put(inPatientSelvi.getIpIdentificationNumber(), inPatientSelvi);
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
        heartCheckUp.setFollowUpNeed(true);
        heartCheckUp.setListOfMedicine(getMedicine());

        boneCheckUp = new VisitLogInformation();
        boneCheckUp.setVisitId(2l);
        boneCheckUp.setAppointment(appointmentDetails.get(9l));
        boneCheckUp.setDoctorRecommendation("Every week come for check up");
        boneCheckUp.setFollowUpNeed(true);
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
        lungCheckUp.setAppointment(appointmentDetails.get(2l));
        lungCheckUp.setDoctorRecommendation("breathe issue visit immediately and take scan");
        lungCheckUp.setFollowUpNeed(true);
        lungCheckUp.setListOfMedicine(getMedicine());

        visitDetails = new HashMap<>();
        visitDetails.put(heartCheckUp.getVisitId(), heartCheckUp);
        visitDetails.put(boneCheckUp.getVisitId(), boneCheckUp);
        visitDetails.put(teethCheckUp.getVisitId(), teethCheckUp);
        visitDetails.put(brainCheckUp.getVisitId(), brainCheckUp);
        visitDetails.put(lungCheckUp.getVisitId(), lungCheckUp);

    }

    public static void main(String[] args) {

        populateVisitInformation();

        AppointmentBO appointmentBO = new AppointmentBO();
        Appointment appointment;
        try {
            appointment = appointmentBO.createAppointment(5l, patientDetails, 5l, doctorDetails,
                    Calendar.getInstance().getTime(), "Bone Pain", appointmentDetails);
            appointmentDetails.put(appointment.getAppointmentId(), appointment);
        } catch (Exception e) {
            System.out.println(" Patient id is null: " + e.getMessage());
        }

        VisitInformationBO visitInformation = new VisitInformationBO();
        try {
            Patient patient = visitInformation.checkPatientNoOfFVisit(2l, appointmentDetails, visitDetails, medicineList,
                    "TeethPain", true);
            patientDetails.put(patient.getPatientId(), patient);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        InPatientBO inPatientBO = new InPatientBO();
        InPatient inPatient = new InPatient();
        try {
            inPatient = inPatientBO.allocateBedForINPatient(2l, patientDetails, 2l, bedDetails, "Simple Bed",
                    "A");
            inPatientDetails.put(inPatient.getPatientId(), inPatient);
            System.out.println("hiiiiiiiiiii"+inPatientDetails);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package mainmethod;

import businesslogic.AppointmentBO;
import businesslogic.INPatientBO;
import businesslogic.ReportBO;
import businesslogic.VisitInformationBO;
import entity.*;

import java.util.*;

public class Report {

    static private final Map<Long, Hospital> hospitalDetails;

    static private final Map<Long, Doctor> doctorDetails;

    static private final Map<Long, Patient> patientDetails;

    static private final Map<Long, Appointment> appointmentDetails;

    static private final Map<Long, Medicine> medicineDetails;

    static private Map<Long, VisitLogInformation> visitDetails;

    static private final Map<Long, IP> INPatientDetails;

    static private final Map<Long, Bed> bedDetails;

    static private List<Medicine> medicineList;

    static {

        hospitalDetails = new HashMap<>();

        Hospital hospital = new Hospital();
        hospital.setHospitalId(1L);
        hospital.setHospitalName("Kauvery");
        hospital.setHospitalLocation("Chennai");

        hospitalDetails.put(hospital.getHospitalId(), hospital);

        Doctor cardiologistDoctor = new Doctor();
        cardiologistDoctor.setDoctorId(1L);
        cardiologistDoctor.setDoctorName("Rahim");
        cardiologistDoctor.setSpecialisation("Cardiologists");

        Doctor orthopedicDoctor = new Doctor();
        orthopedicDoctor.setDoctorId(2L);
        orthopedicDoctor.setDoctorName("Vishal");
        orthopedicDoctor.setSpecialisation("Orthopedic");

        Doctor dentistDoctor = new Doctor();
        dentistDoctor.setDoctorId(3L);
        dentistDoctor.setDoctorName("Suganya");
        dentistDoctor.setSpecialisation("Dentist");

        Doctor neurologistDoctor = new Doctor();
        neurologistDoctor.setDoctorId(4L);
        neurologistDoctor.setDoctorName("Anu");
        neurologistDoctor.setSpecialisation("Neurologist");

        Doctor pulmonologistDoctor = new Doctor();
        pulmonologistDoctor.setDoctorId(5L);
        pulmonologistDoctor.setDoctorName("VelRaj");
        pulmonologistDoctor.setSpecialisation("Pulmonologist");

        doctorDetails = new HashMap<>();
        doctorDetails.put(cardiologistDoctor.getDoctorId(), cardiologistDoctor);
        doctorDetails.put(orthopedicDoctor.getDoctorId(), orthopedicDoctor);
        doctorDetails.put(dentistDoctor.getDoctorId(), dentistDoctor);
        doctorDetails.put(neurologistDoctor.getDoctorId(), neurologistDoctor);
        doctorDetails.put(pulmonologistDoctor.getDoctorId(), pulmonologistDoctor);


        Calendar selvamDOB = Calendar.getInstance();
        selvamDOB.set(1991, Calendar.FEBRUARY, 1);
        Patient patientSelvam = new Patient();
        patientSelvam.setPatientId(1L);
        patientSelvam.setPatientName("Selvam");
        patientSelvam.setDob(selvamDOB.getTime());
        patientSelvam.setPhoneNumber("9870654320");
        patientSelvam.setAddress("Trichy");
        patientSelvam.setPatientType("OP");

        Calendar raguDOB = Calendar.getInstance();
        raguDOB.set(1989, Calendar.MAY, 10);
        Patient patientRagu = new Patient();
        patientRagu.setPatientId(2L);
        patientRagu.setPatientName("Ragu");
        patientRagu.setDob(raguDOB.getTime());
        patientRagu.setPhoneNumber("7639238764");
        patientRagu.setAddress("Chennai");
        patientRagu.setPatientType("OP");

        Calendar vimalDOB = Calendar.getInstance();
        vimalDOB.set(1995, Calendar.JULY, 13);
        Patient patientVimal = new Patient();
        patientVimal.setPatientId(3L);
        patientVimal.setPatientName("Vimal");
        patientVimal.setDob(vimalDOB.getTime());
        patientVimal.setPhoneNumber("9790654302");
        patientVimal.setAddress("Salem");
        patientVimal.setPatientType("OP");

        Calendar anuDOB = Calendar.getInstance();
        anuDOB.set(1998, Calendar.SEPTEMBER, 17);
        Patient patientAnu = new Patient();
        patientAnu.setPatientId(4L);
        patientAnu.setPatientName("Anu");
        patientAnu.setDob(anuDOB.getTime());
        patientAnu.setPhoneNumber("9790654320");
        patientAnu.setAddress("Thanjavur");
        patientAnu.setPatientType("OP");

        Calendar mohanDOB = Calendar.getInstance();
        mohanDOB.set(1993, Calendar.APRIL, 21);
        Patient patientMohan = new Patient();
        patientMohan.setPatientId(5L);
        patientMohan.setPatientName("Mohan");
        patientMohan.setDob(mohanDOB.getTime());
        patientMohan.setPhoneNumber("9500768912");
        patientMohan.setAddress("kumbakonam");
        patientMohan.setPatientType("OP");

        Calendar rajiniDOB = Calendar.getInstance();
        rajiniDOB.set(2000, Calendar.AUGUST, 8);
        Patient patientRajini = new Patient();
        patientRajini.setPatientId(6L);
        patientRajini.setPatientName("Rajini");
        patientRajini.setDob(rajiniDOB.getTime());
        patientRajini.setPhoneNumber("6345876301");
        patientRajini.setAddress("Madurai");
        patientRajini.setPatientType("OP");

        Calendar somuDOB = Calendar.getInstance();
        somuDOB.set(1981, Calendar.NOVEMBER, 19);
        Patient patientSomu = new Patient();
        patientSomu.setPatientId(7L);
        patientSomu.setPatientName("Somu");
        patientSomu.setDob(somuDOB.getTime());
        patientSomu.setAddress("Ariyalur");
        patientSomu.setPhoneNumber("9790238764");
        patientSomu.setPatientType("OP");

        Calendar selviDOB = Calendar.getInstance();
        selviDOB.set(1975, Calendar.DECEMBER, 16);
        Patient patientSelvi = new Patient();
        patientSelvi.setPatientId(20L);
        patientSelvi.setPatientName("Selvi");
        patientSelvi.setDob(selviDOB.getTime());
        patientSelvi.setAddress("Karur");
        patientSelvi.setPhoneNumber("7639128707");
        patientSelvi.setPatientType("IP");

        patientDetails = new HashMap<>();
        patientDetails.put(patientSelvam.getPatientId(), patientSelvam);
        patientDetails.put(patientRagu.getPatientId(), patientRagu);
        patientDetails.put(patientVimal.getPatientId(), patientVimal);
        patientDetails.put(patientAnu.getPatientId(), patientAnu);
        patientDetails.put(patientMohan.getPatientId(), patientMohan);
        patientDetails.put(patientRajini.getPatientId(), patientRajini);
        patientDetails.put(patientSomu.getPatientId(), patientSomu);
        patientDetails.put(patientSelvi.getPatientId(), patientSelvi);

        Calendar appDate1 = Calendar.getInstance();
        appDate1.set(2021, Calendar.FEBRUARY, 1);
        Appointment appointmentOne = new Appointment();
        appointmentOne.setAppointmentId(1L);
        appointmentOne.setDoctor(doctorDetails.get(1L));
        appointmentOne.setPatient(patientDetails.get(3L));
        appointmentOne.setDateOfVisit(appDate1.getTime());
        appointmentOne.setPurposeOfVisit("HeartPain");
        appointmentOne.setBp(120.5);
        appointmentOne.setTemperature(90.5);
        appointmentOne.setIsFirstVisit(false);

        Calendar appDate2 = Calendar.getInstance();
        appDate2.set(2021, Calendar.MARCH, 3);
        Appointment appointmentTwo = new Appointment();
        appointmentTwo.setAppointmentId(2L);
        appointmentTwo.setDoctor(doctorDetails.get(1L));
        appointmentTwo.setPatient(patientDetails.get(2L));
        appointmentTwo.setDateOfVisit(appDate2.getTime());
        appointmentTwo.setPurposeOfVisit("BonesPain");
        appointmentTwo.setBp(140.7);
        appointmentTwo.setTemperature(89.1);
        appointmentTwo.setIsFirstVisit(false);

        Calendar appDate3 = Calendar.getInstance();
        appDate3.set(2021, Calendar.APRIL, 3);
        Appointment appointmentThree = new Appointment();
        appointmentThree.setAppointmentId(3L);
        appointmentThree.setDoctor(doctorDetails.get(3L));
        appointmentThree.setPatient(patientDetails.get(3L));
        appointmentThree.setDateOfVisit(appDate3.getTime());
        appointmentThree.setPurposeOfVisit("TeethPain");
        appointmentThree.setBp(135.3);
        appointmentThree.setTemperature(81.4);
        appointmentThree.setIsFirstVisit(true);

        Calendar appDate4 = Calendar.getInstance();
        appDate4.set(2021, Calendar.MAY, 4);
        Appointment appointmentFour = new Appointment();
        appointmentFour.setAppointmentId(4L);
        appointmentFour.setDoctor(doctorDetails.get(1L));
        appointmentFour.setPatient(patientDetails.get(4L));
        appointmentFour.setDateOfVisit(appDate4.getTime());
        appointmentFour.setPurposeOfVisit("Headaches");
        appointmentFour.setBp(154.4);
        appointmentFour.setTemperature(79.5);
        appointmentFour.setIsFirstVisit(false);

        Appointment appointmentFive = new Appointment();
        appointmentFive.setAppointmentId(5L);
        appointmentFive.setDoctor(doctorDetails.get(5L));
        appointmentFive.setPatient(patientDetails.get(5L));
        appointmentFive.setDateOfVisit(Calendar.getInstance().getTime());
        appointmentFive.setPurposeOfVisit("LungCancer");
        appointmentFive.setBp(120.5);
        appointmentFive.setTemperature(90.5);
        appointmentFive.setIsFirstVisit(true);

        Calendar appDate6 = Calendar.getInstance();
        appDate6.set(2021, Calendar.JUNE, 5);
        Appointment appointmentSix = new Appointment();
        appointmentSix.setAppointmentId(6L);
        appointmentSix.setDoctor(doctorDetails.get(1L));
        appointmentSix.setPatient(patientDetails.get(1L));
        appointmentSix.setDateOfVisit(appDate6.getTime());
        appointmentSix.setPurposeOfVisit("HeartPain");
        appointmentSix.setBp(110.5);
        appointmentSix.setTemperature(80.5);
        appointmentSix.setIsFirstVisit(false);

        Calendar appDate7 = Calendar.getInstance();
        appDate7.set(2021, Calendar.JULY, 10);
        Appointment appointmentSeven = new Appointment();
        appointmentSeven.setAppointmentId(7L);
        appointmentSeven.setDoctor(doctorDetails.get(1L));
        appointmentSeven.setPatient(patientDetails.get(1L));
        appointmentSeven.setDateOfVisit(appDate7.getTime());
        appointmentSeven.setPurposeOfVisit("HeartPain");
        appointmentSeven.setBp(120.7);
        appointmentSeven.setTemperature(76.1);
        appointmentSeven.setIsFirstVisit(false);

        Calendar appDate8 = Calendar.getInstance();
        appDate8.set(2021, Calendar.AUGUST, 12);
        Appointment appointmentEight = new Appointment();
        appointmentEight.setAppointmentId(8L);
        appointmentEight.setDoctor(doctorDetails.get(1L));
        appointmentEight.setPatient(patientDetails.get(5L));
        appointmentEight.setDateOfVisit(appDate8.getTime());
        appointmentEight.setPurposeOfVisit("HeartPain");
        appointmentEight.setBp(135.3);
        appointmentEight.setTemperature(81.4);
        appointmentEight.setIsFirstVisit(false);

        Calendar appDate9 = Calendar.getInstance();
        appDate9.set(2021, Calendar.APRIL, 6);
        Appointment appointmentNine = new Appointment();
        appointmentNine.setAppointmentId(9L);
        appointmentNine.setDoctor(doctorDetails.get(2L));
        appointmentNine.setPatient(patientDetails.get(2L));
        appointmentNine.setDateOfVisit(appDate9.getTime());
        appointmentNine.setPurposeOfVisit("BonesPain");
        appointmentNine.setBp(154.4);
        appointmentNine.setTemperature(79.5);
        appointmentNine.setIsFirstVisit(false);

        Appointment appointmentTen = new Appointment();
        appointmentTen.setAppointmentId(10L);
        appointmentTen.setDoctor(doctorDetails.get(2L));
        appointmentTen.setPatient(patientDetails.get(2L));
        appointmentTen.setDateOfVisit(Calendar.getInstance().getTime());
        appointmentTen.setPurposeOfVisit("BonesPain");
        appointmentTen.setBp(120.5);
        appointmentTen.setTemperature(90.5);
        appointmentTen.setIsFirstVisit(false);

        Calendar appDate10 = Calendar.getInstance();
        appDate10.set(2021, Calendar.NOVEMBER, 21);
        Appointment appointmentEleven = new Appointment();
        appointmentEleven.setAppointmentId(11L);
        appointmentEleven.setDoctor(doctorDetails.get(2L));
        appointmentEleven.setPatient(patientDetails.get(2L));
        appointmentEleven.setDateOfVisit(appDate10.getTime());
        appointmentEleven.setPurposeOfVisit("BonesPain");
        appointmentEleven.setBp(135.5);
        appointmentEleven.setTemperature(76.5);
        appointmentEleven.setIsFirstVisit(false);

        Calendar appDate11 = Calendar.getInstance();
        appDate11.set(2021, Calendar.JUNE, 3);
        Appointment appointmentTwelve = new Appointment();
        appointmentTwelve.setAppointmentId(12L);
        appointmentTwelve.setDoctor(doctorDetails.get(2L));
        appointmentTwelve.setPatient(patientDetails.get(2L));
        appointmentTwelve.setDateOfVisit(appDate11.getTime());
        appointmentTwelve.setPurposeOfVisit("BonesPain");
        appointmentTwelve.setBp(140.7);
        appointmentTwelve.setTemperature(89.1);
        appointmentTwelve.setIsFirstVisit(false);

        Calendar appDate12 = Calendar.getInstance();
        appDate12.set(2021, Calendar.OCTOBER, 6);
        Appointment appointmentThirteen = new Appointment();
        appointmentThirteen.setAppointmentId(13L);
        appointmentThirteen.setDoctor(doctorDetails.get(3L));
        appointmentThirteen.setPatient(patientDetails.get(5L));
        appointmentThirteen.setDateOfVisit(appDate12.getTime());
        appointmentThirteen.setPurposeOfVisit("TeethPain");
        appointmentThirteen.setBp(135.3);
        appointmentThirteen.setTemperature(81.4);
        appointmentThirteen.setIsFirstVisit(false);

        Calendar appDate13 = Calendar.getInstance();
        appDate13.set(2021, Calendar.JUNE, 9);
        Appointment appointmentFourteen = new Appointment();
        appointmentFourteen.setAppointmentId(14L);
        appointmentFourteen.setDoctor(doctorDetails.get(4L));
        appointmentFourteen.setPatient(patientDetails.get(5L));
        appointmentFourteen.setDateOfVisit(appDate13.getTime());
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

        Calendar ED1 = Calendar.getInstance();
        ED1.set(2025, Calendar.DECEMBER, 12);
        Medicine medicineForCardiologist = new Medicine();
        medicineForCardiologist.setMedicineId(1L);
        medicineForCardiologist.setPurposeOfMedicine("HeartPain");
        medicineForCardiologist.setMedicineName("Aspirin");
        medicineForCardiologist.setBatchNumber("a01");
        medicineForCardiologist.setExpiryDate(ED1.getTime());

        Calendar ED2 = Calendar.getInstance();
        ED2.set(2024, Calendar.MARCH, 8);
        Medicine medicineForOrthopedic = new Medicine();
        medicineForOrthopedic.setMedicineId(2L);
        medicineForOrthopedic.setPurposeOfMedicine("BonesPain");
        medicineForOrthopedic.setMedicineName("Methocarbamol");
        medicineForOrthopedic.setBatchNumber("m02");
        medicineForOrthopedic.setExpiryDate(ED2.getTime());

        Calendar ED3 = Calendar.getInstance();
        ED3.set(2023, Calendar.JULY, 10);
        Medicine medicineForDentist = new Medicine();
        medicineForDentist.setMedicineId(3L);
        medicineForDentist.setPurposeOfMedicine("TeethPain");
        medicineForDentist.setMedicineName("Clindamycin");
        medicineForDentist.setBatchNumber("c03");
        medicineForDentist.setExpiryDate(ED3.getTime());

        Calendar ED4 = Calendar.getInstance();
        ED4.set(2022, Calendar.FEBRUARY, 8);
        Medicine medicineForNeurologist = new Medicine();
        medicineForNeurologist.setMedicineId(4L);
        medicineForNeurologist.setPurposeOfMedicine("BrainPain");
        medicineForNeurologist.setMedicineName("Lamotrigine");
        medicineForNeurologist.setBatchNumber("l04");
        medicineForNeurologist.setExpiryDate(ED4.getTime());

        Calendar ED5 = Calendar.getInstance();
        ED5.set(2024, Calendar.NOVEMBER, 12);
        Medicine medicineForPulmonologist = new Medicine();
        medicineForPulmonologist.setMedicineId(5L);
        medicineForPulmonologist.setPurposeOfMedicine("lung cancer");
        medicineForPulmonologist.setMedicineName("ciclesonide");
        medicineForPulmonologist.setBatchNumber("c05");
        medicineForPulmonologist.setExpiryDate(ED5.getTime());

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

        Bed bedSix = new Bed();
        bedSix.setBedId(6L);
        bedSix.setBedType("Manual Bed");
        bedSix.setRoomName("F");

        Bed bedSeven = new Bed();
        bedSeven.setBedId(7L);
        bedSeven.setBedType("Manual Bed");
        bedSeven.setRoomName("G");

        Bed bedEight = new Bed();
        bedEight.setBedId(8L);
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

        IP INPatientMohan = new IP();
        INPatientMohan.setIpIdentificationNumber(1L);
        INPatientMohan.setPatient(patientDetails.get(20L));
        INPatientMohan.setBed(bedDetails.get(1L));

        INPatientDetails = new HashMap<>();
        INPatientDetails.put(INPatientMohan.getIpIdentificationNumber(), INPatientMohan);

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
            if (medicineDetails.containsKey(new Long(randomNumber))) ;
            medicineList.add(medicineDetails.get(new Long(randomNumber)));
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
        headCheckUp.setFollowUpNeed(true);
        headCheckUp.setListOfMedicine(getMedicine());

        VisitLogInformation spirometryCheckUp = new VisitLogInformation();
        spirometryCheckUp.setVisitId(8L);
        spirometryCheckUp.setAppointment(appointmentDetails.get(14L));
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

    static public void report() {

        ReportBO reportBO = new ReportBO();
        try {
            reportBO.getPatientDetail(patientDetails, 6L, "Mohan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            reportBO.listOfVisitForPatientId(visitDetails, 2L);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            reportBO.displayOutPatient(patientDetails);
        } catch (Exception e) {
            System.out.println(" Invalid Patient details : " + e.getMessage());
        }

        try {
            reportBO.displayInPatient(INPatientDetails);
        } catch (Exception e) {
            System.out.println(" Invalid InPatient details : " + e.getMessage());
        }

        try {
            reportBO.displayPatientByDoctorId(appointmentDetails, 1L);
        } catch (Exception e) {
            System.out.println(" appointmentDetails details is empty : " + e.getMessage());
        }

        try {
            reportBO.patientFollowUpVisit(visitDetails);
        } catch (Exception e) {
            System.out.println(" PatientFollowUpVisit details is empty : " + e.getMessage());
        }

        reportBO.getVisitDetail(visitDetails);

    }

    public static void main(String[] args) {

        populateVisitInformation();

        AppointmentBO appointmentBO = new AppointmentBO();
        VisitInformationBO visitInformation = new VisitInformationBO();
        INPatientBO inPatientBO = new INPatientBO();

        appointmentBO.createAppointment(8L, patientDetails, 5L, doctorDetails,
                "Bone Pain", appointmentDetails);

        visitInformation.createVisitLogInformation(9L, appointmentDetails, visitDetails, medicineList,
                "TeethPain", true, patientDetails, doctorDetails);

        inPatientBO.allocateBedForIP(2L, 1L, patientDetails, bedDetails, INPatientDetails);

        report();

    }
}

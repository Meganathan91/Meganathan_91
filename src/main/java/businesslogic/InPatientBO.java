package businesslogic;

import entity.Bed;
import entity.InPatient;
import entity.Patient;
import generateid.GenerateIPIdentificationNumber;

import java.util.ArrayList;
import java.util.Map;

public class InPatientBO {

    public void allocateBedForInPatient(Long patientId, Map<Long, Patient> patientDetails, Long bedId,
                                             Map<Long, Bed> bedDetails, Map<Long, InPatient> inPatientMap, String bedType, String roomName) throws Exception {

        InPatient inPatient = new InPatient();

        if (patientId == null) {
            throw new Exception("InValid Patient Id : ");
        }
        if (bedId == null || bedId > 8) {
            throw new Exception("BedId is not Available : ");
        }
        if (patientDetails.isEmpty()) {
            throw new Exception("InPatient Details is Empty : ");
        }
        if (bedDetails.isEmpty()) {
            throw new Exception("BedDetails Is Empty : ");
        }

        if (bedType == null) {
            throw new Exception("Bed Is Not Available : ");
        }
        if (roomName == null) {
            throw new Exception("Room Is Not Available : ");
        }

        Patient patient = new Patient();
        if (patientDetails.containsKey(patientId)) {
            patient = patientDetails.get(patientId);
        } else {
            throw new Exception("Patient is not Available : ");
        }

        inPatient.setIpIdentificationNumber(GenerateIPIdentificationNumber.getIpIdentificationNumber(new ArrayList<Long>(inPatientMap.keySet())));

        if (patient.getPatientType().equals("IP")) {
            inPatient.setPatient(patient);
            inPatient.setBed(bedDetails.get(bedId));
        } else {
            throw new Exception("Won't allocate bed for out-patient");
        }
            inPatientMap.put(inPatient.getIpIdentificationNumber(), inPatient);

        }
    }


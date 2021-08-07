package businesslogic;

import entity.Bed;
import entity.InPatient;
import entity.Patient;
import entity.VisitLogInformation;
import generateid.GenerateIPIdentificationNumber;
import generateid.GeneratePatientId;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class InPatientBO {

    public InPatient allocateBedForINPatient(Long patientId, Map<Long, Patient> patientDetails, Long bedId,
                                             Map<Long, Bed> bedDetails, String bedType, String roomName) throws Exception {

        InPatient inPatient = new InPatient();

        if (patientId == null) {
            throw new Exception("InValid InPatient Id : ");
        }
        if (bedId == null) {
            throw new Exception("BedId is Null : ");
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
            throw new Exception("he is not in-patient : ");
        }

        inPatient.setIpIdentificationNumber(GenerateIPIdentificationNumber.getIpIdentificationNumber(new ArrayList<>(patientDetails.keySet())));
        inPatient.setPatientId( GeneratePatientId.getPatientId( new ArrayList<>( patientDetails.keySet())));
        if (patient.getPatientType().equals("IP")) {
            inPatient.setBed(bedDetails.get(bedId));
        } else {
            throw new Exception("Won't allocate bed for out-patient");
        }
        return inPatient;
    }
}

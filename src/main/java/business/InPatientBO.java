package business;

import entity.Bed;
import entity.InPatient;
import entity.Patient;
import utility.HMSUtility;

import java.util.ArrayList;
import java.util.Map;

public class InPatientBO {

    public void patientConvertAsInPatient(Patient patient, Map<Long, Bed> bedDetails, Map<Long, InPatient> inPatientMap) {

        try {
            InPatient inPatient = new InPatient();
            inPatient.setIpIdentificationNumber(HMSUtility.getId(new ArrayList<>(inPatientMap.keySet())));
            inPatient.setPatient(patient);
            inPatient.setBed(getBed(bedDetails, 1L));
            inPatientMap.put(inPatient.getIpIdentificationNumber(), inPatient);
            System.out.println("In Patient Allocated successfully ....." + "\n" +inPatient +"\n");
        } catch (Exception e) {
            System.out.println(" In Patient Allocate Exception " + e.getMessage());
        }
    }

    private Bed getBed(Map<Long, Bed> bedDetails, Long bedId) throws Exception {
        Bed bed = null;
        if (bedDetails.isEmpty() || bedId == null || bedId == 0)
            throw new Exception("bed is not available ");
        if (bedDetails.containsKey(bedId)) {
            bed = bedDetails.get(bedId);
        }
        return bed;
    }
}
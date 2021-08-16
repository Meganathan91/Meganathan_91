package business;

import entity.Bed;
import entity.IP;
import entity.Patient;
import utility.HMSUtility;

import java.util.ArrayList;
import java.util.Map;

public class InPatientBO {

    public void allocateBedForIP(Patient patient, Map<Long, Bed> bedDetails, Map<Long, IP> inPatientMap) {
        InPatientBO patientBO = new InPatientBO();

        /* check given parameter values are valid, calling validateIPFields.
         calling allocateBedForIP method, check given patientId contain in patientMap and for this object check
         patientType is "IP". This patient object is IP object, create IP object set this IP patient object and
          set bed given bedId. Finally put this inpatient object into inPatientMap.
         */
        try {
            validateIPFields(patient, bedDetails);
            IP ip = patientBO.allocateBed(patient, inPatientMap, bedDetails);
            inPatientMap.put(ip.getIpIdentificationNumber(), ip);
        } catch (
                Exception e) {
            System.out.println(" Allocate Bed Exception " + e.getMessage());
        }
    }

    private void validateIPFields(Patient patient, Map<Long, Bed> bedDetails) throws Exception {

        if (patient == null) {
            throw new Exception("patient is not available : ");
        }
        if (bedDetails.isEmpty()) {
            throw new Exception("BedDetails is Empty : ");
        }
    }

    private IP allocateBed(Patient patient, Map<Long, IP> inPatientMap, Map<Long, Bed> bedDetails) throws Exception {

        IP inPatient = null;
        if (patient != null && patient.getPatientType().equals("IP")) {
            inPatient = new IP();
            inPatient.setIpIdentificationNumber(HMSUtility.getId(new ArrayList<>(inPatientMap.keySet())));
            inPatient.setPatient(patient);
            inPatient.setBed(getBed(bedDetails, 1L));
        }
        return inPatient;
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
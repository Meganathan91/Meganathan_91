package businesslogic;

import entity.Bed;
import entity.IP;
import entity.Patient;
import utility.HMSUtility;

import java.util.ArrayList;
import java.util.Map;

public class INPatientBO {

    public void allocateBedForIP(Long patientId, Long bedId, Map<Long, Patient> patientMap, Map<Long, Bed> bedDetails, Map<Long, IP> inPatientMap) {
        INPatientBO patientBO = new INPatientBO();

        /* check given parameter values are valid, calling validateIPFields.
         calling allocateBedForIP method, check given patientId contain in patientMap and for this object check
         patientType is "IP". This patient object is IP object, create IP object set this IP patient object and
          set bed given bedId. Finally put this inpatient object into inPatientMap.
         */
        try {
            validateIPFields(patientId, bedId, bedDetails, inPatientMap, patientMap);
            IP ip = patientBO.allocateBed(patientId, inPatientMap, patientMap, bedDetails, bedId);
            inPatientMap.put(ip.getIpIdentificationNumber(), ip);
        } catch (
                Exception e) {
            System.out.println(" Allocate Bed :" + e.getMessage());
        }

    }

    private void validateIPFields(Long patientId, Long bedId, Map<Long, Bed> bedDetails, Map<Long, IP> inPatientMap, Map<Long, Patient> patientMap) throws Exception {

        if (patientId == null || !patientMap.containsKey(patientId)) {
            throw new Exception("patient is not available : ");
        }
        if (bedId == null || !bedDetails.containsKey(bedId)) {
            throw new Exception("BedId is not Available : ");
        }
        if (bedDetails.isEmpty()) {
            throw new Exception("BedDetails is Empty : ");
        }
        if (inPatientMap.isEmpty()) {
            throw new Exception("inPatientMap is Empty : ");
        }
    }

    private IP allocateBed(Long patientId, Map<Long, IP> inPatientMap, Map<Long, Patient> patientMap, Map<Long, Bed> bedDetails, Long bedId) throws Exception {

        IP inPatient;
        Patient patient = null;

        if (patientMap.containsKey(patientId)) {
            patient = patientMap.get(patientId);
        }
        if (!patient.getPatientType().equals("IP"))
            throw new Exception("do not allocate bed for OP ");
        inPatient = new IP();
        inPatient.setIpIdentificationNumber(HMSUtility.getId(new ArrayList<>(inPatientMap.keySet())));
        inPatient.setPatient(patient);
        inPatient.setBed(bedDetails.get(bedId));

        return inPatient;
    }
}
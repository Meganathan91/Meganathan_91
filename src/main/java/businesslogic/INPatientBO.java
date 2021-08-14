package businesslogic;

import entity.Bed;
import entity.IP;
import entity.Patient;
import utility.HMSUtility;

import java.util.ArrayList;
import java.util.Map;

public class INPatientBO {

    public void allocateBedForIP(Long patientId, Long bedId, Map<Long, Patient> patientMap, Map<Long, Bed> bedDetails, Map<Long, IP> inPatientMap,
                                 String bedType, String roomName) {
        INPatientBO patientBO = new INPatientBO();

        // check given parameter values are valid, calling checkException.
        try {
            displayException(patientId, bedId, bedDetails, inPatientMap, bedType, roomName);
        } catch (Exception e) {
            System.out.println(" Allocate Bed " + e.getMessage());
        }

        /*
         calling allocateBedForIP method, check given patientId contain in patientMap and for this object check
         patientType is "IP". This patient object is IP object, create IP object set this IP patient object and
          set bed given bedId. Finally put this inpatient object into inPatientMap.
         */
        IP ip = patientBO.allocateBedForIP(patientId, inPatientMap, patientMap, bedDetails, bedId);
        inPatientMap.put(ip.getIpIdentificationNumber(), ip);
    }

    private void displayException(Long patientId, Long bedId, Map<Long, Bed> bedDetails, Map<Long, IP> inPatientMap,
                                String bedType, String roomName) throws Exception {

        if (patientId == null) {
            throw new Exception("patient is not available : ");
        }
        if (bedId == null || bedId > 8) {
            throw new Exception("BedId is not Available : ");
        }
        if (bedDetails.isEmpty()) {
            throw new Exception("BedDetails is Empty : ");
        }
        if (inPatientMap.isEmpty()) {
            throw new Exception("inPatientMap is Empty : ");
        }
        if (bedType == null) {
            throw new Exception("Bed is Not Available : ");
        }
        if (roomName == null) {
            throw new Exception("Room is Not Available : ");
        }
    }

    private IP allocateBedForIP(Long patientId, Map<Long, IP> inPatientMap, Map<Long, Patient> patientMap, Map<Long, Bed> bedDetails, Long bedId) {

        IP inPatient = new IP();
        Patient patient = null;

        inPatient.setIpIdentificationNumber(HMSUtility.getId(new ArrayList<>(inPatientMap.keySet())));

        if (patientMap.containsKey(patientId)) {
            patient = patientMap.get(patientId);
        }
        if (patient != null && patient.getPatientType().equals("IP")) {
            inPatient.setPatient(patient);
            inPatient.setBed(bedDetails.get(bedId));
        }
        return inPatient;
    }
}
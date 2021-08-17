package business;

import entity.Bed;
import entity.InPatient;
import entity.VisitLogInformation;
import utility.HMSUtility;

import java.util.ArrayList;
import java.util.Map;

public class InPatientBO {

    public void allocateBedForInPatient(VisitLogInformation visitLogInformation, Map<Long, Bed> bedDetails, Map<Long, InPatient> inPatientMap) {

        try {
            validateInPatientFields(visitLogInformation, bedDetails);
            InPatient inPatient = allocateBed(visitLogInformation, inPatientMap, bedDetails);

            System.out.println("Bed Allocated successfully ....." + "\n" +inPatient +"\n");

            inPatientMap.put(inPatient.getIpIdentificationNumber(), inPatient);
        } catch (Exception e) {
            System.out.println(" Allocate Bed Exception " + e.getMessage());
        }
    }

    private void validateInPatientFields(VisitLogInformation visitLogInformation, Map<Long, Bed> bedDetails) throws Exception {
        if (visitLogInformation == null) {
            throw new Exception("visitLogInformation is not available");
        }
        if (bedDetails.isEmpty()) {
            throw new Exception("BedDetails is Empty");
        }
    }

    private InPatient allocateBed(VisitLogInformation visitLogInformation, Map<Long, InPatient> inPatientMap, Map<Long, Bed> bedDetails) throws Exception {
        InPatient inPatient = null;
        if ( visitLogInformation != null && visitLogInformation.getAppointment() != null &&
                visitLogInformation.getAppointment().getPatient() != null &&
                visitLogInformation.getAppointment().getPatient().getPatientType().equals("IP") ) {
            inPatient = new InPatient();
            inPatient.setIpIdentificationNumber(HMSUtility.getId(new ArrayList<>(inPatientMap.keySet())));
            inPatient.setPatient(visitLogInformation.getAppointment().getPatient());
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
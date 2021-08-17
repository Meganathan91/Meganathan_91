package business;

import entity.Appointment;
import entity.InPatient;
import entity.Patient;
import entity.VisitLogInformation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ReportBO {
    /* 1. Generated report for patient detail for given patient name/id,
       2. Displayed list of visit for given patientId
       3. Displayed out-patient details from patient map.
       4. Displayed in-patient from in-patient map.
       5. Displayed list of patient details for followup visit.
       6. Displayed patients list for given doctorId.
       7. Displayed today visited patient details,
       8. Displayed visit details for given date range.
     */

    public void displayHospitalReport(Map<Long, Patient> patientDetails, Map<Long, Appointment> appointmentDetails,
                                      Map<Long, VisitLogInformation> visitDetails, Map<Long, InPatient> inPatientDetails) throws Exception {
        if (patientDetails.isEmpty())
            throw new Exception("Patient details is empty ");
        if (appointmentDetails.isEmpty())
            throw new Exception("appointment Details is empty ");
        if (visitDetails.isEmpty())
            throw new Exception("visit Details is empty ");
        if (inPatientDetails.isEmpty())
            throw new Exception("inPatient Details is empty ");

        System.out.println("Patient detail for given patient id .....");
        if (patientDetails.containsKey(2L)) {                                  // input patientId 2L
            Patient patient = patientDetails.get(2L);
            System.out.println(patient + "\n");
        }

        System.out.println("Patient detail for given patient name .....");
        for (Long patientId : patientDetails.keySet()) {
            Patient _patient = patientDetails.get(patientId);
            if (_patient.getPatientName().equals("Mohan")) {                 // input patient name "Mohan"
                System.out.println(_patient+ "\n");
            }
        }

        System.out.println("List of visit for patient id .....");
        VisitLogInformation visitLogInformation;
        for (Long visitId : visitDetails.keySet()) {
            visitLogInformation = visitDetails.get(visitId);
            if (visitLogInformation.getAppointment().getPatient().getPatientId().equals(5L)) {    // input patientId 5L
                System.out.println(visitLogInformation + "\n");
            }
        }

        System.out.println("OutPatient Details .....");
        for (Long patientId : patientDetails.keySet()) {
            Patient patient = patientDetails.get(patientId);
            if (patient.getPatientType().equals("OP")) {                 // input patientType "OP"
                System.out.println(patient + "\n");
            }
        }

        System.out.println("InPatient Details .....");
        Iterator<Long> ipIdentificationNumber = inPatientDetails.keySet().iterator();
        InPatient inPatient;
        while (ipIdentificationNumber.hasNext()) {
            inPatient = inPatientDetails.get(ipIdentificationNumber.next());
            System.out.println(inPatient.getPatient() + "\n");
        }

        System.out.println("Patient who's needs the follow up visit .....");
        for(Long visitId : visitDetails.keySet()) {
            VisitLogInformation _visitLogInformation = visitDetails.get(visitId);
            if (_visitLogInformation.getFollowUpNeed()) {
                System.out.println(_visitLogInformation.getAppointment().getPatient() + "\n");
            }
        }

        System.out.println("List of patient by doctor id .....");
        for (Long appointmentId : appointmentDetails.keySet()) {
            Appointment appointment = appointmentDetails.get(appointmentId);
            if (appointment.getDoctor().getDoctorId().equals(5L)) {    // display patient details by doctorId 2L
                System.out.println(appointment.getPatient() + "\n");
            }
        }

        System.out.println("Today visited patient detail .....");
        Appointment appointment;
        VisitLogInformation _visitLogInformation;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd");

        for (Long visitId : appointmentDetails.keySet()) {
            appointment = appointmentDetails.get(visitId);
            Date date = appointment.getDateOfVisit();
            String dateOne = dateFormat.format(date);
            String dateTwo = dateFormat1.format(Calendar.getInstance().getTime());
            if (dateOne.equals(dateTwo)) {
                System.out.println(appointment.getPatient() + "\n");    // displayed today visited patient details
            }
        }

        System.out.println("Visit details between date range .....");

        SimpleDateFormat dateFormats = new SimpleDateFormat("yyyy/MM/dd");
        Iterator<Long> visitId = visitDetails.keySet().iterator();
        Date date;
        while (visitId.hasNext()) {
            _visitLogInformation = visitDetails.get(visitId.next());
            date = _visitLogInformation.getAppointment().getDateOfVisit();
            try {
                Date visitDate = dateFormats.parse(dateFormats.format(date));
                Date startDate = new SimpleDateFormat("yyyy/MM/dd").parse("2021/1/1");  // VisitLogInformation between 2021/1/1 to 2021/7/12
                Date endDate = new SimpleDateFormat("yyyy/MM/dd").parse("2021/7/12");
                if (visitDate.after(startDate) && visitDate.before(endDate)) {
                    System.out.println(_visitLogInformation + "\n");
                }
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

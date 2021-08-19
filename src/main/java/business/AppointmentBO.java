package business;

import entity.Appointment;
import entity.Doctor;
import entity.Patient;
import utility.HMSUtility;
import java.util.*;

public class AppointmentBO {
    public Appointment createAppointment(Long patientId, Map<Long, Patient> patientMap, Long doctorId,
                                         Map<Long, Doctor> doctorMap, Map<Long, Appointment> appointmentMap) {
        Appointment appointment = null;

        // check given parameter values are valid, calling validateAppointmentFields.
        try {
            validateAppointmentFields(patientId, patientMap, doctorId, appointmentMap);

            appointment = new Appointment();
            appointment.setAppointmentId(HMSUtility.getId(new ArrayList<>(appointmentMap.keySet()))); // get appointmentId calling HMSUtility.
            appointment.setDateOfVisit(Calendar.getInstance().getTime());
            if (!doctorMap.containsKey(doctorId)) {
                throw new Exception("doctor is not available...");
            } else {
                appointment.setDoctor(doctorMap.get(doctorId));
            }
            appointment.setPatient(getPatient(patientId, patientMap));
            appointment.setPurposeOfVisit("Bone Pain");
            appointment.setBp(120.6);
            appointment.setTemperature(85.3);
            appointment.setIsFirstVisit(isFirstVisit(appointmentMap, patientId)); // check patientId already have an appointment

            //System.out.println("Appointment created successfully ....." + "\n" +appointment + "\n");

            appointmentMap.put(appointment.getAppointmentId(), appointment);

        } catch (Exception e) {
            System.out.println("Appointment Exception " + e.getMessage());
        }
        return appointment;
    }

    private boolean isFirstVisit(Map<Long, Appointment> appointmentMap, Long patientId) {
        for (Long appointmentId : appointmentMap.keySet()) {
            Appointment appointment = appointmentMap.get(appointmentId);
            if(appointment.getPatient() != null && appointment.getPatient().getPatientId() == patientId) {
                return false;
            }
        }
        return  true;
    }

    private void validateAppointmentFields(Long patientId, Map<Long, Patient> patientMap, Long doctorId,
                                           Map<Long, Appointment> appointmentMap) throws Exception {
        if (patientId == null || patientId == 0)
            throw new Exception("Patient id is invalid ");
        if (patientMap.isEmpty())
            throw new Exception("patientMap is empty ");
        if (doctorId == null || doctorId == 0)
            throw new Exception("doctor id is invalid ");
        if (appointmentMap.isEmpty())
            throw new Exception("appointmentMap is empty ");
    }

    private Patient getPatient(Long patientId, Map<Long, Patient> patientMap) {
        Patient patient;

        if (patientMap.containsKey(patientId)) {
            patient = patientMap.get(patientId);
        } else {
            patient = new Patient();
            patient.setPatientId(HMSUtility.getId(new ArrayList<>(patientMap.keySet())));
            patient.setPatientName("Suresh");
            patient.setDob(new Date());
            patient.setAddress("Perambalur");
            patient.setPhoneNumber("9197852304");
            patient.setPatientType("OP");

            patientMap.put(patient.getPatientId(), patient);
        }
        return patient;
    }
}

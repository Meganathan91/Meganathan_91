package businesslogic;

import entity.Appointment;
import entity.Doctor;
import entity.Patient;
import utility.HMSUtility;
import java.util.*;

public class AppointmentBO {
    /* create appointment for patient, this appointment contain patientId for first
       time visit, appointment having member Boolean isFirstVisit by default true otherwise false.
       after creating appointment put this appointment into appointment map as key(appointmentId)
       and value(appointment object) pair.*/
    public Appointment createAppointment(Long patientId, Map<Long, Patient> patientMap, Long doctorId,
                                         Map<Long, Doctor> doctorMap, String purposeOfVisit,
                                         Map<Long, Appointment> appointmentMap) {
        Appointment appointment = null;
        Patient patient;
        // check given parameter values are valid, calling checkException.
        try {
            validateAppointmentFields(patientId, patientMap, doctorId, doctorMap, purposeOfVisit, appointmentMap);
            patient = getPatient(patientId, patientMap);

            appointment = new Appointment();
            appointment.setAppointmentId(HMSUtility.getId(new ArrayList<>(appointmentMap.keySet())));
            appointment.setDateOfVisit(Calendar.getInstance().getTime());
            appointment.setDoctor(doctorMap.get(doctorId));
            appointment.setPatient(patient);
            appointment.setPurposeOfVisit(purposeOfVisit);
            appointment.setBp(120.6);
            appointment.setTemperature(85.3);
            appointment.setIsFirstVisit(true);

            Iterator<Long> appointmentId = appointmentMap.keySet().iterator();
            Appointment appointments;
            while (appointmentId.hasNext()) {
                appointments = appointmentMap.get(appointmentId.next());
                if (appointments.getPatient() != null && appointments.getPatient().getPatientId() == patientId) {
                    appointment.setIsFirstVisit(false);
                    break;
                }
            }
            appointmentMap.put(appointment.getAppointmentId(), appointment);
        } catch (Exception e) {
            System.out.println("validateAppointmentFields " + e.getMessage());
        }
        return appointment;
    }

    private void validateAppointmentFields(Long patientId, Map<Long, Patient> patientMap, Long doctorId,
                                           Map<Long, Doctor> doctorMap, String purposeOfVisit,
                                           Map<Long, Appointment> appointmentMap) throws Exception {
        if (patientId == null || patientId == 0)
            throw new Exception("Patient id is invalid ");
        if (patientMap.isEmpty())
            throw new Exception("patientMap is empty ");
        if (doctorId == null || !doctorMap.containsKey(doctorId))
            throw new Exception("doctor is not available ");
        if (doctorMap.isEmpty())
            throw new Exception("doctorMap is empty ");
        if (appointmentMap.isEmpty())
            throw new Exception("appointmentMap is empty ");
        if (purposeOfVisit == null)
            throw new Exception("Given input is invalid ");
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

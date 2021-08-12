package businesslogic;

import entity.Appointment;
import entity.Doctor;
import entity.Patient;
import generateid.HMSUtility;
import sun.util.resources.cldr.aa.CalendarData_aa_ER;

import java.util.*;

public class AppointmentBO {

    /* create appointment for patient, this appointment contain patientId for first
       time visit, appointment having member Boolean isFirstVisit by default true otherwise false.
       after creating appointment put this appointment into appointment map as key(appointmentId)
       and value(appointment object) pair.
     */
    public Appointment createAppointment(Long patientId, Map<Long, Patient> patientMap, Long doctorId,
                                         Map<Long, Doctor> doctorMap, String purposeOfVisit,
                                         Map<Long, Appointment> appointmentMap) {

        // check given parameter values are valid, calling checkException.
        try {
            checkException(patientId, patientMap, doctorId, doctorMap, purposeOfVisit, appointmentMap);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // call patient for appointment, patient is not available create patient object and than create appointment.
        Patient patient = getPatient(patientId, patientMap);

        System.out.println("created new patient " + patient);

        Appointment appointment = new Appointment();
        appointment.setAppointmentId(HMSUtility.getId(new ArrayList<>(appointmentMap.keySet())));
        appointment.setDateOfVisit(Calendar.getInstance().getTime());
        appointment.setDoctor(doctorMap.get(doctorId));
        appointment.setPatient(patient);
        appointment.setPurposeOfVisit(purposeOfVisit);
        appointment.setBp(120.6);
        appointment.setTemperature(85.3);
        appointment.setIsFirstVisit(true);

        Iterator<Long> itr = appointmentMap.keySet().iterator();
        Appointment appointments;
        Long appointmentId;
        while (itr.hasNext()) {
            appointmentId = itr.next();
            appointments = appointmentMap.get(appointmentId);
            if (appointments.getPatient() != null && appointments.getPatient().getPatientId() == patientId) {
                appointment.setIsFirstVisit(false);
                break;
            }
        }
        appointmentMap.put(appointment.getAppointmentId(), appointment);

        System.out.println(appointment);

        return appointment;
    }

    private void checkException(Long patientId, Map<Long, Patient> patientMap, Long doctorId,
                                Map<Long, Doctor> doctorMap, String purposeOfVisit,
                                Map<Long, Appointment> appointmentMap) throws Exception {
        if (patientId == null)
            throw new Exception("Patient is not available ");
        if (patientMap.isEmpty())
            throw new Exception("patientMap is empty ");
        if (doctorId == null)
            throw new Exception("doctor is not available ");
        if (doctorMap.isEmpty())
            throw new Exception("doctorMap is empty ");
        if (appointmentMap.isEmpty())
            throw new Exception("appointmentMap is empty ");
        if (purposeOfVisit == null)
            throw new Exception("Give valid input ");
    }

    private Patient getPatient(Long patientId, Map<Long, Patient> patientMap) {
        Patient patient = new Patient();
        Calendar calendar = Calendar.getInstance();
        calendar.set(1972, 7, 28);

        patient.setPatientId(HMSUtility.getId(new ArrayList<>(patientMap.keySet())));

        if (patientMap.containsKey(patientId)) {
            patient = patientMap.get(patientId);
        } else {
            patient.setPatientName("Suresh");
            patient.setDob(calendar.getTime());
            patient.setAddress("Perambalur");
            patient.setPhoneNumber("9197852304");
            patient.setPatientType("OP");

            patientMap.put(patient.getPatientId(), patient);
        }
        return patient;
    }
}

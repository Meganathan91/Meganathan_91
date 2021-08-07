package businesslogic;

import entity.Appointment;
import entity.Doctor;
import entity.Patient;
import generateid.GenerateAppointmentId;

import java.util.*;

public class AppointmentBO {

    public Appointment createAppointment(Long patientId, Map<Long, Patient> patientMap, Long doctorId,
                                         Map<Long, Doctor> doctorMap, Date d, String purposeOfVisit,
                                         Map<Long, Appointment> appointmentMap) throws Exception {
        if (patientId == null)
            throw new Exception("Patient id is null");

        Patient p = new Patient();
        if (patientMap.containsKey(patientId)) {
            p = patientMap.get(patientId);
        }
        Appointment appointment = new Appointment();
        appointment.setAppointmentId(GenerateAppointmentId.getId(new ArrayList<>(appointmentMap.keySet())));
        appointment.setDateOfVisit(d);
        appointment.setDoctor(doctorMap.get(doctorId));
        appointment.setPatient(p);
        appointment.setPurposeOfVisit(purposeOfVisit);
        appointment.setIsFirstVisit(true);

        Iterator<Long> itr = appointmentMap.keySet().iterator();
        Appointment app = new Appointment();
        Long appointmentId;
        while (itr.hasNext()) {
            appointmentId = itr.next();
            app = appointmentMap.get(appointmentId);
            if (app.getPatient() != null && app.getPatient().getPatientId() == patientId) {
                appointment.setIsFirstVisit(false);
                break;
            }
        }

        return appointment;
    }
}

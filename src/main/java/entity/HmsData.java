package entity;

import java.util.Map;

public class HmsData {

     private Map<Long, Patient> patientDetails;

     private Map<Long, Appointment> appointmentDetails;

     private Map<Long, VisitLogInformation> visitDetails;

     private Map<Long, InPatient> inPatientDetails;

    public Map<Long, Patient> getPatientDetails() {
        return patientDetails;
    }

    public void setPatientDetails(Map<Long, Patient> patientDetails) {
        this.patientDetails = patientDetails;
    }

    public Map<Long, Appointment> getAppointmentDetails() {
        return appointmentDetails;
    }

    public void setAppointmentDetails(Map<Long, Appointment> appointmentDetails) {
        this.appointmentDetails = appointmentDetails;
    }

    public Map<Long, VisitLogInformation> getVisitDetails() {
        return visitDetails;
    }

    public void setVisitDetails(Map<Long, VisitLogInformation> visitDetails) {
        this.visitDetails = visitDetails;
    }

    public Map<Long, InPatient> getInPatientDetails() {
        return inPatientDetails;
    }

    public void setInPatientDetails(Map<Long, InPatient> inPatientDetails) {
        this.inPatientDetails = inPatientDetails;
    }

    @Override
    public String toString() {
        return "HmsData{" +
                "patientDetails=" + patientDetails +
                ", appointmentDetails=" + appointmentDetails +
                ", visitDetails=" + visitDetails +
                ", inPatientDetails=" + inPatientDetails +
                '}';
    }
}

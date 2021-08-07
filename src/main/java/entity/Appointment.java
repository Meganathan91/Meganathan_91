package entity;
import java.util.Date;

public class Appointment {
    private Long appointmentId;
    private Patient patient;
    private Date dateOfVisit;
    private String purposeOfVisit;
    private Boolean isFirstVisit;
    private Double bp;
    private Double temperature;
    private Doctor doctor;

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getPurposeOfVisit() {
        return purposeOfVisit;
    }

    public void setPurposeOfVisit(String purposeOfVisit) {
        this.purposeOfVisit = purposeOfVisit;
    }

    public Double getBp() {
        return bp;
    }

    public void setBp(Double bp) {
        this.bp = bp;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Boolean getIsFirstVisit() {
        return isFirstVisit;
    }

    public void setIsFirstVisit(Boolean firstVisit) {
        isFirstVisit = firstVisit;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId=" + appointmentId +
                ", patient=" + patient +
                ", dateOfVisit=" + dateOfVisit +
                ", purposeOfVisit='" + purposeOfVisit + '\'' +
                ", isFirstVisit=" + isFirstVisit +
                ", bp=" + bp +
                ", temperature=" + temperature +
                ", doctor=" + doctor +
                '}';
    }
}

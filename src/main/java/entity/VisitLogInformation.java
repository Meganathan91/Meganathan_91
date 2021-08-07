package entity;

import java.util.List;

public class VisitLogInformation {
    private Long visitId;
    private Appointment appointment;
    private String doctorRecommendation;
    private Boolean followUpNeed;
    private List<Medicine> listOfMedicine;

    public List<Medicine> getListOfMedicine() {
        return listOfMedicine;
    }

    public void setListOfMedicine(List<Medicine> listOfMedicine) {
        this.listOfMedicine = listOfMedicine;
    }

    public Boolean getFollowUpNeed() {
        return followUpNeed;
    }

    public void setFollowUpNeed(Boolean followUpNeed) {
        this.followUpNeed = followUpNeed;
    }

    public Long getVisitId() {
        return visitId;
    }

    public void setVisitId(Long visitId) {
        this.visitId = visitId;
    }

    public String getDoctorRecommendation() {
        return doctorRecommendation;
    }

    public void setDoctorRecommendation(String doctorRecommendation) {
        this.doctorRecommendation = doctorRecommendation;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "VisitLogInformation{" +
                "visitId=" + visitId +
                ", appointment=" + appointment +
                ", doctorRecommendation='" + doctorRecommendation + '\'' +
                ", followUpNeed=" + followUpNeed +
                ", listOfMedicine=" + listOfMedicine +
                '}';
    }
}


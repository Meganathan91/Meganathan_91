package entity;

public class Hospital {
    private Long hospitalId;
    private String hospitalName;
    private String hospitalLocation;

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalLocation='" + hospitalLocation + '\'' +
                '}';
    }
}

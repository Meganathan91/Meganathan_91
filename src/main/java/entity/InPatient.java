package entity;

public class InPatient {
    Long patientId;
    Long ipIdentificationNumber;
    Bed bed;

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getIpIdentificationNumber() {
        return ipIdentificationNumber;
    }

    public void setIpIdentificationNumber(Long ipIdentificationNumber) {
        this.ipIdentificationNumber = ipIdentificationNumber;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    @Override
    public String toString() {
        return "InPatient{" +
                "patientId=" + patientId +
                ", ipIdentificationNumber=" + ipIdentificationNumber +
                ", bed=" + bed +
                '}';
    }
}

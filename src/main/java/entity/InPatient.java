package entity;

public class InPatient {
    private Long ipIdentificationNumber;
    private Patient patient;
    private Bed bed;

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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "InPatient{" +
                ", ipIdentificationNumber=" + ipIdentificationNumber +
                ", patient=" + patient +
                ", bed=" + bed +
                '}';
    }
}

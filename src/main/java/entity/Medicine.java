package entity;

import java.util.Date;

public class Medicine {
    private Long medicineId;
    private String medicineName;
    private Date expiryDate;
    private String batchNumber;
    private String purposeOfMedicine;

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public Long getMedicineId() {
        return medicineId;
    }
    public void setMedicineId(Long medicineId) {
        this.medicineId = medicineId;
    }
    public String getMedicineName() {
        return medicineName;
    }
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    public String getPurposeOfMedicine() {
        return purposeOfMedicine;
    }
    public void setPurposeOfMedicine(String purposeOfMedicine) {
        this.purposeOfMedicine = purposeOfMedicine;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "medicineId=" + medicineId +
                ", medicineName='" + medicineName + '\'' +
                ", expiryDate=" + expiryDate +
                ", batchNumber='" + batchNumber + '\'' +
                ", purposeOfMedicine='" + purposeOfMedicine + '\'' +
                '}';
    }
}

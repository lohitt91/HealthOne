package com.example.healthone;

/**
 * Created by Aditya on 27-09-2016.
 */
public class Prescription {
    String prescription_id;
    String doctor_id;
    String medicine_id;
    String patient_id;
    String quantity;
    String intake_instructions;

    public String getPrescription_id() {
        return prescription_id;
    }

    public void setPrescription_id(String prescription_id) {
        this.prescription_id = prescription_id;
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getMedicine_id() {
        return medicine_id;
    }

    public void setMedicine_id(String medicine_id) {
        this.medicine_id = medicine_id;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getIntake_instructions() {
        return intake_instructions;
    }

    public void setIntake_instructions(String intake_instructions) {
        this.intake_instructions = intake_instructions;
    }

    public Prescription(String prescription_id, String doctor_id, String medicine_id, String patient_id, String quantity, String intake_instructions) {
        this.prescription_id = prescription_id;
        this.doctor_id = doctor_id;
        this.medicine_id = medicine_id;
        this.patient_id = patient_id;
        this.quantity = quantity;
        this.intake_instructions = intake_instructions;
    }
}

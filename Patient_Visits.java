package com.example.healthone;

import java.util.Date;

/**
 * Created by Aditya on 27-09-2016.
 */
public class Patient_Visits {
    String patient_id;
    String doctor_id;
    String reason_for_visit;
    String symptoms;
    Date visit_date;

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getReason_for_visit() {
        return reason_for_visit;
    }

    public void setReason_for_visit(String reason_for_visit) {
        this.reason_for_visit = reason_for_visit;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public Date getVisit_date() {
        return visit_date;
    }

    public void setVisit_date(Date visit_date) {
        this.visit_date = visit_date;
    }

    public Patient_Visits(String patient_id, String doctor_id, String reason_for_visit, String symptoms, Date visit_date) {
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.reason_for_visit = reason_for_visit;
        this.symptoms = symptoms;
        this.visit_date = visit_date;
    }
}

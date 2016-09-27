package com.example.healthone;

/**
 * Created by Aditya on 27-09-2016.
 */
public class Doctor {
    @com.google.gson.annotations.SerializedName("doctor_id")
    String doctor_id;
    String first;
    String last;
    String unique_number;
    String contact_number;
    String address;
    String email;


    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getUnique_number() {
        return unique_number;
    }

    public void setUnique_number(String unique_number) {
        this.unique_number = unique_number;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Doctor(String doctor_id, String first, String last, String unique_number, String contact_number, String address, String email) {
        this.doctor_id = doctor_id;
        this.first = first;
        this.last = last;
        this.unique_number = unique_number;
        this.contact_number = contact_number;
        this.address = address;
        this.email = email;
    }
}

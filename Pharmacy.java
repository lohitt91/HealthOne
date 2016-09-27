package com.example.healthone;

/**
 * Created by Aditya on 27-09-2016.
 */
public class Pharmacy {
    String pharmaccy_id;
    String pharmacy_name;
    String location;

    public Pharmacy(String pharmaccy_id) {
        this.pharmaccy_id = pharmaccy_id;
    }

    public String getPharmacy_name() {
        return pharmacy_name;
    }

    public void setPharmacy_name(String pharmacy_name) {
        this.pharmacy_name = pharmacy_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Pharmacy(String pharmaccy_id, String pharmacy_name, String location) {
        this.pharmaccy_id = pharmaccy_id;
        this.pharmacy_name = pharmacy_name;
        this.location = location;
    }
}

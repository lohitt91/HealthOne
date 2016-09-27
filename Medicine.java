package com.example.healthone;

/**
 * Created by Aditya on 27-09-2016.
 */
public class Medicine {

    String medicine_id;
    String medicine_name;

    public String getMedicine_id() {
        return medicine_id;
    }

    public void setMedicine_id(String medicine_id) {
        this.medicine_id = medicine_id;
    }

    public String getMedicine_name() {
        return medicine_name;
    }

    public void setMedicine_name(String medicine_name) {
        this.medicine_name = medicine_name;
    }

    public Medicine(String medicine_id, String medicine_name) {
        this.medicine_id = medicine_id;
        this.medicine_name = medicine_name;
    }
}

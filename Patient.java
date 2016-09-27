package com.example.healthone;

/**
 * Created by Aditya on 27-09-2016.
 */
public class Patient {
    String patient_id;
    String password;
    String first;
    String last;
    String age;
    String sex;
    String contact_number;;
    String address;
    String blood_group;
    String height;
    String weight;
    String email;

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Patient(String patient_id, String password, String first, String last, String age, String sex, String contact_number, String address, String blood_group, String height, String weight, String email) {
        this.patient_id = patient_id;
        this.password = password;
        this.first = first;
        this.last = last;
        this.age = age;
        this.sex = sex;
        this.contact_number = contact_number;
        this.address = address;
        this.blood_group = blood_group;
        this.height = height;
        this.weight = weight;
        this.email = email;
    }
}

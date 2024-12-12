package com.enigmacamp;

public class Nasabah {
    private Integer id;
    private String fullname;
    private String nik;
    private String phoneNumber;
    private String birthDate;

    public Nasabah(int id, String fullname, String nik, String phoneNumber, String birthDate) {
        this.id = id;
        this.fullname = fullname;
        this.nik = nik;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    public Nasabah() {

    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", nik='" + nik + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}

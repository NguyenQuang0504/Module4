package model;

public class Person {

    private String name;
    private String date;
    private String gender;
    private String country;
    private String cccd;
    private String go;
    private String seriVehicle;
    private String numChair;
    private String dateStart;
    private String dateEnd;
    private String note;
    private String city;
    private String district;
    private String commune;
    private String address;
    private  String phone;
    private String email;
    private Symptom symptom;
    private Infection infection;

    public Person(String name, String date, String gender, String country, String cccd, String go, String seriVehicle, String numChair, String dateStart, String dateEnd, String note, String city, String district, String commune, String address, String phone, String email, Symptom symptom, Infection infection) {
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.country = country;
        this.cccd = cccd;
        this.go = go;
        this.seriVehicle = seriVehicle;
        this.numChair = numChair;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.note = note;
        this.city = city;
        this.district = district;
        this.commune = commune;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.symptom = symptom;
        this.infection = infection;
    }

    public Symptom getSymptom() {
        return symptom;
    }

    public void setSymptom(Symptom symptom) {
        this.symptom = symptom;
    }

    public Infection getInfection() {
        return infection;
    }

    public void setInfection(Infection infection) {
        this.infection = infection;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getGo() {
        return go;
    }

    public void setGo(String go) {
        this.go = go;
    }

    public String getSeriVehicle() {
        return seriVehicle;
    }

    public void setSeriVehicle(String seriVehicle) {
        this.seriVehicle = seriVehicle;
    }

    public String getNumChair() {
        return numChair;
    }

    public void setNumChair(String numChair) {
        this.numChair = numChair;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

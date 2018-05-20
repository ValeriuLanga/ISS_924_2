package iss_924_2.domain;

public class Form {

    private String firstName;
    private String lastName;
    private String day;
    private String month;
    private String year;
    private String address;
    private String city;
    private String county;
    private String residence;
    private String actualCity;
    private String actualCounty;

    public Form() {}
    public Form(String firstName, String lastName, String day, String month, String year, String address, String city, String county, String residence, String actualCity, String actualCounty){
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.address = address;
        this.city = city;
        this.county = county;
        this.residence = residence;
        this.actualCity = actualCity;
        this.actualCounty = actualCounty;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getResidence() {
        return residence;
    }

    public String getActualCity() {
        return actualCity;
    }

    public String getActualCounty() {
        return actualCounty;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public void setActualCity(String actualCity) {
        this.actualCity = actualCity;
    }

    public void setActualCounty(String actualCounty) {
        this.actualCounty = actualCounty;
    }
}

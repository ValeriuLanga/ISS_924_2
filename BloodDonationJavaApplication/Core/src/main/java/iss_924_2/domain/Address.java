package iss_924_2.Domain;

import javax.persistence.Entity;

@Entity
public class Address extends Identifier<Integer> {

    /**
     *
     */
    private String street;

    /**
     *
     */
    private String number;

    /**
     *
     */
    private String city;

    /**
     *
     */
    private String country;

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

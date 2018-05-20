package iss_924_2.domain;

import javax.persistence.Entity;
import java.util.*;

/**
 * 
 */
@Entity
public class Donor extends User {

    /**
     * Default constructor
     */
    public Donor() {}

    public Donor(String userName, String password, String firstName, String lastName, Date dateOfBirth, Address address, Address actualAddress) {

        super(userName, password, firstName, lastName);
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.actualAddress = actualAddress;
    }

    /**
     * 
     */
    private Date dateOfBirth;

    /**
     * 
     */
    private Address address;

    /**
     * 
     */
    private Address actualAddress;

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public Address getActualAddress() {
        return actualAddress;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setActualAddress(Address actualAddress) {
        this.actualAddress = actualAddress;
    }
}
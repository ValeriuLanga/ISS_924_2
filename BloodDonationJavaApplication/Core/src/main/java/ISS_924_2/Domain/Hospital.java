package iss_924_2.Domain;

import javax.persistence.Entity;
import java.util.*;

/**
 * 
 */
@Entity
public class Hospital extends Identifier<Integer> {

    /**
     * Default constructor
     */
    public Hospital() {
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Set<BloodContainer> bloodStock;

    /**
     * 
     */
    private Address address;


    public String getName() {
        return name;
    }

    public Set<BloodContainer> getBloodStock() {
        return bloodStock;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBloodStock(Set<BloodContainer> bloodStock) {
        this.bloodStock = bloodStock;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
package iss_924_2.domain;

import javax.persistence.Entity;
import java.util.*;

/**
 * 
 */
@Entity
public class BloodDonation extends Identifier<Integer> {

    /**
     * Default constructor
     */
    public BloodDonation() {}

    public BloodDonation(int bloodId, int quantity, State state) {

        this.bloodId = bloodId;
        this.quantity = quantity;
        this.state = state;
    }

    /**
     * 
     */
    private int bloodId;

    /**
     * 
     */
    private int quantity;

    /**
     *
     */
    private enum State {};

    private State state;

    /**
     *
     */
    private Date expirationDate;

    public int getBloodId() {
        return bloodId;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setBloodId(int bloodId) {
        this.bloodId = bloodId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

}
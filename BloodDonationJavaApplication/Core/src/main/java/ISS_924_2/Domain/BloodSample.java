package iss_924_2.domain;

import javax.persistence.Entity;

/**
 * 
 */
@Entity
public class BloodSample extends Identifier<Integer> {

    /**
     * Default constructor
     */
    public BloodSample() {}

    public BloodSample(int bloodSampleId, int quantity) {

        this.bloodSampleId = bloodSampleId;
        this.quantity = quantity;
    }

    /**
     * 
     */
    private int bloodSampleId;

    /**
     * 
     */
    private int quantity;

    public int getBloodSampleId() {
        return bloodSampleId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setBloodSampleId(int bloodSampleId) {
        this.bloodSampleId = bloodSampleId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
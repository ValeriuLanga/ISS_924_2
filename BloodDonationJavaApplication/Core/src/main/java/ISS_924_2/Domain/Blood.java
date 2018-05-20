package iss_924_2.domain;

import iss_924_2.utils.BloodType;

import javax.persistence.Entity;

/**
 * 
 */
@Entity
public class Blood extends Identifier<Integer> {

    /**
     *
     */

    private BloodType bloodType;

    /**
     *
     */
    private boolean isRhPositive;

    /**
     * Default constructor
     */
    public Blood() {}

    public Blood(BloodType bloodType, boolean isRhPositive) {

        this.bloodType = bloodType;
        this.isRhPositive = isRhPositive;
    }

    public boolean isRhPositive() {
        return isRhPositive;
    }

    public void setRhPositive(boolean rhPositive) {
        isRhPositive = rhPositive;
    }

}
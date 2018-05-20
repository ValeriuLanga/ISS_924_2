package iss_924_2.domain;

import javax.persistence.Entity;


/**
 * 
 */
@Entity
public class Donation extends Identifier<Integer> {

    /**
     * Default constructor
     */
    public Donation() {}

    public Donation(int donationId, BloodDonation blood, Donor donor) {

        this.donationId = donationId;
        this.blood = blood;
        this.donor = donor;
    }

    /**
     * 
     */
    private int donationId;

    /**
     * 
     */
    private BloodDonation blood;

    /**
     * 
     */
    private Donor donor;


    public int getDonationId() {
        return donationId;
    }

    public BloodDonation getBlood() {
        return blood;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonationId(int donationId) {
        this.donationId = donationId;
    }

    public void setBlood(BloodDonation blood) {
        this.blood = blood;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }
}
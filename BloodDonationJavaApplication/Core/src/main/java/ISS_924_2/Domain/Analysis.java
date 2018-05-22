package iss_924_2.Domain;

import javax.persistence.Entity;

/**
 * 
 */
@Entity
public class Analysis extends Identifier<Integer> {

    /**
     * Default constructor
     */
    public Analysis() {
    }

    /**
     * 
     */
    private int analysisId;

    /**
     * 
     */
    private Doctor doctor;

    /**
     * 
     */
    private boolean validity;

    /**
     * 
     */
    private BloodDonation bloodSample;

    /**
     * 
     */
    private Blood blood;


    public int getAnalysisId() {
        return analysisId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public boolean isValidity() {
        return validity;
    }

    public BloodDonation getBloodSample() {
        return bloodSample;
    }

    public Blood getBlood() {
        return blood;
    }

    public void setAnalysisId(int analysisId) {
        this.analysisId = analysisId;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setValidity(boolean validity) {
        this.validity = validity;
    }

    public void setBloodSample(BloodDonation bloodSample) {
        this.bloodSample = bloodSample;
    }

    public void setBlood(Blood blood) {
        this.blood = blood;
    }
}
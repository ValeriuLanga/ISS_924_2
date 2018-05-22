package iss_924_2.domain;

import javax.persistence.Entity;

/**
 * 
 */
@Entity
public class Request extends Identifier<Integer> {

    /**
     * Default constructor
     */
    public Request() {
    }

    /**
     * 
     */
    private int requestId;

    /**
     * 
     */
    private int urgencyLevel;

    /**
     * 
     */
    private Doctor doctor;

    /**
     * 
     */
    private Hospital locationWhereBloodIsNeeded;

    /**
     *
     */
    private enum status {};

    /**
     *
     */
    private BloodContainer bloodContainer;

    public int getRequestId() {
        return requestId;
    }

    public int getUrgencyLevel() {
        return urgencyLevel;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Hospital getLocationWhereBloodIsNeeded() {
        return locationWhereBloodIsNeeded;
    }

    public BloodContainer getBloodContainer() {
        return bloodContainer;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public void setUrgencyLevel(int urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setLocationWhereBloodIsNeeded(Hospital locationWhereBloodIsNeeded) {
        this.locationWhereBloodIsNeeded = locationWhereBloodIsNeeded;
    }

    public void setBloodContainer(BloodContainer bloodContainer) {
        this.bloodContainer = bloodContainer;
    }

}
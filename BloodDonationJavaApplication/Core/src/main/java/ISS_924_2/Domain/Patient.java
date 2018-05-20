package ISS_924_2.Domain;

import javax.persistence.Entity;

/**
 * 
 */
@Entity
public class Patient extends Identifier<Integer> {

    /**
     * Default constructor
     */
    public Patient() {
    }

    /**
     * 
     */
    public Blood Blood;

    /**
     * 
     */
    public Hospital Hospital;


    public Blood getBlood() {
        return Blood;
    }

    public Hospital getHospital() {
        return Hospital;
    }

    public void setBlood(Blood blood) {
        Blood = blood;
    }

    public void setHospital(Hospital hospital) {
        Hospital = hospital;
    }
}
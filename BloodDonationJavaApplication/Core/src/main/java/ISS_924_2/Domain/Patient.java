<<<<<<< HEAD
package iss_924_2.domain;
=======
package iss_924_2.Domain;
>>>>>>> 2f2893de3982d852dce811ed34ddac99029b3255

import javax.persistence.Entity;

/**
 * 
 */
@Entity
public class Patient extends Identifier<Integer> {

    /**
     * Default constructor
     */
    public Patient() {}

    public Patient(Blood blood, Hospital hospital) {

        this.Blood = blood;
        this.Hospital = hospital;
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
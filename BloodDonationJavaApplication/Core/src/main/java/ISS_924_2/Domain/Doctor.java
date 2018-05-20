package iss_924_2.domain;

import javax.persistence.Entity;

/**
 * 
 */
@Entity
public class Doctor extends User {

    /**
     * Default constructor
     */
    public Doctor(String userName, String password, String firstName, String lastName) {

        super(userName, password, firstName, lastName);
    }

}
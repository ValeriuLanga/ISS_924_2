package iss_924_2.domain;

import javax.persistence.Entity;

/**
 * 
 */
@Entity
public class Administrator extends iss_924_2.domain.User {

    /**
     * Default constructor
     */
    public Administrator(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
    }

}
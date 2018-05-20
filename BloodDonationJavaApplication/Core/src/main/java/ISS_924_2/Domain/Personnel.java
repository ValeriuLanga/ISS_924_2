package iss_924_2.domain;

import javax.persistence.Entity;

/**
 * 
 */
@Entity
public class Personnel extends User {

    /**
     * Default constructor
     */
    public Personnel(String userName, String password, String firstName, String lastName) {

        super(userName, password, firstName, lastName);
    }

}
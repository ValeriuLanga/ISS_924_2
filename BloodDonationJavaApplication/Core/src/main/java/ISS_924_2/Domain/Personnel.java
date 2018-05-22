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
public class Personnel extends User {

    /**
     * Default constructor
     */
    public Personnel(String userName, String password, String firstName, String lastName) {

        super(userName, password, firstName, lastName);
    }

}
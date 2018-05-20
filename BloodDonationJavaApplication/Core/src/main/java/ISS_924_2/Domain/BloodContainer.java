package iss_924_2.domain;

import iss_924_2.utils.ContainerType;
import iss_924_2.utils.Status;

import javax.persistence.Entity;
import java.util.*;

/**
 * 
 */
@Entity
public class BloodContainer extends Identifier<Integer> {

    /**
     *
     */
    private Date shelfLife;

    /**
     *
     */

    private ContainerType containerType;

    /**
     *
     */

    private Status status;

    /**
     * Default constructor
     */
    public BloodContainer() {
    }

    public BloodContainer(Date shelfLife, ContainerType containerType, Status status) {

        this.shelfLife = shelfLife;
        this.containerType = containerType;
        this.status = status;
    }

    /**
     * @return
     */
    public boolean isExpired() {
        // TODO implement here
        return false;
    }

    public Date getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(Date shelfLife) {
        this.shelfLife = shelfLife;
    }

}
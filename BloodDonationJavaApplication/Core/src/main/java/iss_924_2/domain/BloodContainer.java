package ISS_924_2.Domain;

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
    private enum ContainerType {};

    /**
     *
     */
    public enum status {};

    /**
     * Default constructor
     */
    public BloodContainer() {
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
package iss_924_2.domain;

import javax.persistence.Entity;
import java.util.*;

/**
 * 
 */
@Entity
public class Blood extends Identifier<Integer> {

    /**
     *
     */
    private enum bloodType {};

    /**
     *
     */
    private boolean isRhPositive;

    /**
     * Default constructor
     */
    public Blood() {
    }

    public boolean isRhPositive() {
        return isRhPositive;
    }

    public void setRhPositive(boolean rhPositive) {
        isRhPositive = rhPositive;
    }

}
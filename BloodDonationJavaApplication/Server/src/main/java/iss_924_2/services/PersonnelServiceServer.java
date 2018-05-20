package iss_924_2.services;

import iss_924_2.domain.Donor;
import iss_924_2.domain.Patient;
import iss_924_2.domain.User;

import iss_924_2.repository.Repository;

/**
 * 
 */
public class PersonnelServiceServer implements iss_924_2.service.PersonnelService {

    /**
     * Default constructor
     */
    public PersonnelServiceServer() {
    }

    /**
     * 
     */
    public User currentUser;

    /**
     * 
     */
    private Repository personnelRepository;


    /**
     * 
     */
    public void contactDonor() {
        // TODO implement here
    }

    /**
     *
     */
    public void collectData() {
        // TODO implement here
    }


    /**
     * @param patient
     */
    public Donor determineClosestCompatibleDonor(Patient patient) {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void manageJourney() {
        // TODO implement here
    }

}
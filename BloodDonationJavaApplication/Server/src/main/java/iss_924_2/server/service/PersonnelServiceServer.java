package iss_924_2.server.service;

import iss_924_2.core.service.PersonnelService;
import iss_924_2.core.domain.Donor;
import iss_924_2.core.domain.Patient;
import iss_924_2.core.domain.User;

import iss_924_2.server.repository.Repository;

/**
 * 
 */
public class PersonnelServiceServer implements PersonnelService {

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

    private Repository donorRepository;
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
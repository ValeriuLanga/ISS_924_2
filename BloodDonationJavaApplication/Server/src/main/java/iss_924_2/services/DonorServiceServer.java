package iss_924_2.services;

import iss_924_2.domain.Analysis;
import iss_924_2.domain.Donor;
import iss_924_2.repository.Repository;
import iss_924_2.service.DonorService;

import java.util.Date;
import java.util.Set;

/**
 * 
 */
public class DonorServiceServer implements DonorService {

    /**
     * Default constructor
     */
    public DonorServiceServer() {
    }

    /**
     * 
     */
    public Donor currentUser;

    /**
     * 
     */
    private Repository donorRepository;


    /**
     * 
     */
    public Set<Analysis> viewBloodAnalysisHistory() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public Date viewNextDonationDate() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void register() {
        // TODO implement here
    }

    /**
     * 
     */
    public void changePersonalInformation(Donor donor) {
        // TODO implement here
    }

    /**
     *
     */
    public void changeDonationInfo() {
        // TODO implement here
    }


    /**
     * 
     */
    public void donateToSpecificPerson(String name) {
        // TODO implement here
    }

}
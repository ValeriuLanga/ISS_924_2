package iss_924_2.server.service;

import iss_924_2.core.domain.Blood;
import iss_924_2.core.domain.BloodContainer;
import iss_924_2.core.domain.Doctor;
import iss_924_2.core.domain.Hospital;
import iss_924_2.server.repository.Repository;
import iss_924_2.core.service.DoctorService;

import java.util.Set;

/**
 * 
 */
public class DoctorServiceServer implements DoctorService {

    /**
     * Default constructor
     */
    public DoctorServiceServer() {
    }

    /**
     * 
     */
    public Doctor currentUser;

    /**
     * 
     */
    private Repository doctorRepository;


    /**
     * 
     */
    public String checkRequestStatus() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void requestBlood(BloodContainer bloodContainer) {
        // TODO implement here
    }

    /**
     * 
     */
    public void cancelBloodRequest() {
        // TODO implement here
    }

    /**
     *
     */
    public boolean checkDonationForPerson() {
        // TODO implement here    /**
        return true;
    }

    /**
     * @param hospital
     */
    public Set<Blood> getAvailableStocks(Hospital hospital) {
        // TODO implement here
        return null;
    }

}
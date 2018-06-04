package iss_924_2.SpringServer;

import iss_924_2.services.AdminServiceServer;
import iss_924_2.services.DoctorServiceServer;
import iss_924_2.services.DonorServiceServer;
import iss_924_2.services.PersonnelServiceServer;
import iss_924_2.domain.User;

/**
 * 
 */
public class SpringServer {

    /**
     * Default constructor
     */
    public SpringServer() {
    }

    /**
     * 
     */
    private DonorServiceServer donorService;

    /**
     * 
     */
    private PersonnelServiceServer personnelService;

    /**
     * 
     */
    private DoctorServiceServer doctorService;

    /**
     * 
     */
    private AdminServiceServer adminService;

    /**
     * 
     */
    public void HandleRequests() {
        // TODO implement here
    }

    /**
     * @param user
     */
    private void validateUserCredentials(User user) {
        // TODO implement here
    }

}
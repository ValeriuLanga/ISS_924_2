package iss_924_2.server.SpringServer;

import iss_924_2.server.service.AdminServiceServer;
import iss_924_2.server.service.DoctorServiceServer;
import iss_924_2.server.service.PersonnelServiceServer;
import iss_924_2.server.service.DonorServiceServer;
import iss_924_2.core.domain.User;

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
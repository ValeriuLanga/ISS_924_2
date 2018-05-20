package ISS_924_2.SpringServer;

import ISS_924_2.services.AdminServiceServer;
import ISS_924_2.services.DoctorServiceServer;
import ISS_924_2.services.DonorServiceServer;
import ISS_924_2.services.PersonnelServiceServer;
import ISS_924_2.Domain.User;
import ISS_924_2.services.AdminServiceServer;
import ISS_924_2.services.DoctorServiceServer;
import ISS_924_2.services.DonorServiceServer;
import ISS_924_2.services.PersonnelServiceServer;

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
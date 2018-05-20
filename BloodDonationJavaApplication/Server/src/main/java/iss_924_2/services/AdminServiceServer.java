package ISS_924_2.services;

import iss_924_2.domain.User;
import iss_924_2.repository.Repository;
import iss_924_2.service.AdminService;

/**
 * 
 */
public class AdminServiceServer implements AdminService {

    /**
     * Default constructor
     */
    public AdminServiceServer() {
    }

    /**
     * 
     */
    public AdminServiceServer currentUser;

    /**
     * 
     */
    private Repository adminRepository;


    /**
     * @param user
     */
    public void grantAdminPriviliges(User user) {
        // TODO implement here
    }

    /**
     * @param user
     */
    public void revokeAdminPrivileges(User user) {
        // TODO implement here
    }

    /**
     * @param user
     */
    public void addUser(User user) {
        // TODO implement here
    }

    /**
     * @param user
     */
    public void removeUser(User user) {
        // TODO implement here
    }

    /**
     * @param user
     */
    public void updateUser(User user) {
        // TODO implement here
    }

}
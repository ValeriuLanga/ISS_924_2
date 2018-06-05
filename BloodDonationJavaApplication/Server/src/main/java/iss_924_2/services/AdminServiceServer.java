package iss_924_2.services;

import iss_924_2.domain.User;
import iss_924_2.repository.Repository;
import iss_924_2.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

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
    @Autowired
    private Repository adminRepository;

    @Autowired
    private Repository userRepository;

    /**
     * @param user
     */
    public void grantAdminPriviliges(User user) {
        Optional<User> userFromRepoitory = userRepository.findById(user.getId());

        if(userFromRepoitory.isPresent()){

        }
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
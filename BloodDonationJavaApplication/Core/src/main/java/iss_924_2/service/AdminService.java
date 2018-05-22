package iss_924_2.service;

<<<<<<< HEAD
import iss_924_2.domain.User;
=======
import iss_924_2.Domain.User;
>>>>>>> 2f2893de3982d852dce811ed34ddac99029b3255

public interface AdminService {

    /**
     * @param user
     */
    void grantAdminPriviliges(User user);

    /**
     * @param user
     */
    void revokeAdminPrivileges(User user);

    /**
     * @param user
     */
    void addUser(User user);

    /**
     * @param user
     */
    void removeUser(User user);

    /**
     * @param user
     */
    void updateUser(User user) ;


}

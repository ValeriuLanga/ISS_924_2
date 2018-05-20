package ISS_924_2.service;

import ISS_924_2.Domain.User;

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

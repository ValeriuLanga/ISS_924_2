package iss_924_2.core.service;

import iss_924_2.core.domain.User;

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

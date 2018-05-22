package iss_924_2.service;

import iss_924_2.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceClient implements AdminService {

    @Autowired
    AdminService adminService;

    @Override
    public void grantAdminPriviliges(User user) {
        adminService.grantAdminPriviliges(user);
    }

    @Override
    public void revokeAdminPrivileges(User user) {
        adminService.grantAdminPriviliges(user);
    }

    @Override
    public void addUser(User user) {
        adminService.grantAdminPriviliges(user);
    }

    @Override
    public void removeUser(User user) {
        adminService.grantAdminPriviliges(user);
    }

    @Override
    public void updateUser(User user) {
        adminService.grantAdminPriviliges(user);
    }
}

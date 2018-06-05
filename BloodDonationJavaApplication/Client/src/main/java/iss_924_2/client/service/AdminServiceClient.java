package iss_924_2.client.service;

import iss_924_2.core.domain.User;
import iss_924_2.core.service.AdminService;
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

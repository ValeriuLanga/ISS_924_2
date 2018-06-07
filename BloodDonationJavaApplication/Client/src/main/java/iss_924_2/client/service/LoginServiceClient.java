package iss_924_2.client.service;

import iss_924_2.core.domain.User;
import iss_924_2.core.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Optional;

public class LoginServiceClient implements LoginService {

    @Autowired
    @Qualifier("LoginServiceClient")
    LoginService loginService;

    @Override
    public User LoginUser(String userName, String password) {
        return loginService.LoginUser(userName, password);
    }

    @Override
    public void RegisterNewUser(String userName, String password, String firstName, String lastName) {
        loginService.RegisterNewUser(userName, password, firstName, lastName);
    }
}

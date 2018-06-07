package iss_924_2.core.service;

import iss_924_2.core.domain.User;

import java.util.Optional;

public interface LoginService {

    User LoginUser(String userName, String password);
    void RegisterNewUser(String userName, String password, String firstName, String lastName);
}

package iss_924_2.service;

import iss_924_2.domain.User;

import java.util.Optional;

public interface LoginService {

    Optional<User> LoginUser(String userName, String password);
    void RegisterNewUser(String userName, String password, String firstName, String lastName);
}

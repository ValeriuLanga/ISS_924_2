package iss_924_2.server.service;

import iss_924_2.core.exceptions.LoginServiceException;
import iss_924_2.core.utils.UserType;
import iss_924_2.server.repository.UserRepository;
import iss_924_2.core.domain.User;
import iss_924_2.core.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class LoginServiceServer implements LoginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User LoginUser(String userName, String password) {

        List<User> users = userRepository.findAll();
        Integer foundUserId = -1;

        for(User user : users)
        {
            if(user.getUserName().equals(userName) && user.getPassword().equals(password)){
                foundUserId = user.getId();
            }
        }

        if(foundUserId == -1){
            throw new LoginServiceException("Invalid Credentials!");
        }

        Optional<User> userFromRepository = userRepository.findById(foundUserId);
        if(!userFromRepository.isPresent())
            throw new  LoginServiceException("Could not locate user in repository!");
        else {
            System.out.print("User located!");
        }

        return userFromRepository.get();
    }

    @Override
    public void RegisterNewUser(String userName, String password, String firstName, String lastName) {
        User newUser = new User(userName, password, firstName, lastName, UserType.Donor);

        userRepository.save(newUser);
    }
}

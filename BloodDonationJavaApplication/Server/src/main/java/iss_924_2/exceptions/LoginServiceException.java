package iss_924_2.exceptions;

public class LoginServiceException extends RuntimeException{

    public LoginServiceException(String message) {
        super(message);
    }
}

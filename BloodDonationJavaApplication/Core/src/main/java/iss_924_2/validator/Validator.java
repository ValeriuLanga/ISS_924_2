package iss_924_2.validator;

import iss_924_2.exceptions.InvalidAgeException;
import iss_924_2.exceptions.InvalidNameException;

import java.util.regex.Pattern;

public final class Validator {

    private Validator(){}

    public static void validateName(String name){

        String regex = "(.)*(\\d)(.)*";
        Pattern pattern = Pattern.compile(regex);
        boolean containsNumber = pattern.matcher(name).matches();

        if(containsNumber)
            throw new InvalidNameException("Name should not contain digits!");

        boolean isUpperCase = Character.isUpperCase(name.charAt(0));

        if(isUpperCase)
            throw new InvalidNameException("Name should start with capital letter!");
    }

    public static void validateAge(int age){

        if(age < 18)
            throw new InvalidAgeException("Age is below 18, no donations allowed!");

        if(age > 60)
            throw new InvalidAgeException("Age is over 60, no donations allowed!");
    }
}

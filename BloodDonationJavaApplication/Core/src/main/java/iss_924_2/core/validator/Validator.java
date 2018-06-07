package iss_924_2.core.validator;

import iss_924_2.core.exceptions.InvalidAgeException;
import iss_924_2.core.exceptions.InvalidDateException;
import iss_924_2.core.exceptions.InvalidNameException;
import iss_924_2.core.exceptions.InvalidPhoneNumberException;

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

    public static void validateDate(String date) {

        String dd, mm, yyyy;
        String[] parts = date.split("-");
        dd = parts[0];
        mm = parts[1];
        yyyy = parts[2];

        if(dd.length() != 2)
            throw new InvalidDateException("The day format is invalid! Correct format is 'dd-mm-yyyy'");

        if(mm.length() != 2)
            throw new InvalidDateException("The month format is invalid! Correct format is 'dd-mm-yyyy'");

        if(yyyy.length() != 4)
            throw new InvalidDateException("The year format is invalid! Correct format is 'dd-mm-yyyy'");

        int day, month;
        day = Integer.parseInt(dd);
        month = Integer.parseInt(mm);

        if(day < 1 && day > 31)
            throw new InvalidDateException("Day is not valid!");
        if(month < 1 && month > 12)
            throw new InvalidDateException("Month is not valid!");
        if(month == 2)
            if(day > 28)
                throw new InvalidDateException("Day is not valid!")

    }

    public static void validatePhoneNumber(String phoneNumber) {

        if(phoneNumber.length() != 10)
            throw new InvalidPhoneNumberException("Phone number must have 10 digits!");
        if(phoneNumber.charAt(0) == '0')
            throw new InvalidPhoneNumberException("Phone number must start with '0'!");
    }
}

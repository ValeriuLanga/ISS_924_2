package iss_924_2.service;

import iss_924_2.domain.Analysis;
import iss_924_2.domain.Donor;

import java.util.Date;
import java.util.Set;

public interface DonorService {


    /**
     *
     */
    Set<Analysis> viewBloodAnalysisHistory(int id);

    /**
     *
     */
    //username, password, firstName, lastName, dOb, street, number, city, country, --actual address
    void register(String username, String password, String firstName, String lastName, Date dateOfBirth, String street, String number, String city, String country, String actualStreet, String actualNumber, String actualCity, String actualCountry);

    /**
     *
     */
    Date viewNextDonationDate(int id);

    /**
     * @param donor
     *
     */
    void changePersonalInformation(int id, Donor donor);

    /**
     * @param name
     *
     */
    void donateToSpecificPerson(int id, String name);

}

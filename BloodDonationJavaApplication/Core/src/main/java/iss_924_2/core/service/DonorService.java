package iss_924_2.core.service;

import iss_924_2.core.domain.Analysis;
import iss_924_2.core.domain.Donor;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface DonorService {

    List<Donor> getAllDonors();
    /**
     *
     */
    Set<Analysis> viewBloodAnalysisHistory(int id);

    /**
     *
     */
    //username, password, firstName, lastName, dOb, street, number, city, country, --actual address
    void register(String username, String password, String firstName, String lastName, String dateOfBirth, String street, String number, String city, String country, String actualStreet, String actualNumber, String actualCity, String actualCountry);

    /**
     *
     */
    String viewNextDonationDate(int id);

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

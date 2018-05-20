package iss_924_2.service;

import iss_924_2.domain.Analysis;
import iss_924_2.domain.Donor;

import java.util.Date;
import java.util.Set;

public interface DonorService {


    /**
     *
     */
    Set<Analysis> viewBloodAnalysisHistory();

    /**
     *
     */
    void register();

    /**
     *
     */
    Date viewNextDonationDate();

    /**
     * @param donor
     *
     */
    void changePersonalInformation(Donor donor);

    /**
     *
     */
    void changeDonationInfo();

    /**
     * @param name
     *
     */
    void donateToSpecificPerson(String name);

}

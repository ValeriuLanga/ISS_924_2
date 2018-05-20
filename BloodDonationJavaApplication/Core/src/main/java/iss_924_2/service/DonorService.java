package ISS_924_2.service;

import ISS_924_2.Domain.Analysis;
import ISS_924_2.Domain.Donor;
import ISS_924_2.repository.Repository;

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

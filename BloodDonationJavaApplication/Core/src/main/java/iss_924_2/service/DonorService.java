package iss_924_2.service;

<<<<<<< HEAD
import iss_924_2.domain.Analysis;
import iss_924_2.domain.Donor;
=======
import iss_924_2.Domain.Analysis;
import iss_924_2.Domain.Donor;
import iss_924_2.repository.Repository;
>>>>>>> 2f2893de3982d852dce811ed34ddac99029b3255

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

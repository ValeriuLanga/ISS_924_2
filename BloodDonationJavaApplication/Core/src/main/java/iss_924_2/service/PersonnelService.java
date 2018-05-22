package iss_924_2.service;

<<<<<<< HEAD
import iss_924_2.domain.Donor;
import iss_924_2.domain.Patient;
=======
import iss_924_2.Domain.Donor;
import iss_924_2.Domain.Patient;
>>>>>>> 2f2893de3982d852dce811ed34ddac99029b3255

public interface PersonnelService {

    /**
     *
     */
    void collectData();

    /**
     *
     */
    void manageJourney();

    /**
     *
     */
    Donor determineClosestCompatibleDonor(Patient patient);

}

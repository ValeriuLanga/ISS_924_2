package iss_924_2.service;

import iss_924_2.Domain.Donor;
import iss_924_2.Domain.Patient;

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

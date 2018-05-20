package iss_924_2.service;

import iss_924_2.domain.Donor;
import iss_924_2.domain.Patient;

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

package iss_924_2.core.service;

import iss_924_2.core.domain.Donor;
import iss_924_2.core.domain.Patient;

public interface PersonnelService {

    /**
     *
     */
    String contactDonor(int id);

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

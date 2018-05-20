package ISS_924_2.service;

import ISS_924_2.Domain.Donor;
import ISS_924_2.Domain.Patient;

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

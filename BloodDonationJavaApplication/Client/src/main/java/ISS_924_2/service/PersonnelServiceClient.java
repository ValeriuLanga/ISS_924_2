package iss_924_2.service;

import iss_924_2.Domain.Donor;
import iss_924_2.Domain.Patient;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonnelServiceClient implements PersonnelService {

    @Autowired
    PersonnelService personnelService;

    @Override
    public void collectData() {

    }

    @Override
    public void manageJourney() {

    }

    @Override
    public Donor determineClosestCompatibleDonor(Patient patient) {
        return null;
    }
}

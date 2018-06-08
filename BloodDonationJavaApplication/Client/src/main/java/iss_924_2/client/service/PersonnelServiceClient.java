package iss_924_2.client.service;

import iss_924_2.core.domain.Donor;
import iss_924_2.core.domain.Patient;
import iss_924_2.core.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PersonnelServiceClient implements PersonnelService {

    @Autowired
    @Qualifier("PersonnelServiceClient")
    PersonnelService personnelService;

    @Override
    public void collectData() {
    }

    @Override
    public String contactDonor(int id) {
        return null;
    }

    @Override
    public void manageJourney() {

    }

    @Override
    public Donor determineClosestCompatibleDonor(Patient patient) {
        return null;
    }
}

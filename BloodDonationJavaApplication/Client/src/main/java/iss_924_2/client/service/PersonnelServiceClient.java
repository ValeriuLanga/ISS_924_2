package iss_924_2.client.service;

import iss_924_2.core.domain.Donor;
import iss_924_2.core.domain.Patient;
import iss_924_2.core.domain.Request;
import iss_924_2.core.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Set;

public class PersonnelServiceClient implements PersonnelService {

    @Autowired
    PersonnelService personnelService;

    @Override
    public Set<Donor> collectData() {
        return personnelService.collectData();
    }

    @Override
    public Set<Request> collectRequests() {
        return personnelService.collectRequests();
    }

    @Override
    public String contactDonor(int id) {
        return personnelService.contactDonor(id);
    }

    @Override
    public void manageJourney(int id) {
        personnelService.manageJourney(id);
    }

    @Override
    public Donor determineClosestCompatibleDonor(Patient patient) {
        return null;
    }
}

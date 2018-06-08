package iss_924_2.core.service;

import iss_924_2.core.domain.Donor;
import iss_924_2.core.domain.Patient;
import iss_924_2.core.domain.Request;

import java.util.Set;

public interface PersonnelService {

    String contactDonor(int id);

    Set<Donor> collectData();

    Set<Request> collectRequests();

    void manageJourney(int id);

    Donor determineClosestCompatibleDonor(Patient patient);

}

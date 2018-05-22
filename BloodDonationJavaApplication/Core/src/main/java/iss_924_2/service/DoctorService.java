package iss_924_2.service;

import iss_924_2.domain.Blood;
import iss_924_2.domain.BloodContainer;
import iss_924_2.domain.Doctor;
import iss_924_2.domain.Hospital;
import iss_924_2.repository.Repository;

import java.util.Set;

public interface DoctorService {


    /**
     * @param bloodContainer
     *
     */
    void requestBlood(BloodContainer bloodContainer);

    /**
     *
     */
    String checkRequestStatus();

    /**
     *
     */
    void cancelBloodRequest();

    /**
     *
     */
    boolean checkDonationForPerson();

    /**
     * @param hospital
     */
    Set<Blood> getAvailableStocks(Hospital hospital);

}

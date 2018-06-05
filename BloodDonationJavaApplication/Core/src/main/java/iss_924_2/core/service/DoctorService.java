package iss_924_2.core.service;

import iss_924_2.core.domain.Blood;
import iss_924_2.core.domain.BloodContainer;
import iss_924_2.core.domain.Hospital;

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

package iss_924_2.core.service;

import iss_924_2.core.domain.Blood;
import iss_924_2.core.domain.BloodContainer;
import iss_924_2.core.domain.Hospital;
import iss_924_2.core.utils.RequestStatus;

import java.util.Set;

public interface DoctorService {


    /**
     * @param bloodContainer
     *
     */
    void requestBlood(BloodContainer bloodContainer, int quantity, int urgencyLevel);

    /**
     *
     */
    RequestStatus checkRequestStatus(int id);

    /**
     *
     */
    void cancelBloodRequest(int id);

    /**
     *
     */
    boolean checkDonationForPerson();

    /**
     * @param hospital
     */
    Set<BloodContainer> getAvailableStocks(Hospital hospital);

}

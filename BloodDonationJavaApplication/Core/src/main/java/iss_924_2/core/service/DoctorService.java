package iss_924_2.core.service;

import iss_924_2.core.domain.*;
import iss_924_2.core.utils.RequestStatus;

import java.util.Set;

public interface DoctorService {


    /**
     * @param bloodRequest
     *
     */
    void requestBlood(Request bloodRequest, Doctor doctor);

    /**
     *
     */
    Set<Request> checkRequestStatus(int id);

    /**
     *
     */
    void cancelBloodRequest(int id);

    /**
     * @param hospitalId
     */
    Set<BloodContainer> getAvailableStocks(int hospitalId);

}

package ISS_924_2.service;

import ISS_924_2.Domain.Blood;
import ISS_924_2.Domain.BloodContainer;
import ISS_924_2.Domain.Doctor;
import ISS_924_2.Domain.Hospital;
import ISS_924_2.repository.Repository;

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

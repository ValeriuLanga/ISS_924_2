package iss_924_2.service;

<<<<<<< HEAD
import iss_924_2.domain.Blood;
import iss_924_2.domain.BloodContainer;
import iss_924_2.domain.Hospital;
=======
import iss_924_2.Domain.Blood;
import iss_924_2.Domain.BloodContainer;
import iss_924_2.Domain.Doctor;
import iss_924_2.Domain.Hospital;
import iss_924_2.repository.Repository;
>>>>>>> 2f2893de3982d852dce811ed34ddac99029b3255

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

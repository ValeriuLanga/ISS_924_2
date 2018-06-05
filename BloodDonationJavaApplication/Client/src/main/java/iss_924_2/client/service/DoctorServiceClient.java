package iss_924_2.client.service;

import iss_924_2.core.domain.Blood;
import iss_924_2.core.domain.BloodContainer;
import iss_924_2.core.domain.Hospital;
import iss_924_2.core.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class DoctorServiceClient implements DoctorService {

    @Autowired
    DoctorService doctorService;

    @Override
    public void requestBlood(BloodContainer bloodContainer) {
        doctorService.requestBlood(bloodContainer);
    }

    @Override
    public String checkRequestStatus() {
        return doctorService.checkRequestStatus();
    }

    @Override
    public void cancelBloodRequest() {
        doctorService.cancelBloodRequest();
    }

    @Override
    public boolean checkDonationForPerson() {
        return doctorService.checkDonationForPerson();
    }

    @Override
    public Set<Blood> getAvailableStocks(Hospital hospital) {
        return doctorService.getAvailableStocks(hospital);
    }
}

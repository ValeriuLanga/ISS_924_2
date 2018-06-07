package iss_924_2.client.service;

import iss_924_2.core.domain.Blood;
import iss_924_2.core.domain.BloodContainer;
import iss_924_2.core.domain.Hospital;
import iss_924_2.core.service.DoctorService;
import iss_924_2.core.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Set;

public class DoctorServiceClient implements DoctorService {

    @Autowired
    @Qualifier("DoctorServiceClient")
    DoctorService doctorService;

    @Override
    public void requestBlood(BloodContainer bloodContainer, int quantity, int urgencyLevel) {
        doctorService.requestBlood(bloodContainer, quantity, urgencyLevel);
    }

    @Override
    public RequestStatus checkRequestStatus(int id) {
        return doctorService.checkRequestStatus(id);
    }

    @Override
    public void cancelBloodRequest(int id) {
        doctorService.cancelBloodRequest(id);
    }

    @Override
    public boolean checkDonationForPerson() {
        return doctorService.checkDonationForPerson();
    }

    @Override
    public Set<BloodContainer> getAvailableStocks(Hospital hospital) {
        return doctorService.getAvailableStocks(hospital);
    }
}

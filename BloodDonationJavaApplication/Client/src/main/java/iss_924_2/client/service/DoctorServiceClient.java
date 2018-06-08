package iss_924_2.client.service;

import iss_924_2.core.domain.*;
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
    public void requestBlood(Request request, Doctor doctor) {
        doctorService.requestBlood(request, doctor);
    }

    @Override
    public Set<Request> checkRequestStatus(int id) {
        return doctorService.checkRequestStatus(id);
    }

    @Override
    public void cancelBloodRequest(int id) {
        doctorService.cancelBloodRequest(id);
    }

    @Override
    public Set<BloodContainer> getAvailableStocks(int hospitalId) {
        return doctorService.getAvailableStocks(hospitalId);
    }
}

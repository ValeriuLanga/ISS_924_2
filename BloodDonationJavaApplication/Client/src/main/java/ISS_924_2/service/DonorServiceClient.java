package iss_924_2.service;

import iss_924_2.domain.Analysis;
import iss_924_2.domain.Donor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Set;

public class DonorServiceClient implements DonorService{

    @Autowired
    DonorService donorService;

    @Override
    public Set<Analysis> viewBloodAnalysisHistory() {
        return null;
    }

    @Override
    public void register() {

    }

    @Override
    public Date viewNextDonationDate() {
        return null;
    }

    @Override
    public void changePersonalInformation(Donor donor) {

    }

    @Override
    public void changeDonationInfo() {

    }

    @Override
    public void donateToSpecificPerson(String name) {

    }
}

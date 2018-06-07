package iss_924_2.client.service;

import iss_924_2.core.domain.Analysis;
import iss_924_2.core.domain.Donor;
import iss_924_2.core.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class DonorServiceClient implements DonorService {

    @Autowired
    @Qualifier("DonorServiceClient")
    DonorService donorService;

//    @Override
//    public Set<Analysis> viewBloodAnalysisHistory() {
//        return null;
//    }
//
//    @Override
//    public void register() {
//
//    }
//
//    @Override
//    public Date viewNextDonationDate() {
//        return null;
//    }
//
//    @Override
//    public void changePersonalInformation(Donor donor) {
//
//    }
//
//    @Override
//    public void changeDonationInfo() {
//
//    }
//
//    @Override
//    public void donateToSpecificPerson(String name) {
//
//    }

    @Override
    public List<Donor> getAllDonors() {
        return donorService.getAllDonors();
    }

    @Override
    public Set<Analysis> viewBloodAnalysisHistory(int id) {
        return donorService.viewBloodAnalysisHistory(id);
    }

    @Override
    public void register(String username, String password, String firstName, String lastName, String dateOfBirth, String street, String number, String city, String country, String actualStreet, String actualNumber, String actualCity, String actualCountry) {

    }

    @Override
    public String viewNextDonationDate(int id) {
        return null;
    }

    @Override
    public void changePersonalInformation(int id, Donor donor) {
        donorService.changePersonalInformation(id, donor);
    }

    @Override
    public void donateToSpecificPerson(int id, String name) {

    }
}

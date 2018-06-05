package iss_924_2.service;

import iss_924_2.domain.Analysis;
import iss_924_2.domain.Donor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Set;

public class DonorServiceClient implements DonorService{

    @Autowired
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
    public Set<Analysis> viewBloodAnalysisHistory(int id) {
        return null;
    }

    @Override
    public void register(String username, String password, String firstName, String lastName, String dateOfBirth, String street, String number, String city, String country, String actualStreet, String actualNumber, String actualCity, String actualCountry) {

    }

    @Override
    public Date viewNextDonationDate(int id) {
        return null;
    }

    @Override
    public void changePersonalInformation(int id, Donor donor) {

    }

    @Override
    public void donateToSpecificPerson(int id, String name) {

    }
}

package iss_924_2.services;

import iss_924_2.domain.Address;
import iss_924_2.domain.Analysis;
import iss_924_2.domain.Donor;
import iss_924_2.domain.User;
import iss_924_2.repository.DonorRepository;
import iss_924_2.repository.Repository;
import iss_924_2.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * 
 */
public class DonorServiceServer implements DonorService {

    public DonorServiceServer() {
    }

    private Repository donorRepository;

    private Repository analysisHistory;

    public Set<Analysis> viewBloodAnalysisHistory(int id) {
        // TODO implement here

        List<Analysis> analysisList = analysisHistory.findAll();
//
//        for(Analysis analysis: analysisList){
//            if(id == analysis)
//        }

        return null;
    }

    public Date viewNextDonationDate() {
        // TODO implement here


        return null;
    }

    public void register(String username, String password, String firstName, String lastName, Date dateOfBirth, String street, String number, String city, String country, String actualStreet, String actualNumber, String actualCity, String actualCountry){
        // TODO implement here
        User donor = new Donor();

        donor.setUserName(username);
        donor.setPassword(password);
        donor.setFirstName(firstName);
        donor.setLastName(lastName);
        ((Donor) donor).setDateOfBirth(dateOfBirth);
        Address address = new Address(street, number, city, country);
        Address actualAddress = new Address(actualStreet, actualNumber, actualCity, actualCountry);
        ((Donor) donor).setAddress(address);
        ((Donor) donor).setActualAddress(actualAddress);

        donorRepository.save(donor);

    }

    public void changePersonalInformation(int id, Donor donor) {
        // TODO implement here



    }

    public void donateToSpecificPerson(String name) {
        // TODO implement here


    }

}
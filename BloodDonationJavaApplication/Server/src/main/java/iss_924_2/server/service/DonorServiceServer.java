package iss_924_2.server.service;

import iss_924_2.core.domain.Address;
import iss_924_2.core.domain.Analysis;
import iss_924_2.core.domain.Donor;
import iss_924_2.core.domain.User;
import iss_924_2.server.repository.Repository;
import iss_924_2.core.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * 
 */
public class DonorServiceServer implements DonorService {

    @Autowired
    private Repository donorRepository;

    @Autowired
    private Repository analysisRepository;

    public List<Donor> getAllDonors(){
        List<Donor> l =  donorRepository.findAll();
        return l;
    }

    public Set<Analysis> viewBloodAnalysisHistory(int id) {

        List<Analysis> analysisList = analysisRepository.findAll();
        Set<Analysis> analysisHistory = new HashSet<>();

        for(Analysis analysis: analysisList){
            if(id == analysis.getDonation().getDonor().getId()){
                analysisHistory.add(analysis);
            }
        }

        return analysisHistory;
    }

    public Date viewNextDonationDate(int id) {
        // TODO implement here


        return null;
    }

    public void register(String username, String password, String firstName, String lastName, String dateOfBirth, String street, String number, String city, String country, String actualStreet, String actualNumber, String actualCity, String actualCountry){
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
        Optional<Donor> optionalDonor = donorRepository.findById(id);

        optionalDonor.ifPresent(d -> {
            d.setUserName(donor.getUserName());
            d.setPassword(donor.getPassword());
            d.setFirstName(donor.getFirstName());
            d.setLastName(donor.getLastName());
            d.setDateOfBirth(donor.getDateOfBirth());
            d.setAddress(donor.getAddress());
            d.setActualAddress(donor.getActualAddress());
            d.setDonation(donor.getDonation());
        });

        donorRepository.save(donor);
    }

    public void donateToSpecificPerson(int id, String name) {
        // TODO implement here


    }

}
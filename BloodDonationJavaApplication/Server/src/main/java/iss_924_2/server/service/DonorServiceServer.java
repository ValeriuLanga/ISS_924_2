package iss_924_2.server.service;

import iss_924_2.core.domain.*;
import iss_924_2.server.repository.Repository;
import iss_924_2.core.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * 
 */
public class DonorServiceServer implements DonorService {

    @Autowired
    private Repository donorRepository;

    @Autowired
    private Repository analysisRepository;

    @Autowired
    private Repository patientRepository;

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

    public String viewNextDonationDate(int id) {

        Optional<Donor> donor = donorRepository.findById(id);
        String dateString = donor.get().getDonation().stream().findFirst().get().getDonationDate();

        DateFormat format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        try {
            Date date = format.parse(dateString);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.MONTH, 6);

            SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
            String formatted = format1.format(cal.getTime());

            return formatted;
        }
        catch (java.text.ParseException e) {
            e.printStackTrace();
        }

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
        List<Patient> patients =  patientRepository.findAll();
        int patientId = patients.stream().filter(p -> p.getName() == name).findFirst().get().getId();

        Optional<Donor> donorOpt = donorRepository.findById(id);
        donorOpt.ifPresent(donor ->  {
            Optional<Patient> patientOpt = patientRepository.findById(id);
            patientOpt.ifPresent(patient -> donor.setPatient(patient));
        });

        donorRepository.save(donorOpt.get());
    }

}
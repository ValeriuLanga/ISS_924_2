package iss_924_2.server;

import iss_924_2.core.domain.*;
import iss_924_2.core.utils.BloodType;
import iss_924_2.core.utils.Status;
import iss_924_2.core.utils.UserType;
import iss_924_2.server.repository.AnalysisRepository;
import iss_924_2.server.repository.BloodRepository;
import iss_924_2.server.repository.DonorRepository;
import iss_924_2.server.service.DonorServiceServer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashSet;

public class ServerApp {

    public static void main(String[] args) {
        System.out.println("starting server");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("iss_924_2.server.configuration");

        Address address1 = Address.builder().city("Cluj-Napoca").country("Romania").street("Aurel Vlaicu").number("182A").build();
        Address address2 = Address.builder().city("Bucuresti").country("Romania").street("Vasile Conta").number("44C").build();
        Address address3 = Address.builder().city("Cluj-Napoca").country("Romania").street("Bucurestiului").number("13").build();

        Donor d = new Donor();
        d.setUserName("adrian.vladescu");
        d.setPassword("123456");
        d.setFirstName("Adrian");
        d.setLastName("Vladescu");
        d.setActualAddress(address1);
        d.setAddress(address2);
        d.setDateOfBirth("03-06-1992");
        d.setUserType(UserType.Donor);

//        context.getBean(DonorRepository.class).save(d);

        Blood blood = new Blood();
        blood.setBloodType(BloodType.AB4);
        blood.setRhPositive(true);
        blood.setDonations(new HashSet<>());

        Donation donation = new Donation();
        donation.setDonationDate("10-10-2010");
        donation.setExpirationDate("10-10-2015");
        donation.setQuantity(10);
        donation.setStatus(Status.preparation);
        donation.setDonor(d);

        blood.getDonations().add(donation);
        donation.setBlood(blood);

        Analysis analysis = new Analysis();
        analysis.setValidity(true);
        analysis.setDonation(donation);
        analysis.setDoctor(null);

       // System.out.println(blood.getPatients());

//        context.getBean(BloodRepository.class).findAll().forEach(b -> System.out.print(b.getDonations()));
        //context.getBean(AnalysisRepository.class).save(analysis);
        //context.getBean(DonorServiceServer.class).getAllDonors().forEach(System.out::println);

        System.out.println("server started");
    }
}

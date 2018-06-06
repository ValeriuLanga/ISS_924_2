package iss_924_2.server;

import iss_924_2.core.domain.Address;
import iss_924_2.core.domain.Donor;
import iss_924_2.core.service.DonorService;
import iss_924_2.server.repository.DonorRepository;
import iss_924_2.server.service.DonorServiceServer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServerApp {

    public static void main(String[] args) {
        System.out.println("start server");
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

        DonorService donorService = context.getBean(DonorServiceServer.class);
        donorService.getAllDonors().forEach(System.out::println);

        System.out.println("bye - server");
    }
}

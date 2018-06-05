package iss_924_2;

import iss_924_2.domain.*;
import iss_924_2.repository.DonorRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServerApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("iss_924_2.configuration");

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

        DonorRepository donorRepository = context.getBean(DonorRepository.class);
        donorRepository.save(d);

        System.out.println("bye - server");
    }
}

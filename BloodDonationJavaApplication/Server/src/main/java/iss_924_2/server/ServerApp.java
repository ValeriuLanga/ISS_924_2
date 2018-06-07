package iss_924_2.server;

import iss_924_2.core.domain.Address;
import iss_924_2.core.domain.Doctor;
import iss_924_2.core.domain.Hospital;
import iss_924_2.core.domain.Patient;
import iss_924_2.server.repository.HospitalRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServerApp {

    public static void main(String[] args) {
        System.out.println("starting server");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("iss_924_2.server.configuration");

        Address address1 = new Address();
        address1.setCity("Cluj-Napoca");
        address1.setCountry("Romania");
        address1.setStreet("Motilor");
        address1.setNumber("19");

        Doctor d = new Doctor();
        d.setUserName("corina.lupascu");
        d.setPassword("b");
        d.setFirstName("Corina");
        d.setLastName("Lupascu");

        Hospital h = new Hospital();
        h.setName("Ambulatoriu: Spitalul Clinic de Boli Infectioase");
        h.setAddress(address1);
        h.getDoctors().add(d);

        d.setHospital(h);

        //context.getBean(HospitalRepository.class).save(h);

        System.out.println("server started");
    }
}

package iss_924_2.server.configuration;

import iss_924_2.core.service.DoctorService;
import iss_924_2.core.service.DonorService;
import iss_924_2.core.service.LoginService;
import iss_924_2.core.service.PersonnelService;
import iss_924_2.server.service.DoctorServiceServer;
import iss_924_2.server.service.DonorServiceServer;
import iss_924_2.server.service.LoginServiceServer;
import iss_924_2.server.service.PersonnelServiceServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
@ComponentScan({"iss_924_2.server.repository", "iss_924_2.server.service"})
public class ServerConfig {

    @Bean
    DonorService provideDonorService() {
        return new DonorServiceServer();
    }

    @Bean
    RmiServiceExporter rmiServiceExporterClient(){
        RmiServiceExporter exporter=new RmiServiceExporter();
        exporter.setServiceName("DonorService");
        exporter.setServiceInterface(DonorService.class);
        exporter.setService(provideDonorService());
        return exporter;
    }

    @Bean
    LoginService provideLoginService() {
        return new LoginServiceServer();
    }

    @Bean
    RmiServiceExporter rmiServiceExporterLogin(){
        RmiServiceExporter exporter=new RmiServiceExporter();
        exporter.setServiceName("LoginService");
        exporter.setServiceInterface(LoginService.class);
        exporter.setService(provideLoginService());
        return exporter;
    }

    @Bean
    DoctorService provideDoctorService() { return new DoctorServiceServer(); }

    @Bean
    RmiServiceExporter rmiServiceExporterDoctor(){
        RmiServiceExporter exporter=new RmiServiceExporter();
        exporter.setServiceName("DoctorService");
        exporter.setServiceInterface(DoctorService.class);
        exporter.setService(provideDoctorService());
        return exporter;
    }

    @Bean
    PersonnelService providePersonnelService() { return new PersonnelServiceServer(); }

    @Bean
    RmiServiceExporter rmiServiceExporterPersonnel(){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("PersonnelService");
        exporter.setServiceInterface(PersonnelService.class);
        exporter.setService(providePersonnelService());
        return exporter;
    }
}

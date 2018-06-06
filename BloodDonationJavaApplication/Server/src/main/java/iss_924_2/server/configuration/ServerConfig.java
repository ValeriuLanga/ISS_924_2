package iss_924_2.server.configuration;

import iss_924_2.core.service.DonorService;
import iss_924_2.core.service.LoginService;
import iss_924_2.server.service.DonorServiceServer;
import iss_924_2.server.service.LoginServiceServer;
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
}

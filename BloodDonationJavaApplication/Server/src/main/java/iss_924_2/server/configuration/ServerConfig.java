package iss_924_2.server.configuration;

import iss_924_2.core.service.DonorService;
import iss_924_2.server.service.DonorServiceServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
@ComponentScan({"iss_924_2.server.repository", "iss_924_2.server.service"})
public class ServerConfig {

    @Bean
    DonorService bookService() {
        return new DonorServiceServer();
    }

    @Bean
    RmiServiceExporter rmiServiceExporterClient(){
        RmiServiceExporter exporter=new RmiServiceExporter();
        exporter.setServiceName("DonorService");
        exporter.setServiceInterface(DonorService.class);
        exporter.setService(bookService());
        return exporter;
    }
}

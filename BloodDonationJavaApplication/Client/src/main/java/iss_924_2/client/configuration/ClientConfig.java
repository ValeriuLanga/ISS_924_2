package iss_924_2.client.configuration;

import iss_924_2.client.console.ConsoleUi;
import iss_924_2.client.service.AdminServiceClient;
import iss_924_2.client.service.DoctorServiceClient;
import iss_924_2.client.service.DonorServiceClient;
import iss_924_2.client.service.PersonnelServiceClient;
import iss_924_2.core.service.AdminService;
import iss_924_2.core.service.DoctorService;
import iss_924_2.core.service.DonorService;
import iss_924_2.core.service.PersonnelService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@ComponentScan({"iss_924_2.core.service"})
@Configuration
public class ClientConfig {
    @Bean
    ConsoleUi provideConsoleUi(){
        return new ConsoleUi(provideDonorServiceClient());
    }

//    @Bean
//    AdminService provideAdminServiceClient(){
//        return new AdminServiceClient();
//    }
//
//    @Bean
//    RmiProxyFactoryBean rmiProxyFactoryBeanAdmin(){
//        RmiProxyFactoryBean proxy=new RmiProxyFactoryBean();
//        proxy.setServiceInterface(AdminService.class);
//        proxy.setServiceUrl("rmi://localhost:1099/AdminService");
//        return proxy;
//    }
//
//    @Bean
//    DoctorService provideDoctorServiceClient(){
//        return new DoctorServiceClient();
//    }
//
//    @Bean
//    RmiProxyFactoryBean rmiProxyFactoryBeanDoctor(){
//        RmiProxyFactoryBean proxy=new RmiProxyFactoryBean();
//        proxy.setServiceInterface(DoctorService.class);
//        proxy.setServiceUrl("rmi://localhost:1099/DoctorService");
//        return proxy;
//    }

    @Bean
    DonorServiceClient provideDonorServiceClient(){
        return new DonorServiceClient();
    }

    @Bean
    RmiProxyFactoryBean rmiProxyFactoryBeanDonor(){
        RmiProxyFactoryBean proxy=new RmiProxyFactoryBean();
        proxy.setServiceInterface(DonorService.class);
        proxy.setServiceUrl("rmi://localhost:1099/DonorService");
        return proxy;
    }

//    @Bean
//    PersonnelService providePersonnelServiceClient(){
//        return new PersonnelServiceClient();
//    }
//
//    @Bean
//    RmiProxyFactoryBean rmiProxyFactoryBeanPersonnel(){
//        RmiProxyFactoryBean proxy=new RmiProxyFactoryBean();
//        proxy.setServiceInterface(PersonnelService.class);
//        proxy.setServiceUrl("rmi://localhost:1099/PersonnelService");
//        return proxy;
//    }
}

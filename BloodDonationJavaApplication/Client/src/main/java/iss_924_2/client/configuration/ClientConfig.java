package iss_924_2.client.configuration;

import iss_924_2.client.console.ConsoleUi;
import iss_924_2.client.service.*;
import iss_924_2.core.service.*;
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

    @Bean
    DoctorServiceClient provideDoctorServiceClient(){
        return new DoctorServiceClient();
    }

    @Bean(name = "DoctorServiceClient")
    RmiProxyFactoryBean rmiProxyFactoryBeanDoctor(){
        RmiProxyFactoryBean proxy=new RmiProxyFactoryBean();
        proxy.setServiceInterface(DoctorService.class);
        proxy.setServiceUrl("rmi://localhost:1099/DoctorService");
        return proxy;
    }

    @Bean
    DonorServiceClient provideDonorServiceClient(){
        return new DonorServiceClient();
    }

    @Bean(name = "DonorServiceClient")
    RmiProxyFactoryBean rmiProxyFactoryBeanDonor(){
        RmiProxyFactoryBean proxy=new RmiProxyFactoryBean();
        proxy.setServiceInterface(DonorService.class);
        proxy.setServiceUrl("rmi://localhost:1099/DonorService");
        return proxy;
    }

    @Bean
    LoginServiceClient provideLoginServiceClient() {
        return new LoginServiceClient();
    }

    @Bean(name = "LoginServiceClient")
    RmiProxyFactoryBean rmiProxyFactoryBeanLogin() {
        RmiProxyFactoryBean proxy = new RmiProxyFactoryBean();
        proxy.setServiceInterface(LoginService.class);
        proxy.setServiceUrl("rmi://localhost:1099/LoginService");
        return proxy;
    }

    @Bean
    PersonnelServiceClient providePersonnelServiceClient(){
        return new PersonnelServiceClient();
    }

    @Bean(name = "PersonnelServiceClient")
    RmiProxyFactoryBean rmiProxyFactoryBeanPersonnel(){
        RmiProxyFactoryBean proxy=new RmiProxyFactoryBean();
        proxy.setServiceInterface(PersonnelService.class);
        proxy.setServiceUrl("rmi://localhost:1099/PersonnelService");
        return proxy;
    }
}

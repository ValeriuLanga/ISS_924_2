package ISS_924_2.configuration;

import ISS_924_2.console.ConsoleUi;
import ISS_924_2.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import java.io.Console;

public class ClientConfig {
    @Bean
    ConsoleUi provideConsoleUi(){
        return new ConsoleUi(provideAdminServiceClient(), provideDoctorServiceClient(),
                provideDonorServiceClient(), providePersonnelServiceClient());
    }

    @Bean
    AdminService provideAdminServiceClient(){
        return new AdminServiceClient();
    }

    @Bean
    RmiProxyFactoryBean rmiProxyFactoryBeanAdmin(){
        RmiProxyFactoryBean proxy=new RmiProxyFactoryBean();
        proxy.setServiceInterface(AdminService.class);
        proxy.setServiceUrl("rmi://localhost:1099/AdminService");
        return proxy;
    }

    @Bean
    DoctorService provideDoctorServiceClient(){
        return new DoctorServiceClient();
    }

    @Bean
    RmiProxyFactoryBean rmiProxyFactoryBeanDoctor(){
        RmiProxyFactoryBean proxy=new RmiProxyFactoryBean();
        proxy.setServiceInterface(DoctorService.class);
        proxy.setServiceUrl("rmi://localhost:1099/DoctorService");
        return proxy;
    }

    @Bean
    DonorService provideDonorServiceClient(){
        return new DonorServiceClient();
    }

    @Bean
    RmiProxyFactoryBean rmiProxyFactoryBeanDonor(){
        RmiProxyFactoryBean proxy=new RmiProxyFactoryBean();
        proxy.setServiceInterface(DonorService.class);
        proxy.setServiceUrl("rmi://localhost:1099/DonorService");
        return proxy;
    }

    @Bean
    PersonnelService providePersonnelServiceClient(){
        return new PersonnelServiceClient();
    }

    @Bean
    RmiProxyFactoryBean rmiProxyFactoryBeanPersonnel(){
        RmiProxyFactoryBean proxy=new RmiProxyFactoryBean();
        proxy.setServiceInterface(PersonnelService.class);
        proxy.setServiceUrl("rmi://localhost:1099/PersonnelService");
        return proxy;
    }
}

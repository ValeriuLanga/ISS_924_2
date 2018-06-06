package iss_924_2.client;

import iss_924_2.client.console.ConsoleUi;
import iss_924_2.client.service.DonorServiceClient;
import iss_924_2.core.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ClientAppConsole {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("iss_924_2.client.configuration");

        context.getBean(ConsoleUi.class).start();

        System.out.println("bye - client");
    }
}

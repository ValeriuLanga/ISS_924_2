package iss_924_2.client;

import iss_924_2.client.console.ConsoleUi;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientAppConsole {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("iss_924_2.configuration");

        context.getBean(ConsoleUi.class).start();

        System.out.println("bye - client");
    }
}

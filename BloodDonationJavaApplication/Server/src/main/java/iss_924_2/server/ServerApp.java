package iss_924_2.server;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServerApp {

    public static void main(String[] args) {
        System.out.println("starting server");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("iss_924_2.server.configuration");

        System.out.println("server started");
    }
}

package iss_924_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServerApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("ro.ubb.server.Config");

        System.out.println("bye - server");
    }
}

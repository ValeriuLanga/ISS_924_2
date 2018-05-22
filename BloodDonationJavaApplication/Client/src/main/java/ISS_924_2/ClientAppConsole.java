package ISS_924_2;

import ISS_924_2.console.ConsoleUi;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientAppConsole {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("ISS_924_2.configuration");

        context.getBean(ConsoleUi.class).start();

        System.out.println("bye - client");
    }
}

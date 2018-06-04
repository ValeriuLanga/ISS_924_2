package iss_924_2;

import iss_924_2.controller.AuthenticationController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

@SpringBootApplication
public class ClientAppFX extends Application {

    ConfigurableApplicationContext springContext;
    Parent root;
    Stage mainStage;

    public AuthenticationController authenticationController;

    /*
    Screens setups///////////////////////
     */
    private FXMLLoader setupAuthenticationScreen() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../resources/fx/AuthenticationWindow.fxml"));
        authenticationController = fxmlLoader.getController();
        fxmlLoader.setControllerFactory(springContext::getBean);
        return fxmlLoader;
    }

    @Override
    public void init() throws Exception{
        SpringApplication springApp = new SpringApplication(ClientAppFX.class);
        springContext = springApp.run();
        //URI url = new File("fx/AuthenticationWindow.fxml").toURI();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../resources/fx/AuthenticationWindow.fxml"));
        //authenticationController = fxmlLoader.getController();
        fxmlLoader.setControllerFactory(springContext::getBean);
        root = fxmlLoader.load();
    }

    /*
    Screens change///////////////////////
     */
    public void changeScreenToAuthentication() {
        try {
            root = this.setupAuthenticationScreen().load();
            Scene scene =  new Scene(root);
            this.mainStage.setScene(scene);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @Override
    public void start(Stage mainStage) {
//        this.mainStage = mainStage;
//        this.mainStage.setTitle("Blood Donation");
//
//        Scene scene = new Scene(root);
//        this.mainStage.setScene(scene);
//        this.mainStage.show();

        mainStage.setScene(new Scene(root));
        mainStage.show();

    }

    @Override
    public void stop() throws Exception {
        springContext.stop();
    }

    public static void main(String[] args) {
        launch(args);
    }

}

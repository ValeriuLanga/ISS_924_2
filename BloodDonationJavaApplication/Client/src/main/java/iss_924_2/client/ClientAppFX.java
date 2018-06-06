package iss_924_2.client;

import iss_924_2.client.controller.AuthenticationController;
import iss_924_2.client.controller.DoctorController;
import iss_924_2.client.controller.DonorController;
import iss_924_2.client.service.DonorServiceClient;

import iss_924_2.client.service.LoginServiceClient;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class ClientAppFX extends Application {

    AnnotationConfigApplicationContext springContext;
    Parent root;
    Stage mainStage;

    private AuthenticationController authenticationController;
    private DonorController donorController;
    private DoctorController doctorController;

    private FXMLLoader setupDoctorScreen() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/fx/DoctorWindow.fxml"));
        doctorController = fxmlLoader.getController();
        return fxmlLoader;
    }

    /*
    Screens change///////////////////////
     */
    public void changeScreenToAuthentication() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/fx/AuthenticationWindow.fxml"));

            AuthenticationController authenticationController = new AuthenticationController(springContext.getBean(LoginServiceClient.class));
            fxmlLoader.setController(authenticationController);

            root = fxmlLoader.load();
            Scene scene =  new Scene(root);
            this.mainStage.setScene(scene);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void changeScreenToDonor() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/fx/DonorWindow.fxml"));

            DonorController donorController = new DonorController(springContext.getBean(DonorServiceClient.class));
            fxmlLoader.setController(donorController);

            root = fxmlLoader.load();
            Scene scene =  new Scene(root);
            this.mainStage.setScene(scene);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void changeScreenToDoctor() {
        try {
            root = this.setupDoctorScreen().load();
            Scene scene =  new Scene(root);
            this.mainStage.setScene(scene);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }


    @Override
    public void start(Stage mainStage) {
        springContext = new AnnotationConfigApplicationContext("iss_924_2.client.configuration");
        this.mainStage = mainStage;
        this.mainStage.setTitle("Blood Donation");
        changeScreenToAuthentication();
        this.mainStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}

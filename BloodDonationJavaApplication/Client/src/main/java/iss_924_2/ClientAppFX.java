package iss_924_2;

import iss_924_2.controller.AuthenticationController;
import iss_924_2.controller.DoctorController;
import iss_924_2.controller.DonorController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientAppFX extends Application {

    Parent root;
    Stage mainStage;

    private AuthenticationController authenticationController;
    private DonorController donorController;
    private DoctorController doctorController;

    private FXMLLoader setupAuthenticationScreen() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../resources/fx/AuthenticationWindow.fxml"));
        authenticationController = fxmlLoader.getController();
        return fxmlLoader;
    }

    private FXMLLoader setupDonorScreen() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../resources/fx/DonorWindow.fxml"));
        donorController = fxmlLoader.getController();
        return fxmlLoader;
    }

    private FXMLLoader setupDoctorScreen() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../resources/fx/DoctorWindow.fxml"));
        doctorController = fxmlLoader.getController();
        return fxmlLoader;
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

    public void changeScreenToDonor() {
        try {
            root = this.setupDonorScreen().load();
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
        this.mainStage = mainStage;
        this.mainStage.setTitle("Blood Donation");
        changeScreenToDoctor();
        this.mainStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}

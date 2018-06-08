package iss_924_2.client.controller;

import iss_924_2.client.content.donor.DonationFormContent;
import iss_924_2.client.content.donor.EditAccountContent;
import iss_924_2.client.content.donor.RequirementsContent;
import iss_924_2.client.content.donor.ViewHistoryContent;
import iss_924_2.client.service.DonorServiceClient;
import iss_924_2.client.service.LoginServiceClient;
import iss_924_2.core.domain.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class AdminController implements Initializable {

    AnnotationConfigApplicationContext springContext;
    DonorServiceClient donorServiceClient;
    Administrator administrator;
    Stage mainStage;

    @FXML
    private BorderPane mainPane;
    @FXML
    private Label userNameLabel;
    @FXML
    private Button requestBloodButton;
    @FXML
    private Button logout;


    private DonationFormContent donationFormContent;
    private EditAccountContent editAccountContent;
    private RequirementsContent requirementsContent;
    private ViewHistoryContent viewHistoryContent;

    public AdminController(DonorServiceClient donorServiceClient, AnnotationConfigApplicationContext springContext, Administrator user) {
        this.donorServiceClient = donorServiceClient;
        this.springContext = springContext;
        this.administrator = user;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        requestBloodButton.setOnAction(event -> changeContentToUpdateAdmins());
        
        logout.setOnAction(event ->{
            try {
                mainStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../../resources/fx/AuthenticationWindow.fxml"));

                AuthenticationController authenticationController = new AuthenticationController(springContext.getBean(LoginServiceClient.class), springContext);
                fxmlLoader.setController(authenticationController);

                mainStage.setScene(new Scene(fxmlLoader.load()));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        });
    }

    private void changeContentToUpdateAdmins() {
    }
}

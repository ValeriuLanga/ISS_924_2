package iss_924_2.client.controller;

import iss_924_2.client.console.ConsoleUi;
import iss_924_2.client.content.doctor.BloodStockContent;
import iss_924_2.client.content.doctor.CheckStatusContent;
import iss_924_2.client.content.doctor.RequestBloodContent;
import iss_924_2.client.service.DoctorServiceClient;
import iss_924_2.core.domain.Doctor;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.net.URL;
import java.util.ResourceBundle;
@Component
public class DoctorController implements Initializable {

    AnnotationConfigApplicationContext springContext;
    DoctorServiceClient doctorServiceClient;
    Doctor doctor;

    @FXML
    private BorderPane mainPane;
    @FXML
    private Label userNameLabel;
    @FXML
    private Button requestBloodButton;
    @FXML
    private Button checkStatusButton;
    @FXML
    private Button availableBloodButton;

    private BloodStockContent bloodStockContent;
    private CheckStatusContent checkStatusContent;
    private RequestBloodContent requestBloodContent;

    public DoctorController(DoctorServiceClient doctorService, AnnotationConfigApplicationContext springContext, Doctor user) {
        this.doctorServiceClient = doctorService;
        this.springContext = springContext;
        this.doctor = user;
    }

    private void changeContentToRequestBlood() {
        requestBloodContent = new RequestBloodContent();
        mainPane.setCenter(requestBloodContent);
    }

    private void changeContentToCheckStatus() {
        checkStatusContent = new CheckStatusContent();
        mainPane.setCenter(checkStatusContent);
    }

    private void changeContentToBloodStock() {
        bloodStockContent = new BloodStockContent();
        mainPane.setCenter(bloodStockContent);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        changeContentToBloodStock();

        userNameLabel.setText(doctor.getFirstName());

        requestBloodButton.setOnAction(event -> changeContentToRequestBlood());

        checkStatusButton.setOnAction(event -> changeContentToCheckStatus());

        availableBloodButton.setOnAction(event -> changeContentToBloodStock());
    }

}

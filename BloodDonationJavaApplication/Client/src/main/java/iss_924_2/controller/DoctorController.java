package iss_924_2.controller;

import iss_924_2.content.doctor.BloodStockContent;
import iss_924_2.content.doctor.CheckStatusContent;
import iss_924_2.content.doctor.RequestBloodContent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class DoctorController implements Initializable {

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

        requestBloodButton.setOnAction(event -> changeContentToRequestBlood());

        checkStatusButton.setOnAction(event -> changeContentToCheckStatus());

        availableBloodButton.setOnAction(event -> changeContentToBloodStock());
    }
}

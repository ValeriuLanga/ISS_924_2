package iss_924_2.client.controller;

import iss_924_2.client.content.donor.DonationFormContent;
import iss_924_2.client.content.donor.EditAccountContent;
import iss_924_2.client.content.donor.RequirementsContent;
import iss_924_2.client.content.donor.ViewHistoryContent;
import iss_924_2.client.service.DonorServiceClient;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import org.aspectj.lang.annotation.Before;

import java.net.URL;
import java.util.ResourceBundle;

public class DonorController implements Initializable {

    DonorServiceClient donorServiceClient;

    @FXML
    private BorderPane mainPane;
    @FXML
    private Label userNameLabel;
    @FXML
    private Button editAccountDetailsButton;
    @FXML
    private Button fillDonationFormButton;
    @FXML
    private Button viewHistoryButton;
    @FXML
    private Button requirementsButton;

    private DonationFormContent donationFormContent;
    private EditAccountContent editAccountContent;
    private RequirementsContent requirementsContent;
    private ViewHistoryContent viewHistoryContent;

    public DonorController(DonorServiceClient donorServiceClient) {
        this.donorServiceClient = donorServiceClient;
    }

    private void changeContentToRequirements() {
        requirementsContent = new RequirementsContent();
        mainPane.setCenter(requirementsContent);
    }

    private void changeContentToEditAccount() {
        editAccountContent = new EditAccountContent();
        editAccountContent.setChangeAddressCity(donorServiceClient.getAllDonors().get(0).getAddress().getCity());
        mainPane.setCenter(editAccountContent);
    }

    private void changeContentToFillDonationForm() {
        donationFormContent = new DonationFormContent();
        mainPane.setCenter(donationFormContent);
    }

    private void changeContentToViewHistory() {
        viewHistoryContent = new ViewHistoryContent();
        mainPane.setCenter(viewHistoryContent);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        changeContentToRequirements();

        editAccountDetailsButton.setOnAction(event -> changeContentToEditAccount());

        fillDonationFormButton.setOnAction(event -> changeContentToFillDonationForm());

        viewHistoryButton.setOnAction(event -> changeContentToViewHistory());

        requirementsButton.setOnAction(event -> changeContentToRequirements());
    }

    public void setDonorService(DonorServiceClient bean) {
        donorServiceClient = bean;
    }
}

package iss_924_2.controller;

import iss_924_2.content.donor.DonationFormContent;
import iss_924_2.content.donor.EditAccountContent;
import iss_924_2.content.donor.RequirementsContent;
import iss_924_2.content.donor.ViewHistoryContent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class DonorController implements Initializable {

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

    private void changeContentToRequirements() {
        requirementsContent = new RequirementsContent();
        mainPane.setCenter(requirementsContent);
    }

    private void changeContentToEditAccount() {
        editAccountContent = new EditAccountContent();
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
}

package iss_924_2.client.controller;

import iss_924_2.client.content.donor.DonationFormContent;
import iss_924_2.client.content.donor.EditAccountContent;
import iss_924_2.client.content.donor.RequirementsContent;
import iss_924_2.client.content.donor.ViewHistoryContent;
import iss_924_2.client.service.DonorServiceClient;
import iss_924_2.core.domain.Address;
import iss_924_2.core.domain.Analysis;
import iss_924_2.core.domain.Donor;
import iss_924_2.core.domain.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class DonorController implements Initializable {

    AnnotationConfigApplicationContext springContext;
    DonorServiceClient donorServiceClient;
    Donor donor;

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

    public DonorController(DonorServiceClient donorServiceClient, AnnotationConfigApplicationContext springContext, Donor user) {
        this.donorServiceClient = donorServiceClient;
        this.springContext = springContext;
        this.donor = user;
    }

    private void changeContentToRequirements() {
        requirementsContent = new RequirementsContent();
        mainPane.setCenter(requirementsContent);
    }

    private void changeContentToEditAccount() {
        editAccountContent = new EditAccountContent();
        editAccountContent.setUserFirstAndLastName(donor.getFirstName() + " " + donor.getLastName());
        editAccountContent.setUserUsername(donor.getUserName());

        editAccountContent.getChangePasswordButton().setOnAction(event -> {
            if (editAccountContent.getOldPassword().equals(donor.getPassword())) {
                if (editAccountContent.getNewPassword().equals(editAccountContent.getRetypeNew())) {
                    Donor newDonor = donor;
                    newDonor.setPassword(editAccountContent.getNewPassword());

                    donorServiceClient.changePersonalInformation(donor.getId(), newDonor);

                    editAccountContent.setChangePasswordInfo("Password changed!");
                } else {
                    editAccountContent.setChangePasswordInfo("New passwords not identical!");
                }
            } else {
                editAccountContent.setChangePasswordInfo("Old password incorrect!");
            }
        });

        editAccountContent.getChangeNameButton().setOnAction(event -> {
            if (!editAccountContent.getChangeFirstNameField().isEmpty()) {
                if (!editAccountContent.getChangeLastNameField().isEmpty()) {
                    Donor newDonor = donor;
                    newDonor.setFirstName(editAccountContent.getChangeFirstNameField());
                    newDonor.setLastName(editAccountContent.getChangeLastNameField());

                    donorServiceClient.changePersonalInformation(donor.getId(), newDonor);

                    editAccountContent.setChangeNameInfo("Name changed!");
                } else {
                    editAccountContent.setChangeNameInfo("Last name empty!");
                }
            } else {
                editAccountContent.setChangeNameInfo("First name empty!");
            }
        });

        editAccountContent.getChangeAddressButton().setOnAction(event -> {
            if (!editAccountContent.getChangeAddressStreet().isEmpty()) {
                if (!editAccountContent.getChangeAddressNumber().isEmpty()) {
                    if (!editAccountContent.getChangeAddressCity().isEmpty()) {
                        if (!editAccountContent.getChangeAddressCountry().isEmpty()){
                            Donor newDonor = donor;
                            Address newAddress = donor.getAddress();
                            newAddress.setStreet(editAccountContent.getChangeAddressStreet());
                            newAddress.setNumber(editAccountContent.getChangeAddressNumber());
                            newAddress.setCity(editAccountContent.getChangeAddressCity());
                            newAddress.setCountry(editAccountContent.getChangeAddressCountry());

                            newDonor.setAddress(newAddress);

                            donorServiceClient.changePersonalInformation(donor.getId(), newDonor);

                            editAccountContent.setChangeAddressInfo("Address changed!");
                        } else {
                            editAccountContent.setChangeAddressInfo("Country is empty!");
                        }
                    } else {
                        editAccountContent.setChangeAddressInfo("City is empty!");
                    }
                } else {
                    editAccountContent.setChangeAddressInfo("Number is empty!");
                }
            } else {
                editAccountContent.setChangeAddressInfo("Street is empty!");
            }
        });

        editAccountContent.getChangeResidenceButton().setOnAction(event -> {
            if (!editAccountContent.getChangeResidenceStreet().isEmpty()) {
                if (!editAccountContent.getChangeResidenceNumber().isEmpty()) {
                    if (!editAccountContent.getChangeResidenceCity().isEmpty()) {
                        if (!editAccountContent.getChangeResidenceCountry().isEmpty()){
                            Donor newDonor = donor;
                            Address newAddress = donor.getActualAddress();
                            newAddress.setStreet(editAccountContent.getChangeResidenceStreet());
                            newAddress.setNumber(editAccountContent.getChangeResidenceNumber());
                            newAddress.setCity(editAccountContent.getChangeResidenceCity());
                            newAddress.setCountry(editAccountContent.getChangeResidenceCountry());

                            newDonor.setAddress(newAddress);

                            donorServiceClient.changePersonalInformation(donor.getId(), newDonor);

                            editAccountContent.setChangeResidenceInfo("Residence changed!");
                        } else {
                            editAccountContent.setChangeResidenceInfo("Country is empty!");
                        }
                    } else {
                        editAccountContent.setChangeResidenceInfo("City is empty!");
                    }
                } else {
                    editAccountContent.setChangeResidenceInfo("Number is empty!");
                }
            } else {
                editAccountContent.setChangeResidenceInfo("Street is empty!");
            }
        });

        mainPane.setCenter(editAccountContent);
    }

    private void changeContentToFillDonationForm() {
        donationFormContent = new DonationFormContent();
        mainPane.setCenter(donationFormContent);
    }

    private void changeContentToViewHistory() {
        viewHistoryContent = new ViewHistoryContent();

        List<String> list = donorServiceClient.viewBloodAnalysisHistory(donor.getId()).stream().map(Analysis::toString).collect(Collectors.toList());

        System.out.println(list);
        ObservableList<String> obsList = FXCollections.observableList(list);
        viewHistoryContent.getListView().setItems(obsList);

        mainPane.setCenter(viewHistoryContent);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        changeContentToRequirements();

        userNameLabel.setText(donor.getFirstName());

        editAccountDetailsButton.setOnAction(event -> changeContentToEditAccount());

        fillDonationFormButton.setOnAction(event -> changeContentToFillDonationForm());

        viewHistoryButton.setOnAction(event -> changeContentToViewHistory());

        requirementsButton.setOnAction(event -> changeContentToRequirements());
    }

    public void setDonorService(DonorServiceClient bean) {
        donorServiceClient = bean;
    }
}

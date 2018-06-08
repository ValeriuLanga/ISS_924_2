package iss_924_2.client.controller;

import iss_924_2.client.content.personnel.SeeDonorListContent;
import iss_924_2.client.content.personnel.SeeRequestsListContent;
import iss_924_2.client.service.PersonnelServiceClient;
import iss_924_2.core.domain.Donor;
import iss_924_2.core.domain.Personnel;
import iss_924_2.core.domain.Request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonnelController implements Initializable {

    AnnotationConfigApplicationContext springContext;
    PersonnelServiceClient personnelServiceClient;
    Personnel personnel;
    Stage mainStage;

    @FXML
    private BorderPane mainPane;
    @FXML
    private Label userNameLabel;
    @FXML
    private Button seeDonorListButton;
    @FXML
    private Button seeRequestsButton;
    @FXML
    private Button seeStocksButton;

    private SeeDonorListContent donorListContent;
    private SeeRequestsListContent requestsListContent;

    public PersonnelController(PersonnelServiceClient personnelServiceClient,
                               AnnotationConfigApplicationContext springContext,
                               Personnel personnel) {
        this.springContext = springContext;
        this.personnelServiceClient = personnelServiceClient;
        this.personnel = personnel;
    }

    private void changeContentToSeeDonors() {
        donorListContent = new SeeDonorListContent();

        Set<Donor> donorSet = personnelServiceClient.collectData();

        List<Donor> donorList = new ArrayList<>(donorSet);

        ObservableList<String> values = FXCollections.observableList(donorList.stream().map(Donor::toString).collect(Collectors.toList()));

        donorListContent.getDonorList().setItems(values);

        mainPane.setCenter(donorListContent);
    }

    private void changeContentToSeeRequests() {
        requestsListContent = new SeeRequestsListContent();

        Set<Request> requestSet = personnelServiceClient.collectRequests();

        List<Request> requestList = new ArrayList<>(requestSet);

        ObservableList<String> values = FXCollections.observableList(requestList.stream().map(Request::toString).collect(Collectors.toList()));

        requestsListContent.getRequestsList().setItems(values);

        mainPane.setCenter(donorListContent);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        changeContentToSeeDonors();
    }
}

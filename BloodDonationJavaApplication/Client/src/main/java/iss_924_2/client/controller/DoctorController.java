package iss_924_2.client.controller;

import iss_924_2.client.content.doctor.BloodStockContent;
import iss_924_2.client.content.doctor.CheckStatusContent;
import iss_924_2.client.content.doctor.RequestBloodContent;
import iss_924_2.client.service.DoctorServiceClient;
import iss_924_2.client.service.LoginServiceClient;
import iss_924_2.core.domain.BloodContainer;
import iss_924_2.core.domain.Doctor;
import iss_924_2.core.domain.Request;
import iss_924_2.core.utils.BloodType;
import iss_924_2.core.utils.ContainerType;
import iss_924_2.core.utils.RequestStatus;
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
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class DoctorController implements Initializable {

    AnnotationConfigApplicationContext springContext;
    DoctorServiceClient doctorServiceClient;
    Doctor doctor;
    Stage mainStage;

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
    @FXML
    private Button logout;

    private BloodStockContent bloodStockContent;
    private CheckStatusContent checkStatusContent;
    private RequestBloodContent requestBloodContent;

    public DoctorController(DoctorServiceClient doctorService, AnnotationConfigApplicationContext springContext,
                            Doctor user) {
        this.doctorServiceClient = doctorService;
        this.springContext = springContext;
        this.doctor = user;
    }

    private void changeContentToRequestBlood() {
        requestBloodContent = new RequestBloodContent();

        requestBloodContent.getRequestButton().setOnAction(event -> {
            BloodContainer bloodContainer = new BloodContainer();
            switch (requestBloodContent.getBloodContainerComboBox()) {
                case ("Red Blood Cells") : {
                    bloodContainer.setContainerType(ContainerType.valueOf("redBloodCells"));
                    break;
                }
                case ("Thrombocytes") : {
                    bloodContainer.setContainerType(ContainerType.valueOf("thrombocytes"));
                    break;
                }
                case ("Plasma") : {
                    bloodContainer.setContainerType(ContainerType.valueOf("plasma"));
                    break;
                }
            }
            bloodContainer.setShelfLife("10");
            bloodContainer.setHospital(doctor.getHospital());
            bloodContainer.setBloodType(BloodType.valueOf(requestBloodContent.getBloodGroup()));

            Request request = new Request();
            request.setDoctor(doctor);
            switch (requestBloodContent.getSelectedUrgencyLevel()) {
                case ("Low") : {
                    request.setUrgencyLevel(1);
                    break;
                }
                case ("Medium") : {
                    request.setUrgencyLevel(2);
                    break;
                }
                case ("High") : {
                    request.setUrgencyLevel(3);
                    break;
                }
            }
            request.setQuantity(Integer.parseInt(requestBloodContent.getQuantityField()));
            request.setBloodContainer(bloodContainer);

            //System.out.println("Got here");
            doctorServiceClient.requestBlood(request, doctor);

            requestBloodContent.setRequestBloodInfo("Blood requested!");
        });

        mainPane.setCenter(requestBloodContent);
    }

    private void changeContentToCheckStatus() {
        checkStatusContent = new CheckStatusContent();

        Set<Request> requests = doctorServiceClient.checkRequestStatus(doctor.getId());

        List<Request> requestList = new ArrayList<>(requests);

        ObservableList<String> values = FXCollections.observableList(requestList.stream().map(Request::toString).collect(Collectors.toList()));

        checkStatusContent.getStatusList().setItems(values);

        checkStatusContent.getCancelRequestButton().setOnAction(event -> {
            int index = checkStatusContent.getStatusList().getSelectionModel().getSelectedIndex();

            int selectedRequestId = requestList.get(index).getId();

            //System.out.println(selectedRequestId);
            doctorServiceClient.cancelBloodRequest(selectedRequestId);

            String cancelledString = checkStatusContent.getStatusList().getSelectionModel().getSelectedItem();
            cancelledString =  cancelledString.substring(0, cancelledString.indexOf("STATUS: ") + 8).concat(RequestStatus.cancelled.toString());

            checkStatusContent.getStatusList().getItems().set(index, cancelledString);
        });

        mainPane.setCenter(checkStatusContent);
    }

    private void changeContentToBloodStock() {
        bloodStockContent = new BloodStockContent();

        Set<BloodContainer> stocks = doctorServiceClient.getAvailableStocks(doctor.getHospital().getId());

        ObservableList<String> values = FXCollections.observableList(stocks.stream().map(BloodContainer::toString).collect(Collectors.toList()));

        bloodStockContent.getBloodStockList().setItems(values);

        mainPane.setCenter(bloodStockContent);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        changeContentToCheckStatus();

        userNameLabel.setText(doctor.getFirstName());

        requestBloodButton.setOnAction(event -> changeContentToRequestBlood());

        checkStatusButton.setOnAction(event -> changeContentToCheckStatus());

        availableBloodButton.setOnAction(event -> changeContentToBloodStock());

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

}

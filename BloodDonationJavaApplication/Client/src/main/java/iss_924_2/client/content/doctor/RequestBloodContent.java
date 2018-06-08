package iss_924_2.client.content.doctor;

import iss_924_2.client.console.ConsoleUi;
import iss_924_2.client.service.DonorServiceClient;
import iss_924_2.core.service.DonorService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequestBloodContent extends AnchorPane {

    @FXML
    private ComboBox<String> bloodTypeComboBox;
    @FXML
    private ComboBox<String> bloodContainerComboBox;
    @FXML
    private RadioButton highUrgency;
    @FXML
    private RadioButton mediumUrgency;
    @FXML
    private RadioButton lowUrgency;
    @FXML
    private Button requestButton;
    @FXML
    private TextField locationStreet;
    @FXML
    private TextField locationNumber;
    @FXML
    private TextField locationCity;
    @FXML
    private TextField locationCountry;
    @FXML
    private Label requestBloodInfo;
    @FXML
    private TextField quantityField;

    private ToggleGroup toggleGroup;

    public RequestBloodContent() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("../../../../../resources/fx/doctoractions/RequestBlood.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);


        try {

            fxmlLoader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        bloodTypeComboBox = (ComboBox) this.lookup("#bloodTypeComboBox");
        bloodContainerComboBox = (ComboBox) this.lookup("#bloodContainerComboBox");
        highUrgency = (RadioButton) this.lookup("#highUrgency");
        mediumUrgency = (RadioButton) this.lookup("#mediumUrgency");
        lowUrgency = (RadioButton) this.lookup("#lowUrgency");
        requestButton = (Button) this.lookup("#requestButton");
        locationStreet = (TextField) this.lookup("#locationStreet");
        locationNumber = (TextField) this.lookup("#locationNumber");
        locationCity = (TextField) this.lookup("#locationCity");
        locationCountry = (TextField) this.lookup("#locationCountry");
        requestBloodInfo = (Label) this.lookup("#requestBloodInfo");
        quantityField = (TextField) this.lookup("#quantityField");

        bloodTypeComboBox.getItems().add("O1");
        bloodTypeComboBox.getItems().add("A2");
        bloodTypeComboBox.getItems().add("B3");
        bloodTypeComboBox.getItems().add("AB4");

        bloodContainerComboBox.getItems().add("Thrombocytes");
        bloodContainerComboBox.getItems().add("Red Blood Cells");
        bloodContainerComboBox.getItems().add("Plasma");

        toggleGroup = new ToggleGroup();
        highUrgency.setToggleGroup(toggleGroup);
        highUrgency.setUserData("High");
        mediumUrgency.setToggleGroup(toggleGroup);
        mediumUrgency.setUserData("Medium");
        lowUrgency.setToggleGroup(toggleGroup);
        lowUrgency.setUserData("Low");
    }

    public String getBloodGroup() {
        return bloodTypeComboBox.getValue();
    }

    public String getBloodContainerComboBox() {
        return bloodContainerComboBox.getValue();
    }

    public Button getRequestButton() {
        return requestButton;
    }

    public String getSelectedUrgencyLevel() {
        return toggleGroup.getSelectedToggle().getUserData().toString();
    }

    public String getLocationStreet() {
        return locationStreet.toString();
    }

    public String getLocationNumber() {
        return locationNumber.toString();
    }

    public String getLocationCity() {
        return locationCity.toString();
    }

    public String getLocationCountry() {
        return locationCountry.toString();
    }

    public String getRequestBloodInfo() {
        return requestBloodInfo.getText();
    }

    public void setRequestBloodInfo(String requestBloodInfo) {
        this.requestBloodInfo.setText(requestBloodInfo);
    }

    public String getQuantityField() {
        return quantityField.getText();
    }

}

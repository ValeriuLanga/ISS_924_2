package iss_924_2.client.content.doctor;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class RequestBloodContent extends AnchorPane {

    @FXML
    private TextField bloodGroupField;
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

        bloodGroupField = (TextField) this.lookup("#bloodGroupField");
        highUrgency = (RadioButton) this.lookup("#highUrgency");
        mediumUrgency = (RadioButton) this.lookup("#mediumUrgency");
        lowUrgency = (RadioButton) this.lookup("#lowUrgency");
        requestButton = (Button) this.lookup("#requestButton");
        locationStreet = (TextField) this.lookup("#locationStreet");
        locationNumber = (TextField) this.lookup("#locationNumber");
        locationCity = (TextField) this.lookup("#locationCity");
        locationCountry = (TextField) this.lookup("#locationCountry");

        toggleGroup = new ToggleGroup();
        highUrgency.setToggleGroup(toggleGroup);
        highUrgency.setUserData("High");
        mediumUrgency.setToggleGroup(toggleGroup);
        highUrgency.setUserData("Medium");
        lowUrgency.setToggleGroup(toggleGroup);
        highUrgency.setUserData("Low");

    }

    public String getBloodGroup() {
        return bloodGroupField.toString();
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
}

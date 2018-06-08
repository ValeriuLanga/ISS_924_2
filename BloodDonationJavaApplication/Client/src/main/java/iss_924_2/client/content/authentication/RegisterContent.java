package iss_924_2.client.content.authentication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class RegisterContent extends AnchorPane {

    @FXML
    private TextField registerUsername;
    @FXML
    private PasswordField registerPassword;
    @FXML
    private TextField registerFirstName;
    @FXML
    private TextField registerLastName;
    @FXML
    private DatePicker registerDate;
    @FXML
    private TextField phoneNumber;
    @FXML
    private TextField addressStreet;
    @FXML
    private TextField addressNumber;
    @FXML
    private TextField addressCity;
    @FXML
    private TextField addressCountry;
    @FXML
    private TextField actualAddressStreet;
    @FXML
    private TextField actualAddressNumber;
    @FXML
    private TextField actualAddressCity;
    @FXML
    private TextField actualAddressCountry;

    public RegisterContent() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../../../resources/fx/authentication/RegisterFragment.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        registerUsername = (TextField) this.lookup("#registerUsernameField");
        registerPassword = (PasswordField) this.lookup("#registerPasswordField");
        registerFirstName = (TextField) this.lookup("#registerFirstName");
        registerLastName = (TextField) this.lookup("#registerLastName");
        registerDate = (DatePicker) this.lookup("#registerDate");
        phoneNumber = (TextField) this.lookup("#phoneNumber");
        addressStreet = (TextField) this.lookup("#addressStreet");
        addressNumber = (TextField) this.lookup("#addressNumber");
        addressCity = (TextField) this.lookup("#addressCity");
        addressCountry = (TextField) this.lookup("#addressCountry");
        actualAddressStreet = (TextField) this.lookup("#actualAddressStreet");
        actualAddressNumber = (TextField) this.lookup("#actualAddressNumber");
        actualAddressCity = (TextField) this.lookup("#actualAddressCity");
        actualAddressCountry = (TextField) this.lookup("#actualAddressCountry");
    }

    public String getRegisterUsername() {
        return registerUsername.getText();
    }

    public String getRegisterPassword() {
        return registerPassword.getText();
    }

    public String getRegisterFirstName() {
        return registerFirstName.getText();
    }

    public String getRegisterLastName() {
        return registerLastName.getText();
    }

    public String getRegisterDate() {
        return registerDate.getEditor().textProperty().getValue();
    }

    public String getPhoneNumber() {
        return phoneNumber.getText();
    }

    public String getAddressStreet() {
        return addressStreet.getText();
    }

    public String getAddressNumber() {
        return addressNumber.getText();
    }

    public String getAddressCity() {
        return addressCity.getText();
    }

    public String getAddressCountry() {
        return addressCountry.getText();
    }

    public String getActualAddressStreet() {
        return actualAddressStreet.getText();
    }

    public String getActualAddressNumber() {
        return actualAddressNumber.getText();
    }

    public String getActualAddressCity() {
        return actualAddressCity.getText();
    }

    public String getActualAddressCountry() {
        return actualAddressCountry.getText();
    }
}

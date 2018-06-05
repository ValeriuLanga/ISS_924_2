package iss_924_2.content.authentication;

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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../../resources/fx/authentication/RegisterFragment.fxml"));

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
        return registerUsername.toString();
    }

    public String getRegisterPassword() {
        return registerPassword.toString();
    }

    public String getRegisterFirstName() {
        return registerFirstName.toString();
    }

    public String getRegisterLastName() {
        return registerLastName.toString();
    }

    public String getRegisterDate() {
        return registerDate.toString();
    }

    public String getAddressStreet() {
        return addressStreet.toString();
    }

    public String getAddressNumber() {
        return addressNumber.toString();
    }

    public String getAddressCity() {
        return addressCity.toString();
    }

    public String getAddressCountry() {
        return addressCountry.toString();
    }

    public String getActualAddressStreet() {
        return actualAddressStreet.toString();
    }

    public String getActualAddressNumber() {
        return actualAddressNumber.toString();
    }

    public String getActualAddressCity() {
        return actualAddressCity.toString();
    }

    public String getActualAddressCountry() {
        return actualAddressCountry.toString();
    }
}

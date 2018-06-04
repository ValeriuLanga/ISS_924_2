package iss_924_2.controller;

import iss_924_2.ClientAppFX;
import iss_924_2.content.LoginContent;
import iss_924_2.content.RegisterContent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;


@Component
public class AuthenticationController implements Initializable {

    @FXML
    private BorderPane mainPane;
    @FXML
    private Button registerButton;
    @FXML
    private Button loginButton;
    @FXML
    private TextField userNameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorLabel;
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

    private LoginContent loginContent;
    private RegisterContent registerContent;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loginContent = new LoginContent();
        mainPane.setCenter(loginContent);

        userNameField = (TextField)  mainPane.lookup("#userNameField");
        passwordField = (PasswordField) mainPane.lookup("#passwordField");
        errorLabel = (Label) mainPane.lookup("#errorLabel");

        registerButton.setOnAction(event -> {
            if (loginButton.getText().equals("Login")) {
                registerContent = new RegisterContent();
                loginButton.setText("Back");
                mainPane.setCenter(registerContent);

                registerUsername = (TextField) mainPane.lookup("#registerUsernameField");
                registerPassword = (PasswordField) mainPane.lookup("#registerPasswordField");
                registerFirstName = (TextField) mainPane.lookup("#registerFirstName");
                registerLastName = (TextField) mainPane.lookup("#registerLastName");
                registerDate = (DatePicker) mainPane.lookup("#registerDate");
                addressStreet = (TextField) mainPane.lookup("#addressStreet");
                addressNumber = (TextField) mainPane.lookup("#addressNumber");
                addressCity = (TextField) mainPane.lookup("#addressCity");
                addressCountry = (TextField) mainPane.lookup("#addressCountry");
                actualAddressStreet = (TextField) mainPane.lookup("#actualAddressStreet");
                actualAddressNumber = (TextField) mainPane.lookup("#actualAddressNumber");
                actualAddressCity = (TextField) mainPane.lookup("#actualAddressCity");
                actualAddressCountry = (TextField) mainPane.lookup("#actualAddressCountry");
            }
        });

        loginButton.setOnAction(event -> {
            if (loginButton.getText().equals("Back")) {
                loginContent = new LoginContent();
                loginButton.setText("Login");
                mainPane.setCenter(loginContent);

                userNameField = (TextField)  mainPane.lookup("#userNameField");
                passwordField = (PasswordField) mainPane.lookup("#passwordField");
                errorLabel = (Label) mainPane.lookup("#errorLabel");
            } else if (loginButton.getText().equals("Login")) {
                login();
            }
        });
    }

    private void login() {
        String username = userNameField.getText();
        String password = passwordField.getText();

        if (!username.equals("john") || !password.equals("hatz")) {
            errorLabel.setText("Incorrect username or password");
        } else {
            errorLabel.setText("Login successful");
        }
    }
}

package iss_924_2.client.content.authentication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginContent extends AnchorPane {

    @FXML
    private TextField userNameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorLabel;

    public LoginContent() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("../../../../../resources/fx/authentication/LoginFragment.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {

            fxmlLoader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        userNameField = (TextField)  this.lookup("#userNameField");
        passwordField = (PasswordField) this.lookup("#passwordField");
        errorLabel = (Label) this.lookup("#errorLabel");
    }

    public String getUserNameField() {
        return userNameField.toString();
    }

    public String getPasswordField() {
        return passwordField.toString();
    }

    public String getErrorLabel() {
        return errorLabel.toString();
    }

    public void setErrorLabel(String errorLabel) {
        this.errorLabel.setText(errorLabel);
    }

}

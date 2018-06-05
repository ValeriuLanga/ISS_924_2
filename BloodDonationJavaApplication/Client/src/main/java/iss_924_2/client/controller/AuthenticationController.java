package iss_924_2.client.controller;

import iss_924_2.client.content.authentication.LoginContent;
import iss_924_2.client.content.authentication.RegisterContent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;


public class AuthenticationController implements Initializable {

    @FXML
    private BorderPane mainPane;
    @FXML
    private Button registerButton;
    @FXML
    private Button loginButton;

    private LoginContent loginContent;
    private RegisterContent registerContent;

    private void changeContentToLogin() {
        loginContent = new LoginContent();
        mainPane.setCenter(loginContent);
    }

    private void changeCOntentToRegister() {
        registerContent = new RegisterContent();
        mainPane.setCenter(registerContent);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        changeContentToLogin();

        registerButton.setOnAction(event -> {
            if (loginButton.getText().equals("Login")) {
                changeCOntentToRegister();
                loginButton.setText("Back");
            }
        });

        loginButton.setOnAction(event -> {
            if (loginButton.getText().equals("Back")) {
                changeContentToLogin();
                loginButton.setText("Login");
            } else if (loginButton.getText().equals("Login")) {
                login();
            }
        });
    }

    private void login() {
        String username = loginContent.getUserNameField();
        String password = loginContent.getPasswordField();

        if (!username.equals("john") || !password.equals("hatz")) {
            loginContent.setErrorLabel("Incorrect username or password");
        } else {
            loginContent.setErrorLabel("Login successful");
        }
    }
}

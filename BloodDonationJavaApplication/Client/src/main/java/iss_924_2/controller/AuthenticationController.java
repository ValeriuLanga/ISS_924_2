package iss_924_2.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(location);
        loginContent = new LoginContent();
        mainPane.setCenter(loginContent);

        registerButton.setOnAction(event -> {
            if (loginButton.getText().equals("Login")) {
                System.out.println("Swapping center to Register!");
                registerContent = new RegisterContent();

                loginButton.setText("Back");

                mainPane.setCenter(registerContent);
            }
        });

        loginButton.setOnAction(event -> {
            if (loginButton.getText().equals("Back")) {
                System.out.println("Going back!");

                loginContent = new LoginContent();

                loginButton.setText("Login");
                mainPane.setCenter(loginContent);
            }
        });
    }
}

package iss_924_2.client.controller;

import iss_924_2.client.ClientAppFX;
import iss_924_2.client.content.authentication.LoginContent;
import iss_924_2.client.content.authentication.RegisterContent;
import iss_924_2.client.service.DonorServiceClient;
import iss_924_2.client.service.LoginServiceClient;
import iss_924_2.core.domain.Donor;
import iss_924_2.core.domain.User;
import iss_924_2.core.exceptions.LoginServiceException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class AuthenticationController implements Initializable {

    AnnotationConfigApplicationContext springContext;
    LoginServiceClient loginServiceClient;
    Stage mainStage;

    @FXML
    private BorderPane mainPane;
    @FXML
    private Button registerButton;
    @FXML
    private Button loginButton;

    private LoginContent loginContent;
    private RegisterContent registerContent;

    public AuthenticationController(LoginServiceClient loginServiceClient, AnnotationConfigApplicationContext springContext) {
        this.loginServiceClient = loginServiceClient;
        this.springContext = springContext;
    }

    private void changeContentToLogin() {
        loginContent = new LoginContent();
        mainPane.setCenter(loginContent);
    }

    private void changeContentToRegister() {
        registerContent = new RegisterContent();
        mainPane.setCenter(registerContent);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        changeContentToLogin();

        registerButton.setOnAction(event -> {
            if (loginButton.getText().equals("Login")) {
                changeContentToRegister();
                loginButton.setText("Back");
            }
        });

        loginButton.setOnAction(event -> {
            if (loginButton.getText().equals("Back")) {
                changeContentToLogin();
                loginButton.setText("Login");
            } else if (loginButton.getText().equals("Login")) {
                mainStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                login();
            }
        });
    }

    private void login() {
        String username = loginContent.getUserNameField();
        String password = loginContent.getPasswordField();

        System.out.println(username + " " + password);
        if (username.isEmpty() || password.isEmpty()) {
            loginContent.setErrorLabel("Username or password is empty.");
            return;
        }

        try {
            User user = loginServiceClient.LoginUser(username, password);
            switch(user.getUserType().toString()) {
                case("Donor") : {
                    try {
                        Donor donor = (Donor) user;
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../../resources/fx/DonorWindow.fxml"));

                        DonorController donorController = new DonorController(springContext.getBean(DonorServiceClient.class), springContext, donor);
                        fxmlLoader.setController(donorController);

                        mainStage.setScene(new Scene(fxmlLoader.load()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (LoginServiceException e) {
            System.out.print(e.getMessage());
            loginContent.setErrorLabel(e.getMessage());
        }
    }
}

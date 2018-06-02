package iss_924_2.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;


public class LoginContent extends AnchorPane {

    public LoginContent() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("../../../resources/fx/authentication/LoginFragment.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {

            fxmlLoader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package iss_924_2.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class RegisterContent extends AnchorPane {

    public RegisterContent() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/fx/authentication/RegisterFragment.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package iss_924_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientAppFX extends Application {
    Parent root;
    Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage mainStage) {
        try {
            root = FXMLLoader.load(getClass().getResource("../../resources/fx/AuthenticationWindow.fxml"));
            stage = mainStage;
            stage.setTitle("Blood Donation");

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

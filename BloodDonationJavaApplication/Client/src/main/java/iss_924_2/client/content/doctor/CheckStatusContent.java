package iss_924_2.client.content.doctor;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public class CheckStatusContent extends AnchorPane {

    @FXML
    private ListView statusList;

    public CheckStatusContent() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("../../../../../resources/fx/doctoractions/CheckStatus.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        statusList = (ListView) this.lookup("#statusList");
    }
}

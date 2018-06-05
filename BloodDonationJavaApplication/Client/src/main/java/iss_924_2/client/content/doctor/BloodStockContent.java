package iss_924_2.client.content.doctor;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public class BloodStockContent extends AnchorPane {

    @FXML
    private ListView bloodStockList;

    public BloodStockContent() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("../../../../../resources/fx/doctoractions/BloodStock.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        bloodStockList = (ListView) this.lookup("#bloodStockList");
    }
}

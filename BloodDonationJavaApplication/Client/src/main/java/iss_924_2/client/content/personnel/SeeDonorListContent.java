package iss_924_2.client.content.personnel;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public class SeeDonorListContent extends AnchorPane {

    @FXML
    private ListView<String> donorList;

    public SeeDonorListContent() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("../../../../../resources/fx/personnelaction/DonorList.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {

            fxmlLoader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        donorList = (ListView) this.lookup("#donorList");
    }

    public ListView<String> getDonorList() {
        return donorList;
    }
}

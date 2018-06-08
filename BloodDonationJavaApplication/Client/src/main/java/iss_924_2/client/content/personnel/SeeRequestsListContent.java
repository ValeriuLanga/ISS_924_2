package iss_924_2.client.content.personnel;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public class SeeRequestsListContent extends AnchorPane {

    @FXML
    private ListView<String> requestsList;

    public SeeRequestsListContent() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("../../../../../resources/fx/personnelaction/RequestsList.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {

            fxmlLoader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        requestsList = (ListView) this.lookup("#requestsList");
    }

    public ListView<String> getRequestsList() {
        return requestsList;
    }
}

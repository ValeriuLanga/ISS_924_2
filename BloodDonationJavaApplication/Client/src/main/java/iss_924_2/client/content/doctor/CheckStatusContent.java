package iss_924_2.client.content.doctor;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public class CheckStatusContent extends AnchorPane {

    @FXML
    private ListView<String> statusList;
    @FXML
    private Button cancelRequestButton;
    @FXML
    private Label cancelRequestInfo;

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
        cancelRequestButton = (Button) this.lookup("#cancelRequestButton");
        cancelRequestInfo = (Label) this.lookup("#cancelRequestInfo");
    }

    public ListView<String> getStatusList() {
        return statusList;
    }

    public Button getCancelRequestButton() {
        return cancelRequestButton;
    }

    public void setCancelRequestInfo(String cancelRequestInfo) {
        this.cancelRequestInfo.setText(cancelRequestInfo);
    }
}

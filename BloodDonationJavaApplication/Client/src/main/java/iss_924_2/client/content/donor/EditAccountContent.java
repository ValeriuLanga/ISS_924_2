package iss_924_2.client.content.donor;

import iss_924_2.client.service.DonorServiceClient;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class EditAccountContent extends AnchorPane {

    @FXML
    private Label userFirstAndLastName;
    @FXML
    private Label userUsername;
    @FXML
    private Button changePasswordSwitch;
    @FXML
    private HBox changePasswordHbox;
    @FXML
    private PasswordField oldPassword;
    @FXML
    private PasswordField newPassword;
    @FXML
    private PasswordField retypeNew;
    @FXML
    private Button changePasswordButton;
    @FXML
    private Label changePasswordInfo;
    @FXML
    private Button changeNameSwitch;
    @FXML
    private HBox changeNameHbox;
    @FXML
    private TextField changeFirstNameField;
    @FXML
    private TextField changeLastNameField;
    @FXML
    private Button changeNameButton;
    @FXML
    private Label changeNameInfo;
    @FXML
    private Button changeAddressSwitch;
    @FXML
    private HBox changeAddressHbox;
    @FXML
    private TextField changeAddressStreet;
    @FXML
    private TextField changeAddressNumber;
    @FXML
    private TextField changeAddressCity;
    @FXML
    private TextField changeAddressCountry;
    @FXML
    private Button changeAddressButton;
    @FXML
    private Label changeAddressInfo;
    @FXML
    private Button changeResidenceSwitch;
    @FXML
    private HBox changeResidenceHbox;
    @FXML
    private TextField changeResidenceStreet;
    @FXML
    private TextField changeResidenceNumber;
    @FXML
    private TextField changeResidenceCity;
    @FXML
    private TextField changeResidenceCountry;
    @FXML
    private Button changeResidenceButton;
    @FXML
    private Label changeResidenceInfo;

    public EditAccountContent() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("../../../../../resources/fx/donoractions/EditAccount.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {

            fxmlLoader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        userFirstAndLastName = (Label) this.lookup("#userFirstAndLastName");
        userUsername = (Label) this.lookup("#userUsername");
        changePasswordSwitch = (Button) this.lookup("#changePasswordSwitch");
        changePasswordHbox = (HBox) this.lookup("#changePasswordHbox");
        oldPassword = (PasswordField) this.lookup("#oldPassword");
        newPassword = (PasswordField) this.lookup("#newPassword");
        retypeNew = (PasswordField) this.lookup("#retypeNew");
        changePasswordButton = (Button) this.lookup("#changePasswordButton");
        changePasswordInfo = (Label) this.lookup("#changePasswordInfo");
        changeNameSwitch = (Button) this.lookup("#changeNameSwitch");
        changeNameHbox = (HBox) this.lookup("#changeNameHbox");
        changeFirstNameField = (TextField) this.lookup("#changeFirstNameField");
        changeLastNameField = (TextField) this.lookup("#changeLastNameField");
        changeNameButton = (Button) this.lookup("#changeNameButton");
        changeNameInfo = (Label) this.lookup("#changeNameInfo");
        changeAddressSwitch = (Button) this.lookup("#changeAddressSwitch");
        changeAddressHbox = (HBox) this.lookup("#changeAddressHbox");
        changeAddressStreet = (TextField) this.lookup("#changeAddressStreet");
        changeAddressNumber = (TextField) this.lookup("#changeAddressNumber");
        changeAddressCity = (TextField) this.lookup("#changeAddressCity");
        changeAddressCountry = (TextField) this.lookup("#changeAddressCountry");
        changeAddressButton = (Button) this.lookup("#changeAddressButton");
        changeAddressInfo = (Label) this.lookup("#changeAddressInfo");
        changeResidenceSwitch = (Button) this.lookup("#changeResidenceSwitch");
        changeResidenceHbox = (HBox) this.lookup("#changeResidenceHbox");
        changeResidenceStreet = (TextField) this.lookup("#changeResidenceStreet");
        changeResidenceNumber = (TextField) this.lookup("#changeResidenceNumber");
        changeResidenceCity = (TextField) this.lookup("#changeResidenceCity");
        changeResidenceCountry = (TextField) this.lookup("#changeResidenceCountry");
        changeResidenceButton = (Button) this.lookup("#changeResidenceButton");
        changeResidenceInfo = (Label) this.lookup("#changeResidenceInfo");

        changePasswordSwitch.setOnAction(event -> {
            if (changePasswordHbox.isVisible())
                changePasswordHbox.setVisible(false);
            else {
                changePasswordHbox.setVisible(true);
                changeResidenceHbox.setVisible(false);
                changeAddressHbox.setVisible(false);
                changeNameHbox.setVisible(false);
            }
        });

        changeNameSwitch.setOnAction(event -> {
            if (changeNameHbox.isVisible())
                changeNameHbox.setVisible(false);
            else {
                changePasswordHbox.setVisible(false);
                changeResidenceHbox.setVisible(false);
                changeAddressHbox.setVisible(false);
                changeNameHbox.setVisible(true);
            }
        });

        changeAddressSwitch.setOnAction(event -> {
            if (changeAddressHbox.isVisible())
                changeAddressHbox.setVisible(false);
            else {
                changePasswordHbox.setVisible(false);
                changeResidenceHbox.setVisible(false);
                changeAddressHbox.setVisible(true);
                changeNameHbox.setVisible(false);
            }
        });

        changeResidenceSwitch.setOnAction(event -> {
            if (changeResidenceHbox.isVisible())
                changeResidenceHbox.setVisible(false);
            else {
                changePasswordHbox.setVisible(false);
                changeResidenceHbox.setVisible(true);
                changeAddressHbox.setVisible(false);
                changeNameHbox.setVisible(false);
            }
        });
    }

    public String getUserFirstAndLastName() {
        return userFirstAndLastName.getText();
    }

    public void setUserFirstAndLastName(String userFirstAndLastName) {
        this.userFirstAndLastName.setText(userFirstAndLastName);
    }

    public String getUserUsername() {
        return userUsername.getText();
    }

    public void setUserUsername(String userUsername) {
        this.userUsername.setText(userUsername);
    }

    public Button getChangePasswordSwitch() {
        return changePasswordSwitch;
    }

    public String getOldPassword() {
        return oldPassword.getText();
    }

    public String getNewPassword() {
        return newPassword.getText();
    }

    public String getRetypeNew() {
        return retypeNew.getText();
    }

    public Button getChangePasswordButton() {
        return changePasswordButton;
    }

    public String getChangePasswordInfo() {
        return changePasswordInfo.getText();
    }

    public void setChangePasswordInfo(String changePasswordInfo) {
        this.changePasswordInfo.setText(changePasswordInfo);
    }

    public Button getChangeNameSwitch() {
        return changeNameSwitch;
    }

    public String getChangeFirstNameField() {
        return changeFirstNameField.getText();
    }

    public void setChangeFirstNameField(String changeFirstNameField) {
        this.changeFirstNameField.setText(changeFirstNameField);
    }

    public String getChangeLastNameField() {
        return changeLastNameField.getText();
    }

    public void setChangeLastNameField(String changeFirstNameField) {
        this.changeLastNameField.setText(changeFirstNameField);
    }

    public Button getChangeNameButton() {
        return changeNameButton;
    }

    public String getChangeNameInfo() {
        return changeNameInfo.getText();
    }

    public void setChangeNameInfo(String changeNameInfo) {
        this.changeNameInfo.setText(changeNameInfo);
    }

    public Button getChangeAddressSwitch() {
        return changeAddressSwitch;
    }

    public String getChangeAddressStreet() {
        return changeAddressStreet.getText();
    }

    public void setChangeAddressStreet(String changeAddressStreet) {
        this.changeAddressStreet.setText(changeAddressStreet);
    }

    public String getChangeAddressNumber() {
        return changeAddressNumber.getText();
    }

    public void setChangeAddressNumber(String changeAddressNumber) {
        this.changeAddressNumber.setText(changeAddressNumber);
    }

    public String getChangeAddressCity() {
        return changeAddressCity.getText();
    }

    public void setChangeAddressCity(String changeAddressCity) {
        this.changeAddressCity.setText(changeAddressCity);
    }

    public String getChangeAddressCountry() {
        return changeAddressCountry.getText();
    }

    public void setChangeAddressCountry(String changeAddressCountry) {
        this.changeAddressCountry.setText(changeAddressCountry);
    }

    public Button getChangeAddressButton() {
        return changeAddressButton;
    }

    public String getChangeAddressInfo() {
        return changeAddressInfo.getText();
    }

    public void setChangeAddressInfo(String changeAddressInfo) {
        this.changeAddressInfo.setText(changeAddressInfo);
    }

    public Button getChangeResidenceSwitch() {
        return changeResidenceSwitch;
    }

    public String getChangeResidenceStreet() {
        return changeResidenceStreet.getText();
    }

    public void setChangeResidenceStreet(String changeResidenceStreet) {
        this.changeResidenceStreet.setText(changeResidenceStreet);
    }

    public String getChangeResidenceNumber() {
        return changeResidenceNumber.getText();
    }

    public void setChangeResidenceNumber(String changeResidenceNumber) {
        this.changeResidenceNumber.setText(changeResidenceNumber);
    }

    public String getChangeResidenceCity() {
        return changeResidenceCity.getText();
    }

    public void setChangeResidenceCity(String changeResidenceCity) {
        this.changeResidenceCity.setText(changeResidenceCity);
    }

    public String getChangeResidenceCountry() {
        return changeResidenceCountry.getText();
    }

    public void setChangeResidenceCountry(String changeResidenceCountry) {
        this.changeResidenceCountry.setText(changeResidenceCountry);
    }

    public Button getChangeResidenceButton() {
        return changeResidenceButton;
    }

    public String getChangeResidenceInfo() {
        return changeResidenceInfo.getText();
    }

    public void setChangeResidenceInfo(String changeResidenceInfo) {
        this.changeResidenceInfo.setText(changeResidenceInfo);
    }
}

package iss_924_2.content.donor;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DonationFormContent extends AnchorPane {

    @FXML
    private Label eligibilityLabel;
    @FXML
    private TextField donationFormFirstName;
    @FXML
    private TextField donationFormLastName;
    @FXML
    private DatePicker donationFormDateOfBirth;
    @FXML
    private TextField addressStreet;
    @FXML
    private TextField addressNumber;
    @FXML
    private TextField addressCity;
    @FXML
    private TextField addressCountry;
    @FXML
    private TextField residenceStreet;
    @FXML
    private TextField residenceNumber;
    @FXML
    private TextField residenceCity;
    @FXML
    private TextField residenceCountry;
    @FXML
    private Button submitButton;

    public DonationFormContent() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("../../../../resources/fx/donoractions/DonationForm.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {

            fxmlLoader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        eligibilityLabel = (Label) this.lookup("#eligibilityLabel");
        donationFormFirstName = (TextField) this.lookup("#donationFormFirstName");
        donationFormLastName = (TextField) this.lookup("#donationFormLastName");
        donationFormDateOfBirth = (DatePicker) this.lookup("#donationFormDateOfBirth");
        addressStreet = (TextField) this.lookup("#addressStreet");
        addressNumber = (TextField) this.lookup("#addressNumber");
        addressCity = (TextField) this.lookup("#addressCity");
        addressCountry = (TextField) this.lookup("#addressCountry");
        residenceStreet = (TextField) this.lookup("#residenceStreet");
        residenceNumber = (TextField) this.lookup("#residenceNumber");
        residenceCity = (TextField) this.lookup("#residenceCity");
        residenceCountry = (TextField) this.lookup("#residenceCountry");
        submitButton = (Button) this.lookup("#submitButton");
    }

    public String getDonationFormFirstName() {
        return donationFormFirstName.toString();
    }

    public void setDonationFormFirstName(String donationFormFirstName) {
        this.donationFormFirstName.setText(donationFormFirstName);
    }

    public String getDonationFormLastName() {
        return donationFormLastName.toString();
    }

    public void setDonationFormLastName(String donationFormLastName) {
        this.donationFormLastName.setText(donationFormLastName);
    }

    public String getDonationFormDateOfBirth() {
        return donationFormDateOfBirth.toString();
    }

    public void setDonationFormDateOfBirth(String donationFormDateOfBirth) {
        this.donationFormDateOfBirth.setAccessibleText(donationFormDateOfBirth);
    }

    public String getAddressStreet() {
        return addressStreet.toString();
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet.setText(addressStreet);
    }

    public String getAddressNumber() {
        return addressNumber.toString();
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber.setText(addressNumber);
    }

    public String getAddressCity() {
        return addressCity.toString();
    }

    public void setAddressCity(String addressCity) {
        this.addressCity.setText(addressCity);
    }

    public String getAddressCountry() {
        return addressCountry.toString();
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry.setText(addressCountry);
    }

    public String getResidenceStreet() {
        return residenceStreet.toString();
    }

    public void setResidenceStreet(String residenceStreet) {
        this.residenceStreet.setText(residenceStreet);
    }

    public String getResidenceNumber() {
        return residenceNumber.toString();
    }

    public void setResidenceNumber(String residenceNumber) {
        this.residenceNumber.setText(residenceNumber);
    }

    public String getResidenceCity() {
        return residenceCity.toString();
    }

    public void setResidenceCity(String residenceCity) {
        this.residenceCity.setText(residenceCity);
    }

    public String getResidenceCountry() {
        return residenceCountry.toString();
    }

    public void setResidenceCountry(String residenceCountry) {
        this.residenceCountry.setText(residenceCountry);
    }
}

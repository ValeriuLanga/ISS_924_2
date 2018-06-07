package iss_924_2.client.content.donor;

import iss_924_2.core.domain.Donor;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;

public class DonationFormContent extends AnchorPane {

    Donor donor;
    @FXML
    private Label eligibilityLabel;
    @FXML
    private Label infoLabel;
    @FXML
    private TextField donationFormFirstName;
    @FXML
    private TextField donationFormLastName;
    @FXML
    private TextField donationFormDateOfBirth;
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

    public DonationFormContent(Donor d) {
        donor = d;
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("../../../../../resources/fx/donoractions/DonationForm.fxml"));

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
        donationFormDateOfBirth = (TextField) this.lookup("#dateofbirth");
        addressStreet = (TextField) this.lookup("#addressStreet");
        addressNumber = (TextField) this.lookup("#addressNumber");
        addressCity = (TextField) this.lookup("#addressCity");
        addressCountry = (TextField) this.lookup("#addressCountry");
        residenceStreet = (TextField) this.lookup("#residenceStreet");
        residenceNumber = (TextField) this.lookup("#residenceNumber");
        residenceCity = (TextField) this.lookup("#residenceCity");
        residenceCountry = (TextField) this.lookup("#residenceCountry");
        submitButton = (Button) this.lookup("#submitButton");
        infoLabel = (Label) this.lookup("#infolabel");

        donationFormDateOfBirth.setText(donor.getDateOfBirth());
        donationFormFirstName.setText(donor.getFirstName());
        donationFormLastName.setText(donor.getLastName());
        addressStreet.setText(donor.getAddress().getStreet());
        addressCountry.setText(donor.getAddress().getCountry());
        addressCity.setText(donor.getAddress().getCity());
        addressNumber.setText(donor.getAddress().getNumber());
        residenceStreet.setText(donor.getActualAddress().getStreet());
        residenceCountry.setText(donor.getActualAddress().getCountry());
        residenceCity.setText(donor.getActualAddress().getCity());
        residenceNumber.setText(donor.getActualAddress().getNumber());

        submitButton.setOnAction(event -> {
            infoLabel.setText("Donation form submitted!");
        });


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

package iss_924_2.client.content.donor;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class RequirementsContent extends AnchorPane {

    @FXML
    private TextArea textArea;

    public RequirementsContent() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("../../../../../resources/fx/donoractions/Requirements.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {

            fxmlLoader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        textArea = (TextArea) this.lookup("#textArea");

        String hugeText = "\n" +
                "\n" +
                "Basic Eligibility Guidelines\n" +
                "\n" +
                "\n" +
                "Age: You must be at least 17 years old to donate to the general blood supply. There is no upper age limit for blood donation as long as you are well with no restrictions or limitations to your activities.\n" +
                "\n" +
                "High Blood Pressure: Acceptable as long as your blood pressure is below 180 systolic (first number) and below 100 diastolic (second number) at the time of donation. Medications for high blood pressure do not disqualify you from donating.\n" +
                "\n" +
                "Body Piercing: You must not donate if you have had a tongue, nose, belly button or genital piercing in the past 12 months (donors with pierced ears are eligible).\n" +
                "\n" +
                "Cold and Flu: Wait if you have a fever or a productive cough (bringing up phlegm). Wait if you do not feel well on the day of donation. Wait until you have completed antibiotic treatment for sinus, throat or lung infection.\n" +
                "\n" +
                "Diabetes: Acceptable as long as it is well controlled, whether medication is taken or not.\n" +
                "\n" +
                "Diet: A meal is recommended at least four hours prior to donation. Drink plenty of fluids.\n" +
                "\n" +
                "MSM: Men who have had sex with other men, at any time since 1977 (the beginning of the AIDS epidemic in the United States) are currently deferred as blood donors. This is because MSM are, as a group, at increased risk for HIV, hepatitis B and certain other infections that can be transmitted by transfusion.\n" +
                "\n" +
                "Tattoos: One-year deferral.\n" +
                "\n" +
                "Weight: You must weigh at least 110 pounds to be eligible for blood donation for your own safety. Blood volume is in proportion to body weight. Donors who weigh less than 110 pounds may not tolerate the removal of the required volume of blood as well as those who weigh more than 110 pounds. There is no upper weight limit as long as your weight is not higher than the weight limit of the donor bed or lounge you are using. You can discuss any upper weight limitations of beds and lounges with your local health historian.\n" +
                "\n" +
                "Other criteria that will be assessed at the time of donation such as (list is not all inclusive):\n" +
                "\n" +
                "Hemoglobin, Travel, Cancer, Medications, Hepatitis, and HIV Risk:\n" +
                "\n" +
                "Intravenous drug abusers: HIV, HBV, HCV and HTLV\n" +
                "Transplant patients: animal tissue or organs\n" +
                "People who have recently traveled to or lived abroad in certain countries may be excluded because they are at risk for transmitting agents such as malaria or variant Creutzfeldt-Jakob Disease (vCJD).\n" +
                "\n" +
                "How often can I give blood?\n" +
                "Every 56 days.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n";

        textArea.setText(hugeText);

    }
}

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class TargetHeartRateController {

    @FXML
    private TextField age;

    @FXML
    private TextField maxHeartRate;

    @FXML
    private Button buttonCalculate;

    @FXML
    private TextField personHeartRate;

    @FXML
    void calculateButtonPressed(ActionEvent event) {
        try {
            Integer personAge = new Integer(age.getText());
            if (personAge < 0) {
                personHeartRate.setText("Incorrect age. Try again");
            } else {
                Integer maximumHeartRate = 220 - personAge;
                Double personalInitialHeartRate = maximumHeartRate * 0.5;
                Double personalFinalHeartRate = maximumHeartRate * 0.85;

                maxHeartRate.setText(maximumHeartRate.toString());
                personHeartRate.setText(" From " + personalInitialHeartRate.toString() + " to " + personalFinalHeartRate.toString());
            }
        } catch (NumberFormatException ex) {
            age.setText("Incorrect. Try again");
            age.selectAll();
            age.requestFocus();
        }
    }



}
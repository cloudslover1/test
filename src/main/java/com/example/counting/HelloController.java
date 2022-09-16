package com.example.counting;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Counter;

public class HelloController {
    public Button addToCounter;
    public TextField textField;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    Counter buttonCounter = new Counter();

    public void onAddOneClick(ActionEvent actionEvent) {
        //buttonCounter.getK();

        //welcomeText.setText(buttonCounter.getK());
        welcomeText.setText(buttonCounter.getK());
    }
    public void onAddToField(ActionEvent actionEvent) {
        int nD = 0;
        String fieldValue = textField.getText();
        try {

            nD = Integer.valueOf(fieldValue);
        }catch (NumberFormatException e) {

            System.err.println("Неверный формат строки!");

        }
        //textField.commitValue();


        //int nDigit = buttonCounter.getStringToInt();
        welcomeText.setText(buttonCounter.setK(nD));
    }
}
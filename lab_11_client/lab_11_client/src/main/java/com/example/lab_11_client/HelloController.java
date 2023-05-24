package com.example.lab_11_client;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField inputField;
    @FXML
    private TextArea outputArea;

    @FXML
    public void send() {
        String message = inputField.getText();
        outputArea.appendText(message + "\n");
        inputField.clear();
    }
}
package com.example.lab_11_client;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    private ConnectionThread connectionThread;

    @FXML
    private TextField inputField;
    @FXML
    private TextArea outputArea;

    public HelloController(ConnectionThread connectionThread) {
        this.connectionThread = connectionThread;
    }

    @FXML
    public void send() {
        String message = inputField.getText();
        outputArea.appendText(message + "\n");
        inputField.clear();
        connectionThread.broadcast(message);
    }

    public void broadcast(String login, String message) {
        outputArea.appendText(login + ": " + message + "\n");
    }
}
package com.example.lab_11_client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ConnectionThread connectionThread = new ConnectionThread("localhost", 5000);
        connectionThread.start();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Logowanie");
        dialog.setContentText("Wpisz login");

        Optional<String> result = dialog.showAndWait();

        if(result.isPresent()) {
            String login = result.get();
            connectionThread.login(login);

            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }


    }

    public static void main(String[] args) {
        launch();
    }
}
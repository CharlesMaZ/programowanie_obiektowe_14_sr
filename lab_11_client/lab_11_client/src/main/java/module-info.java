module com.example.lab_11_client {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.lab_11_client to javafx.fxml;
    exports com.example.lab_11_client;
}
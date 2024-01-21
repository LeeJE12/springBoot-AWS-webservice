module com.example.webservice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.webservice to javafx.fxml;
    exports com.example.webservice;
}
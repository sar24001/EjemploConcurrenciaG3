module com.example.ejemploconcurrenciag3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemploconcurrenciag3 to javafx.fxml;
    exports com.example.ejemploconcurrenciag3;
}
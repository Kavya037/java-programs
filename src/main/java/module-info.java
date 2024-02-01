module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens functionalinterfaces to javafx.fxml;
    exports functionalinterfaces;
}
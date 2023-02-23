module com.example.primerexamenparcial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primerexamenparcial to javafx.fxml;
    exports com.example.primerexamenparcial;
}
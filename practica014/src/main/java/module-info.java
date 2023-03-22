module com.daw.practica014 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.daw.practica014 to javafx.fxml;
    exports com.daw.practica014;
}

module com.chaveztr.ejercicio1_5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.chaveztr.ejercicio1_5 to javafx.fxml;
    exports com.chaveztr.ejercicio1_5;
}

module com.diaasap.ejercicio_1_1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.diaasap.ejercicio_1_1 to javafx.fxml;
    exports com.diaasap.ejercicio_1_1;
}

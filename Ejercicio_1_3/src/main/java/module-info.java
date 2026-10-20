module com.diaasap.ejercicio_1_3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.diaasap.ejercicio_1_3 to javafx.fxml;
    exports com.diaasap.ejercicio_1_3;
}

module com.diaasap.ejercicio_1_4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.diaasap.ejercicio_1_4 to javafx.fxml;
    exports com.diaasap.ejercicio_1_4;
}

module com.diaasap.ejercicio_1_2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.diaasap.ejercicio_1_2 to javafx.fxml;
    exports com.diaasap.ejercicio_1_2;
}

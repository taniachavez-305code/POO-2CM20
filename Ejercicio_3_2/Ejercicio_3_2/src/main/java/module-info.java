module com.diaasap.ejercicio_3_2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.diaasap.ejercicio_3_2 to javafx.fxml;
    exports com.diaasap.ejercicio_3_2;
}

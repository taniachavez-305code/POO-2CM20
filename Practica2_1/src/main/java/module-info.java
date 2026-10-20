module com.chaveztr.practica2_1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.chaveztr.practica2_1 to javafx.fxml;
    exports com.chaveztr.practica2_1;
}

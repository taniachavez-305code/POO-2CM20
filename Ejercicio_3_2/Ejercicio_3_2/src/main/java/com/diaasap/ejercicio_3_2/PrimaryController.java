package com.diaasap.ejercicio_3_2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController {

    @FXML private Button btnIniciar;
    @FXML private Label lblLiebre;
    @FXML private ProgressBar progressBarLiebre;
    @FXML private Label lblTortuga;
    @FXML private ProgressBar progressBarTortuga;

    @FXML
    private void btnIniciar_click() {
        btnIniciar.setDisable(true);
        progressBarLiebre.setProgress(0.0);
        progressBarTortuga.setProgress(0.0);
        
        Corredor tortuga = new Tortuga(progressBarTortuga, lblTortuga);
        Corredor liebre = new Liebre(progressBarLiebre, lblLiebre);

        Thread t1 = new Thread(tortuga);
        Thread t2 = new Thread(liebre);

        t1.start();
        t2.start();
        
        
    }
}
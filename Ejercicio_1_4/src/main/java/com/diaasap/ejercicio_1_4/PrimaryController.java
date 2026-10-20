package com.diaasap.ejercicio_1_4;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField txtNumero;
    @FXML TextArea txtTabla;
    
    @FXML
    private void btnCalcular_click(){
        int numero = Integer.parseInt(txtNumero.getText());

        txtTabla.clear();

        for (int i = 1; i <= 10; i++) {
            txtTabla.appendText(numero + " x " + i + " = " + (numero * i) + "\n");
        }
    }
    
    @FXML
    private void btnLimpiar_click(){
        txtNumero.clear();
        txtTabla.clear();
        txtNumero.requestFocus();
    }
}
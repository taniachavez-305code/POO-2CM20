package com.chaveztr.ejercicio1_5;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtAlimentacion;

    @FXML
    private TextField txtRefrigerios;

    @FXML
    private TextField txtTransporte;

    @FXML
    private TextField txtTelefonia;

    @FXML
    private TextField txtOtros;

    @FXML
    private TextField txtTotal;

    @FXML
    private TextField txtGastoAlto;

    @FXML
    private void handleCalcularEstadisticas() {
        try {
           
            double alimentacion = doubleValue(txtAlimentacion.getText());
            double refrigerios = doubleValue(txtRefrigerios.getText());
            double transporte = doubleValue(txtTransporte.getText());
            double telefonia = doubleValue(txtTelefonia.getText());
            double otros = doubleValue(txtOtros.getText());

            double total = alimentacion + refrigerios + transporte + telefonia + otros;
            txtTotal.setText(String.format("%.2f", total));

            
            double max = alimentacion;
            String gastoAlto = "Alimentación";

            if (refrigerios > max) {
                max = refrigerios;
                gastoAlto = "Refrigerios";
            }
            if (transporte > max) {
                max = transporte;
                gastoAlto = "Transporte";
            }
            if (telefonia > max) {
                max = telefonia;
                gastoAlto = "Telefonía";
            }
            if (otros > max) {
                max = otros;
                gastoAlto = "Otros";
            }

            txtGastoAlto.setText(gastoAlto);

        } catch (NumberFormatException e) {
            
            txtTotal.setText("Error");
            txtGastoAlto.setText("Valores inválidos");
        }
    }

    @FXML
    private void handleLimpiar() {
        
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotal.clear();
        txtGastoAlto.clear();
        
        
        txtAlimentacion.requestFocus();
    }

   
    private double doubleValue(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0.0;
        }
        return Double.parseDouble(text.trim());
    }
}
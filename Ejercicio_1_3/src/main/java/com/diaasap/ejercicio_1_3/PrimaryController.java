package com.diaasap.ejercicio_1_3;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField txtNumero;
    @FXML TextField txtCantCifras;
    @FXML TextField txtSumaImpares;
    @FXML TextField txtSumaPares;
    @FXML TextField txtSumaTotal;
    @FXML TextField txtCifraMayor;
    @FXML TextField txtCifraMenor;
    @FXML TextArea txtDivisores;
     
    @FXML
    private void btnAnalizar_click(){
        String numeroStr = txtNumero.getText();
        int cantidadCifras = numeroStr.length();
        int sumaTotal = 0, sumaPares = 0, sumaImpares = 0;
        
        int cifraMayor = Character.getNumericValue(numeroStr.charAt(0));
        int cifraMenor = Character.getNumericValue(numeroStr.charAt(0));
        
        txtCantCifras.setText(String.valueOf(cantidadCifras));
        
        for (int i = 0; i < numeroStr.length(); i++) {
            char letra = numeroStr.charAt(i);
            int digito = Character.getNumericValue(letra);
            
            sumaTotal += digito;
            
            if (digito % 2 == 0){
                sumaPares += digito;
            } else {
                sumaImpares += digito;    
            }
            
            if (digito > cifraMayor){
                cifraMayor = digito;
            }
            
            if (digito < cifraMenor){
                cifraMenor = digito;
            }
        }
        
        txtSumaImpares.setText(String.valueOf(sumaImpares));
        txtSumaPares.setText(String.valueOf(sumaPares));
        txtSumaTotal.setText(String.valueOf(sumaTotal));
        txtCifraMayor.setText(String.valueOf(cifraMayor));
        txtCifraMenor.setText(String.valueOf(cifraMenor));
        
        txtDivisores.clear();
        int numero = Integer.parseInt(numeroStr);
        
        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                txtDivisores.appendText(i + "\n");    
            }
        }
    } 
        
    @FXML
    private void btnLimpiar_click(){
        txtNumero.clear();
        txtCantCifras.clear();
        txtSumaImpares.clear();
        txtSumaPares.clear();
        txtSumaTotal.clear();
        txtCifraMayor.clear();
        txtCifraMenor.clear();
        txtDivisores.clear();
        txtNumero.requestFocus();
    } 
} 
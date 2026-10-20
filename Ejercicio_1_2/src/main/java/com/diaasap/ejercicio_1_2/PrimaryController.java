package com.diaasap.ejercicio_1_2;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField txtDinero;
    @FXML TextArea txtDenominaciones;
    @FXML TextArea txtCantidades;
    
    
    @FXML
    private void btnDesglosar_click(){
       int dinero = Integer.parseInt(txtDinero.getText());
       
       txtDenominaciones.setText(
            "Billetes de $500\n" +
            "Billetes de $200\n" +
            "Billetes de $100\n" +
            "Billetes de $50\n" +
            "Billetes de $20\n" +
            "Monedas de $10\n" +
            "Monedas de $5\n" +
            "Monedas de $2\n" +
            "Monedas de $1"
        );
       
       int c500 = dinero / 500;
       dinero = dinero % 500;
       
       int c200 = dinero / 200;
       dinero = dinero % 200;
       
       int c100 = dinero / 100;
       dinero = dinero % 100;
       
       int c50 = dinero / 50;
       dinero = dinero % 50;
       
       int c20 = dinero / 20;
       dinero = dinero % 20;
       
       int c10 = dinero / 10;
       dinero = dinero % 10;
       
       int c5 = dinero / 5;
       dinero = dinero % 5;
       
       int c2 = dinero / 2;
       dinero = dinero % 2;
       
       int c1 = dinero / 1;
       dinero = dinero % 1;
       
       txtCantidades.setText(
               c500 + "\n" +
               c200 + "\n" +
               c100 + "\n" +
               c50 + "\n" +
               c20 + "\n" +
               c10 + "\n" +
               c5 + "\n" +
               c2 + "\n" +
               c1
       );   
    }
      @FXML 
      private void btnLimpiar_click() {
        txtDinero.setText("");
        txtDenominaciones.setText("");
        txtCantidades.setText("");
    }
}

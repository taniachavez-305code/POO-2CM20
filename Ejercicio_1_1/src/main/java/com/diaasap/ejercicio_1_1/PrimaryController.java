package com.diaasap.ejercicio_1_1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField txtAnioNacimiento;
    @FXML Label lblResultado;
    
    @FXML
    private void btnCalcular_click(){
       String[] AnioNacimiento = txtAnioNacimiento.getText().split("/");
       int anio = 2026, mes = 10, dia = 19;
       
       int anioNac = Integer.parseInt(AnioNacimiento[2]);
       int mesNac = Integer.parseInt(AnioNacimiento[1]);
       int diaNac = Integer.parseInt(AnioNacimiento[0]);
       
       int edadAnios = anio - anioNac;
       int edadMeses = mes - mesNac;
       
       if (mes < mesNac || (mes == mesNac && dia < diaNac)) {
           edadAnios--;
           edadMeses = edadMeses + 12;
       }
       
       lblResultado.setText("Tiene " + edadAnios + " años con " + edadMeses + " meses");
       
    }
    
      @FXML 
      private void btnLimpiar_click() {
        txtAnioNacimiento.setText("");
        lblResultado.setText("");
    }
}

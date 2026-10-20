package com.chaveztr.practica2_1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class PrimaryController implements Initializable {
    private Alumno a; 
    private Profesor p; 
    
    @FXML 
    private TextArea txtMostrar;
    
    @Override 
    public void initialize (URL url, ResourceBundle rb){
        a =  new Alumno (); 
        p = new Profesor (10008000);
        
        txtMostrar.setText("Se crea Alumno... /n" + a.toString() + "/n" + p.toString());
    }
    

}

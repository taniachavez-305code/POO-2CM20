package com.diaasap.ejercicio_3_1;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtContador;
    @FXML private ProgressBar progressBar;
    @FXML private Button btnEsperar;
    
    private Contador contador = new Contador();
    
    @FXML
    private void btnContar_click(){
        contador.incrementar(); 
        txtContador.setText(String.valueOf(contador.getValor()));
    }
    
    @FXML
    private void btnEsperar_click(){
        Thread Espera = new Thread(new Runnable(){
         @Override
         public void run(){
             Platform.runLater(new Runnable(){
            @Override
            public void run(){
            btnEsperar.setDisable(true);
         }
        });
             
    for (int i = 1; i <= 100; i++) {
         try { Thread.sleep(100);
         } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
           break;
         }
    final double progreso = i / 100.0;

    Platform.runLater(new Runnable(){
        @Override
        public void run(){
            progressBar.setProgress(progreso);
        }
     });
    }
    
    Platform.runLater(new Runnable(){
        @Override
        public void run(){
            btnEsperar.setDisable(false);
        }
    });
    }
 });
        Espera.start();
    }
}

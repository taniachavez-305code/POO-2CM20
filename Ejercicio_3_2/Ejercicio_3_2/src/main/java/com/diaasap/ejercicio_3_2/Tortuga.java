package com.diaasap.ejercicio_3_2;

import javafx.scene.control.Label;
import javafx.application.Platform;
import javafx.scene.control.ProgressBar;


public class Tortuga extends Corredor {
    public Tortuga(ProgressBar progressBar, Label labelStatus) {
        super("La Tortuga", progressBar, labelStatus);
    }

    @Override
    public void correr() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                labelStatus.setText(nombre + ": ¡Ya arrancó!");
            }
        });

     for (int i = 1; i <= 100; i++) {
          try {
            Thread.sleep(120);
     } catch (InterruptedException e) {
              e.printStackTrace();
     }

    final double avance = (double) i / 100.0;
        Platform.runLater(new Runnable() {
            @Override
                public void run() {
                    progressBar.setProgress(avance);
                }
            });
        }

    Platform.runLater(new Runnable() {
        @Override
            public void run() {
                labelStatus.setText(nombre + ": ¡Llegó a la meta!");
            }
        });
    }
}


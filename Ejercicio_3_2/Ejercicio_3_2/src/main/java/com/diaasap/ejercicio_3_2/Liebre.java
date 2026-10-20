package com.diaasap.ejercicio_3_2;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Liebre extends Corredor {

    public Liebre(ProgressBar progressBar, Label labelStatus) {
        super("La Liebre", progressBar, labelStatus);
    }

    @Override
    public void correr() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                labelStatus.setText(nombre + ": Salió corriendo recio");
            }
        });

       
        for (int i = 1; i <= 50; i++) {
            try {
                Thread.sleep(40); 
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
                labelStatus.setText(nombre + ": Zzz... Se quedó dormida");
            }
        });

        try {
            Thread.sleep(4500); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                labelStatus.setText(nombre + ": ¡Despertó y va corriendo!");
            }
        });

        
        for (int i = 51; i <= 100; i++) {
            try {
                Thread.sleep(50);
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
                labelStatus.setText(nombre + ": Llegó a la meta");
            }
        });
    }
}
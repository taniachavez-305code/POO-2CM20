package com.diaasap.ejercicio_3_2;

import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public abstract class Corredor implements Runnable {
    protected String nombre;
    protected ProgressBar progressBar;
    protected Label labelStatus;
    
    public Corredor(String nombre, ProgressBar progressBar, Label labelStatus){
        this.nombre = nombre;
        this.progressBar = progressBar;
        this.labelStatus = labelStatus;
    }
    
    public abstract void correr();
    
    @Override
    public void run(){
        correr();
    }
}

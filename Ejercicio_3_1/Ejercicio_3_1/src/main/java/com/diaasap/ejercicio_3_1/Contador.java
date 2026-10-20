package com.diaasap.ejercicio_3_1;

public class Contador {
    private int valor;
    
    public Contador(){
        this.valor = 0;    
    }
    
    public void incrementar(){
        this.valor++;
    }
    
    public int getValor(){
        return valor;
    }
    
    public void reiniciar(){
        this.valor = 0;
    }
}

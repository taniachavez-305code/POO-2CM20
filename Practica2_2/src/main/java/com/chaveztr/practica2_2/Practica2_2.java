package com.chaveztr.practica2_2;

public class Practica2_2 {

    public static void main(String[] args) {
       Figura2D f = new TrianguloRect(4,3); 
       System.out.println(f.imprimeFigura()); 
       f = new Circulo(3);
       System.out.println(f.imprimeFigura());
    }
}

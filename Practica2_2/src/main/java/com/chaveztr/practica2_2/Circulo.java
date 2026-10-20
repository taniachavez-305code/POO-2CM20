
package com.chaveztr.practica2_2;
public class Circulo extends FiguraCircular{

    public Circulo(int radio) {
        this.radio = radio; 
    }
    
    @Override
    public String imprimeFigura() {
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;
        
        return "Se imprime una FiguraPlana...\n" +
               "Se imprime un Circulo con radio: " + radio + 
               ", area: " + String.format("%.2f", area) + 
               ", perimetro: " + String.format("%.2f", perimetro);
    }
}


package com.chaveztr.practica2_2;
public class TrianguloRect extends FiguraRecta {

    public TrianguloRect(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public String imprimeFigura(){
        double area = (ancho * alto) / 2.0; 
        double perimetro = ancho + alto + Math.sqrt(Math.pow(ancho, 2) + Math.pow(alto, 2));
        
        return """
               Se imprime una FiguraPlana...
               Se imprime un Triangulo con alto: """ + alto + ", ancho: " + ancho + 
               ", area: " + String.format("%.2f", area) + 
               ", perimetro: " + String.format("%.2f", perimetro);
    }
   
}

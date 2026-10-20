
package com.chaveztr.practica2_1;
public class Profesor extends Persona {
    protected int numEmpleados; 

    public Profesor(int numEmpleados) {
        super();
        this.numEmpleados = numEmpleados;
    }

    @Override
    public String toString() {
        return "Un profesor de edad " + this.edad 
                + ", con clave " + this.numEmpleados;
    }
}

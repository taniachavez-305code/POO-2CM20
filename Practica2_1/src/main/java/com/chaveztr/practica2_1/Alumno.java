
package com.chaveztr.practica2_1;
public class Alumno extends Persona{

    public Alumno() {
        super ();
    }
    
   @Override
  public String toString (){
      return "Un alumno llamado: " + this.nombre;
  }
}

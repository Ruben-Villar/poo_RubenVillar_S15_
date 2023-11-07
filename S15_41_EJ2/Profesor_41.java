/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S15_41_EJ2;

/**
 *
 * @author PCC08
 */
public class Profesor_41 {
    //5 Atributos
    String carrera;
    String Apellidos;
    String Nombre;
    int edad;
    int tiempoenseñanza;
    
    
    
       
    public void car(){
        System.out.println("Mi carrera es : "+ carrera);
    }
    public void caracteristica(){
        System.out.println("Mi apellido es: "+ Apellidos);
    }
    public void profname(){
        System.out.println("Mi nombres es: "+ Nombre);
    }
     public void año(){
         System.out.println("Mi edad es: "+ edad);
    }
     public void enseñanza(){
         System.out.println("Llevo los siguientes años enseñando: "+ tiempoenseñanza);
    }
    
}

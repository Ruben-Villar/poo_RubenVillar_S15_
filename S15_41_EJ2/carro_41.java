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
public class carro_41 {
    //5 Atributos
    
    String marca;
    double recorrido;
    String color;
    String residencia;
    int añovida;
    
    public void caracteristica(){
        System.out.println("Mi auto es de marca: "+ marca);
    }
    public void conducir(){
        System.out.println("Lleva recorriendo los siguientes kilometros : "+ recorrido);
    }
    public void colorauto(){
        System.out.println("Es del color: "+ color);
    }
     public void vivienda(){
         System.out.println("El auto viene desde: "+ residencia);
    }
     public void Tiempodura(){
         System.out.println("El tiempo de vida de mi auto es: "+ añovida+"años");
    }
    
}

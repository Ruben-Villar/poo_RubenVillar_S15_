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
public class fruta_41 {
    //5 Atributos
    String color;
    String sabor;
    String fruta;
    int unidades;
    double kilo;
    
    public void tipo(){
        System.out.println("La fruta nombrada es : " + fruta);
    }
    public void caracteristica(){
        System.out.println("Es de color: "+color);
    }
    public void Pesar(){
        System.out.println("La fruta: "+ fruta + "pesa: "+ kilo);
    }
     public void comer(){
         System.out.println("El sabor de la fruta es :"+ sabor);
    }
     public void unidad(){
         System.out.println("Tenemos como unidad de las frutas: " + unidades);
     }
}

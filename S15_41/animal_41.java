/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S15_41;

/**
 *
 * @author PCC08
 */
public class animal_41 {
     // 4 Atributos
    int AñodeVida;
    String raza;
    String color;
    String comida;
    
    public void ladrar(){
        System.out.println("Tengo: "+ AñodeVida);
    }
    public void correr(){
        System.out.println("Soy de raza: "+ raza);
    }
    public void saltar(){
        System.out.println("Tengo el color de : "+ color);
    }
    public void comer (){
        System.out.println("Me gusta comer: "+ comida);
    }
}

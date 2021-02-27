/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author dani
 */
public class MathTest {
    public static void main(String[] args) {
        
        System.out.println("Raíz cuadrada de 37: "+ Math.sqrt(37));
        System.out.println("Seno de 300: "+Math.sin(300)+" Coseno de 300: "+Math.cos(300));
        System.out.println("Floor of 22.8: "+Math.floor(22.8)+" Ceiling of 22.8: "+Math.ceil(22.8)+" Round of 22.8: "+Math.round(22.8));
        System.out.println("The larger: "+Math.max((double)'D', 71)+" The smaller: "+Math.min((double)'D', 71));
        System.out.println("Number: "+(Math.random() * (20 - 0) + 0));
    }
    
}

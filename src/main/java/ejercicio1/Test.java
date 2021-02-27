/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author dani
 */
public class Test {
    public static void main(String[] args) {
        FormLetterWriter saludos = new FormLetterWriter();
        
        saludos.displaySalutation("Valdez");
        System.out.println("");
        saludos.displaySalutation("Daniel", "Valdez");
    }
    
}

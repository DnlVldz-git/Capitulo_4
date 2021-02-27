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
public class FormLetterWriter {
    
    public void displaySalutation(String last_name){
        System.out.println("Dear Mr. or Ms. "+last_name);
        System.out.println("Thank you for your recent order.");
    }
    
    public void displaySalutation(String first_name, String last_name){
        System.out.println("Dear "+first_name+" "+last_name+"\nThank you for your recent order.");
    }
    
    
}

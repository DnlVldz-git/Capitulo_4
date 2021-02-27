/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author dani
 */
public class Test {
    public static void main(String[] args) {
        
        Billing test = new Billing();
        
        System.out.println("Test 1: "+test.computeBill(100));
        System.out.println("Test 2: "+test.computeBill(100, 2));
        System.out.println("Test 3: "+test.computeBill(100, 2, 20));
        
    }
}

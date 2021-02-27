/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author dani
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle ci1 = new Circle();
        
        ci1.setRadio(10);
        
        System.out.println("Area: "+ci1.getArea()+"\nDiámetro: "+ci1.getDiameter()+"\nRadio: "+ci1.getRadio());
        
        
    }
    
}

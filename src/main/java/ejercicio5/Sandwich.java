/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author dani
 */
public class Sandwich {
    private Bread bread;
    private SandwichFilling filling;
    
    Sandwich(String b_type, double cpsb, String f_type, double cpsf){
        this.bread = new Bread(b_type, cpsb);
        this.filling = new SandwichFilling(f_type, cpsf);
    }

    @Override
    public String toString() {
        return "Sandwich{" + "bread=" + bread + ", filling=" + filling + '}' + "Total calories: " + (bread.getCps()+filling.getCps());
    }
    
    
    
}

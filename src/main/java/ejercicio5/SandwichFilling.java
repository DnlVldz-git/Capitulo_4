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
public class SandwichFilling {
    private String filling_type;
    private double cps;
    
    SandwichFilling(String filling, double cps){
        this.filling_type = filling;
        this.cps = cps;
    }

    public String getFilling_type() {
        return filling_type;
    }

    public void setFilling_type(String filling_type) {
        this.filling_type = filling_type;
    }

    public double getCps() {
        return cps;
    }

    public void setCps(double cps) {
        this.cps = cps;
    }

    @Override
    public String toString() {
        return "SandwichFilling{" + "filling_type=" + filling_type + ", cps=" + cps + '}';
    }
    
    
    
    
}

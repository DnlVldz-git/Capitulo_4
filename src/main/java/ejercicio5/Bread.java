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
public class Bread {
    
    private String type_b;
    private double cps;
    public final static String MOTTO = "The staff of life";;
    
    Bread(String type_b, double cps){
        this.type_b = type_b;
        this.cps = cps;        
    }

    public String getType_b() {
        return type_b;
    }

    public void setType_b(String type_b) {
        this.type_b = type_b;
    }

    public double getCps() {
        return cps;
    }

    public void setCps(double cps) {
        this.cps = cps;
    }

    @Override
    public String toString() {
        return "Bread{" + "type_b=" + type_b + ", cps=" + cps + '}';
    }
    
    
    
}

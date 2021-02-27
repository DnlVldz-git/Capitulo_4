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
public class Billing {
    
    public double computeBill(double price){
        return (price+price*.08);        
    }
    
    public double computeBill(double price, int quantity){
        return ((price*quantity)+(price*quantity)*.08);
    }
    
    public double computeBill(double price, int quantity, double coupon){
        return (((price*quantity)-coupon)+(price*quantity-(coupon))*.08);
    }
}

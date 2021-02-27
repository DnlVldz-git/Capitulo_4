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
public class Circle {
    private double radio;
    private double diameter;
    private double area;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
        this.diameter = radio*2;
        this.area = Math.PI*Math.pow(radio, 2);
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
    
    
    
    
}

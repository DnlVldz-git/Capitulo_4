/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author dani
 */
public class BloodData {
    private BloodType blood_type;
    private char factor;
    
    BloodData(){
        this.blood_type = BloodType.O;
        this.factor = '+';
    }
    
    BloodData(BloodType blood_type, char factor){
        this.blood_type = blood_type;
        this.factor = factor;
    }

    public BloodType getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(BloodType blood_type) {
        this.blood_type = blood_type;
    }

    public char getFactor() {
        return factor;
    }

    public void setFactor(char factor) {
        this.factor = factor;
    }

    @Override
    public String toString() {
        return "BloodData{" + "blood_type=" + blood_type + ", factor=" + factor + '}';
    }
    
    
    
}

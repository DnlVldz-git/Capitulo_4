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
public class Patient {
    private String id;
    private int age;
    private BloodData blood_d = new BloodData();
    
    Patient(){
        this.id = "0";
        this.age = 0;        
    }
    
    Patient(String id, int age, BloodData blood_d){
        this.id = id;
        this.age = age;
        this.blood_d = blood_d;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BloodData getBlood_d() {
        return blood_d;
    }

    public void setBlood_d(BloodData blood_d) {
        this.blood_d = blood_d;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", age=" + age + ", blood_d=" + blood_d + '}';
    }
    
    
    
    
}

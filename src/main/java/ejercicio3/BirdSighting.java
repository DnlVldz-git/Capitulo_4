/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author dani
 */
public class BirdSighting {
    private String specie;
    private int n_seen;
    private int d_year;

    BirdSighting(){
        this.specie = "Robin";
        this.n_seen = 1;
        this.d_year = 1;
    }
    
    BirdSighting(String specie, int n_seen, int d_year){
        this.specie = specie;
        this.n_seen = n_seen;
        this.d_year = d_year;
    }
    
    public String getSpecie() {
        return specie;
    }

    public String toString(){
        return ("Specie: "+this.specie+"\nNumber seen: "+this.n_seen+"\nDay of the year: "+this.d_year);
    }
    
    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getN_seen() {
        return n_seen;
    }

    public void setN_seen(int n_seen) {
        this.n_seen = n_seen;
    }

    public int getD_year() {
        return d_year;
    }

    public void setD_year(int d_year) {
        this.d_year = d_year;
    }
    
    
    
    
    
}

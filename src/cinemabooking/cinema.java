/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemabooking;

/**
 *
 * @author Sewa
 */
public class cinema {
      String namehall;
    hall hallLocate;
    public cinema(String namnehall , hall hallLocate){
        this.namehall=namehall;
        this.hallLocate=hallLocate;
        
    }
    public String getLocate(){
        return hallLocate.Locate;
    }
     public static void main(String[] args) {
         hall Locate = new hall("hall of flim action",2);
         cinema c = new cinema("bulding b ", Locate);
         System.out.println(c.hallLocate+c.getLocate());
}}


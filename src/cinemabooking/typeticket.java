/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemabooking;


public class typeticket implements type {

    @Override
    public void silver(String a) {
        System.out.println("ticket silver seat in row 200");
    }

    @Override
    public void gold(String b) {
        System.out.println("tickt gold seat in row100");
    }

    @Override
    public void vip(String v) {
        System.out.println("ticket vip seat in first row");
    }

    @Override
    public void show() {
        System.out.println("");
    }
   
}

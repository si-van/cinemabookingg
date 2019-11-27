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
public class  ComingSoon extends Movie{
    
    public String NewFlim;
    public String DayStart;
    
    public String nametitle="action";
   
    
    @Override
    public void printtitle(){
        System.out.println("Hall of action flim");
        super.printtitle();
       
    }
   
    @Override
    public void newtrailer(){
        System.out.println("new trailer in oct");
    
    
    }
   
    

    public String getNewFlim(){
        return NewFlim;
    }
    public String getDayStart(){
        return DayStart;
    }
    public void setNewFlim(String newNewFlim){
        this.NewFlim=newNewFlim;
    }
    public void setDayStart(String newDayStart){
        this.DayStart=newDayStart;
    }}

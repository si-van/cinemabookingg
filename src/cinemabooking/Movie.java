/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemabooking;


public class Movie {
    
    public String title;
    public String titleflim="romantic";
    public void printtitle(){
        System.out.println("Hall of romantic flim");
    }
    public void newtrailer(){
        System.out.println("new trailer poste in oct");
    }
   
    
    public String gettitle(){
        return title;
    }
  
    public void settitle(String newtitle){
        title=newtitle;
       
        this.title= newtitle;
    }
}

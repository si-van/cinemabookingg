
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

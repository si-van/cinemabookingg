
package cinemabooking;

public class ComingSoon extends Movie{
    
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
    }
}

 
package cinemabooking;
public class CinamaBooking {
    
  public String flimName;// nawe flim
  public  String timeFlim;//katy flim
   public int price;//paraba
   private int numberSeat;//raqami kurse 
   private int numberphone;
    
    public String getflimName(){
        return flimName;
    }
    public String gettimeFlim(){
        return timeFlim;
    }
    public int getprice(){
        return price;
    }
  
    public int getnumberSeat(){
        return numberSeat;
    }
    public int getnumberphone(){
    return  numberphone;}
    
    public void setflimName(String newflimName){
        flimName=newflimName;
    }
    public void settimeFlim(String newtimeFlim){
        timeFlim=newtimeFlim;
    }
    public void setprice(int newprice){
        price=newprice;
    }
  
    public void setnumberSeat(int newnumberSeat){
        numberSeat=newnumberSeat;  
}
    public void setnumbephone(int newnumberphone){
        numberphone=newnumberphone;
    }
   
    
}

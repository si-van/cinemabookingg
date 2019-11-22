
package cinemabooking;


public class NowShowing extends Movie {
   
    public String nowshowing;
    public String endShowing;
    
    
    public String getnowShowing(){
        return nowshowing;
    }
    public String getendShowing(){
        return endShowing;
    }
   
    public void setnowshowing(String nowshowing){
        this.nowshowing=nowshowing;
    }
    public void setendShowing(String endShowing){
       this.endShowing=endShowing;
    }
}

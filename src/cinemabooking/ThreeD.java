
package cinemabooking;


public class ThreeD extends Movie {
    String threeDflimname;
    String StartDate;
    String endDate;
    public String getthreeDflimname(){
        return threeDflimname;
    }
    public String getStartDate(){
        return StartDate;
    }
    public String getendDate(){
        return endDate;
    }
    public void setthreeDflimname(String threeD){
        this.threeDflimname=threeD;
    }
    public void setStartDate(String startdate){
        this.StartDate=startdate;
    }
    public void setendDate(String endDate){
        this.endDate=endDate;
    }
    
}

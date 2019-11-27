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

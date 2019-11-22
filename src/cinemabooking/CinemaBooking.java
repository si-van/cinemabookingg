
package cinemabooking;

public class CinemaBooking {
   

    
    public static void main(String[] args) {
           typeticket m= new typeticket();
            m.silver("seat in row 200");
             m.gold("seat in row 100");
               m.vip("seat in first row");
        

//override

        Movie s =new ComingSoon();
        s.newtrailer();
        
        //////////////////////
       Movie obj = new Movie();
        obj.settitle("action");
        /////////////////////////////
        //superkeyword
        ComingSoon o= new ComingSoon();
       o.printtitle();
       o.setNewFlim("HappyNewYear");
       o.setDayStart("31/12/2020");
        
        /////////////////////////
       NowShowing ob=new NowShowing();
       ob.setnowshowing("suicide squad available");
       ob.setendShowing("23/12/2021");
       /////////////////////////////////
       
       ThreeD oo=new ThreeD();
       oo.setthreeDflimname("avatar");
       oo.setStartDate("23/11/2021");
       oo.setendDate("12/12/2022");
       
       CinamaBooking person=new CinamaBooking();
       person.setflimName("suicide squad");
       person.settimeFlim("10:45 pm");
       person.setprice(10);
       person.setnumbephone(504);
       person.setnumberSeat(112);
        
       System.out.println("name of flim: " + person.getflimName());
       System.out.println("time of flim: " + person.gettimeFlim());
       System.out.println("price: " + person.getprice());
       System.out.println("number phone: "+ person.getnumberphone());
       System.out.println("number of seat: " + person.getnumberSeat());
       System.out.println("title of Flim"+ obj.gettitle());
         System.out.println("NowShowing"+ ob.getnowShowing());
         System.out.println("endShowing"+ob.getendShowing());
         System.out.println("comingSoon"+o.getNewFlim());
         System.out.println("start in:"+o.getDayStart());
         System.out.println("3DFlim:"+oo.getthreeDflimname());
         System.out.println("start in:"+oo.getStartDate());
         System.out.println("end on:"+oo.getendDate());
         
    
    }
}

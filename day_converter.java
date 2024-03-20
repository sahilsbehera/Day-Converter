import java.util.Scanner;
public class day_converter {
    public static void main(String args[]){
     int days,years,months,weeks;
     days=1079;
     System.out.println(" ");
     System.out.println("EXAMPLE");
     System.out.println("Days = ----" +days+"----");
     years=days/365;
     days=days%365;
     months=days/30;
     days=days%30;
     weeks=days/7;
     days=days%7;
     System.out.println(" ");
     System.out.println(" Years = "+years);
     System.out.println(" Months = "+months);
     System.out.println(" Weeks = "+weeks);
     System.out.println(" Days = "+days);




     System.out.println("");
     int day,year,month,week;
     Scanner myobj = new Scanner(System.in);
     System.out.println("Enter the number of Days");
     day=myobj.nextInt();
     System.out.println("Days = ----" +day+"----");
     year=day/365;
     day=day%365;
     month=day/30;
     day=day%30;
     week=day/7;
     day=day%7;
     System.out.println(" ");
     System.out.println(" Years = "+year);
     System.out.println(" Months = "+month);
     System.out.println(" Weeks = "+week);
     System.out.println(" Days = "+day);
     System.out.println(" ");
     System.out.println("Over and Out");



    }
}

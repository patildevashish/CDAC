package method_overloading;

import java.util.Scanner;

public class RouteFinder 
{
    void route(String src, String via, String dest)
    {
        System.out.println("Moving from "+src+" to "+dest+" via "+via);
    }
    
    void route(String src, String dest){
        System.out.println("Moving from "+src+" to "+dest);
    }
    
    void route(String dest){
        System.out.println("Moving to "+dest);
    }
    
     public static void main (String a[])
     {
         RouteFinder rf = new RouteFinder();
         System.out.println("Please Enter....");
         System.out.println("1. Destination only.");
         System.out.println("2. For source and destination");
         System.out.println("3. For source, via and destination");
         
         Scanner sc = new Scanner(System.in);
         Scanner sc1 = new Scanner(System.in);
         
         int choice=sc1.nextInt();
         switch (choice) {
             case 1 -> {
                 System.out.println("Enter Destination");
                 String d = sc.nextLine();
                 rf.route(d);
             }
             case 2 -> {
                 System.out.println("Enter source and destinatio");
                 String s = sc.nextLine();
                 String d = sc.nextLine();
                 rf.route(s, d);
             }
             case 3 -> {
                 System.out.println("Enter source, via and destination");
                 String s = sc.nextLine();
                 String v = sc.nextLine();
                 String d = sc.nextLine();
                 rf.route(s, v, d);
             }
             default -> System.err.println("Enter correct chocie");
         }
     }
}

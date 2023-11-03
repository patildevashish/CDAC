
package Assignment1;

import java.util.Scanner;

class StudInfo_Q2 {
   
    void getData(){
        System.out.println("Enter Student Information:");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Student name and student class1");
        String name1 = sc.next();
        String Class1 = sc.next();
        System.out.println("Student name="+name1+"  Class="+Class1);
    }
}
class Marks extends StudInfo_Q2  {
   
  void get_marks(){
      System.out.println("Enter  student marks:");
        Scanner sc1=new Scanner(System.in);
      int m1=sc1.nextInt();
      int m2=sc1.nextInt();
      int m3=sc1.nextInt();
      int m4=sc1.nextInt();
      int m5=sc1.nextInt();
     
     float total;
     total=m1+m2+m3+m4+m5;
     float percentage;
     percentage=(total/250)*100;
     String s = String.format("%.2f",percentage);
     
      System.out.println("percentage="+s);
     
    }
}

public class Que2 {
    public static void main(String[] args) {
        Marks m1=new Marks();
        m1.getData();
        m1.get_marks();
        Marks m2=new Marks();
        m2.getData();
        m2.get_marks();
        Marks m3=new Marks();
        m3.getData();
        m3.get_marks();
    }
}
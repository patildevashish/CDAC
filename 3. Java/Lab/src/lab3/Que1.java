
package lab3;

import java.util.Scanner;

class Student{
    String s;
    int a,b,c,d,e;
    float per;
    float total;
    Scanner sc = new Scanner(System.in);
    void info(){
        
        System.out.println("Enter name of the student");
        s = sc.nextLine();
    }
    void marks(){
        System.out.println("Enter marks for five subjects: ");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        d= sc.nextInt();
        e= sc.nextInt();
        total = (a+b+c+d+e);
        per = (total/250)*100;
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+per);
    }
    void percentage(){
        
        
        if (per>=90) {
            System.out.println("Grade: A+");
        } 
        else if(per>80&&per<89) {
            System.out.println("Grade: A");
        }
        else if (per>70&&per<79) {
            System.out.println("Grade: B+");
        }
        else if (per>60&&per<69) {
            System.out.println("Grade: B");
        }
        else if (per>50&&per<59) {
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println(per);
    }
}
public class Que1 {
    public static void main(String[] args) {
        Student z = new Student();
        z.info();
        z.marks();
        System.out.println("Student name: "+z.s);
//        System.out.println("Marks scored: "+z.a+z.b+z.c+z.d+z.e);
        z.percentage();
    }
}

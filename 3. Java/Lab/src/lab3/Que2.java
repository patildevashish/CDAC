/*
 WAP in Java to check whether a number is divisible according to 
the following conditions.
1. no is divisible by 8 & 5;
2.no is divisible by 8;
3.no is divisible by 5;
4.no is divisible neither by 8 nor by 5;
 */
package lab3;

import java.util.Scanner;

class Conditions{
    int a;
    Scanner sc = new Scanner(System.in);
    
    void input(){
        System.out.println("Enter any number: ");
        a =sc.nextInt();
    }
    
    void check(){
        if (a%5==0 && a%8==0) {
            System.out.println(a+" is divided by 5 and 8");
        } 
        else if (a%5==0) {
            System.out.println(a+" is divided by 5");
        }
        else if (a%8==0) {
            System.out.println(a+ " is divided by 8");
        }
        else{
            System.out.println(a+ " is neither divided by 8 or by 5");
        }
    }
}

public class Que2 {
    public static void main(String[] args) {
        Conditions c = new Conditions();
        c.input();
        c.check();
    }
}

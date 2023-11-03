/*WAP in Java to check whether a number is divisible according to the following conditions.
1. no is divisible by 8 & 5;
2.no is divisible by 8;
3.no is divisible by 5;
4.no is divisible neither by 8 nor by 5;*/

import java.util.Scanner;

public class Div {
    int a;
    Scanner sc = new Scanner(System.in);
    
    void input()
    {
        System.out.println("Enter any number");
        a = sc.nextInt();
    }

    void div()
    {
        if (a%8==0 && a%5==0 ) 
        {
            System.out.println(a+" is divisible by 8 and 5");
        }

        else if (a%8==0) 
        {
            System.out.println(a+" is only divisible by 8"); 
        }

        else if (a%5==0) 
        {
            System.out.println(a+" is only divisible by 5");    
        }

        else
        {
            System.out.println(a+" is neither divided by 5 nor by 8");
        }
    }

    public static void main(String d[])
    {
        Div s = new Div();
        s.input();
        s.div();
    }
}

// write a program in java to find greater number between two numbers using if else loop
import java.util.Scanner;

class Else {
    int a,b;
        void input()
        {
            System.out.println("Enter any two numbers: ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
        }
        void output()
        {
            if (a>b) 
            {
                System.out.println(a+" is greater than"+b);
            } 
            else if( a==b)
            {
                System.out.println(a+"is equal to"+b);
            }
            else{
                System.out.println(b+"is greater than"+a);
            }
        }
    public static void main(String ar[])
    {
        Else f = new Else();
        f.input();
        f.output();
    }
}

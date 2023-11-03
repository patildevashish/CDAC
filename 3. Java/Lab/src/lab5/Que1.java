//1.Write a program in java which shows no argument constructor.

package lab5;

import java.util.Scanner;

class Test{
    int l,b,peri;
    void Test(){
        System.out.println("Enter length and breath of rectangle");
        Scanner sc = new Scanner(System.in);
        l =sc.nextInt();
        b = sc.nextInt();
        peri = 2*(l+b);
        System.out.println("Perimeter is: "+peri);
    }
}

public class Que1 {

    public static void main(String[] args) {
        Test t = new Test();
        t.Test();
    }
    
}


package constructor;

import java.util.Scanner;

class Calculate {
    int l,b;
    int area;
    public Calculate(int l, int b){
        area = l*b;  
    }
    public Calculate (int a){
         area = a*a; 
    }
}
public class Area{
    public static void main(String[] args) {
        
        System.out.println("Enter length and breath of rectangle: ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        Calculate c = new Calculate(l,b);
        System.out.println("Area of Rectangle: "+c.area);
        
        
        System.out.println("Enter side: ");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        Calculate c1 = new Calculate(a);
        System.out.println("Area of square: "+c1.area);
    }
}

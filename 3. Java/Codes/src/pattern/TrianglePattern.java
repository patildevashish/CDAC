package pattern;

import java.util.Scanner;

public class TrianglePattern 
{
    void equilateralTriangle()
    {
        for (int i = 0; i < 5; i++)     //rows
        {
            for (int j = 4; j > i; j--) 
            {
                System.out.print(" ");  
            }
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("* "); 
            }
            System.out.println("");
        }
    }
    void dynamicEquiTrig()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of patter: ");
        int size=sc.nextInt();
        for (int i = 0; i < size; i++)     //rows
        {
            for (int j = size-1; j > i; j--) 
            {
                System.out.print(" ");  
            }
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("* "); 
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) 
    {
        TrianglePattern t = new TrianglePattern();
        t.equilateralTriangle();
        t.dynamicEquiTrig();
    }
}

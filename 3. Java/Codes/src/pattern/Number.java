
import java.util.Scanner;


public class Number 
{
    void eqNoTri()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) 
        {
            for (int j = size-1; j > i; j--) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) 
            {
                System.out.print(" "+j);
            }
            System.out.println(" ");
        }
    }
    
    public static void main(String[] args) 
    {
        Number n = new Number();
        n.eqNoTri();
    }
}

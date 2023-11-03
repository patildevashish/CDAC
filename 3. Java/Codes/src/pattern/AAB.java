
import java.util.Scanner;


public class AAB 
{
    void aab()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int size = sc.nextInt();
        System.out.println("Enter the alphabet");
        char s = sc.next().charAt(0);
        for (int i = 0; i < size; i++) 
        {
            for (int j = size; j > i; j--) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) 
            {
                System.out.print(" "+(char)(s+j));
            }
            
            System.out.println(" ");
        }
    }
    
    public static void main(String[] args) {
        AAB a = new AAB();
        a.aab();
    }
}

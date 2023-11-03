
package exception;
import java.util.Scanner;

public class VoterValidity {
    void checkvalidity()
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter u r age ");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("Congarats");
        }
        else
        {
            try{
            throw new InvalidEntryException("Bhai abhi tum chote hoo.....Politics se dur raho");  // obj of user defined
            }

        catch(Exception ie)
            {
                System.out.println(ie.getMessage());}
        }
    
    }

}
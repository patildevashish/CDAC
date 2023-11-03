
package lab14;

import java.util.Scanner;

public class Que2 {
    void check(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = s.nextInt();
        if (a>0) {
            System.out.println("Number is positive");
        }
        else{
            try{
                if (a==0) 
                {
                    throw new NegativeValueException("zero is neither +ve nor -ve");
                } 
                else {
                    throw new NegativeValueException("NegativeValueException");
                }
            }
            catch(NegativeValueException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        Que2 w = new Que2();
        w.check();
    }
    
}

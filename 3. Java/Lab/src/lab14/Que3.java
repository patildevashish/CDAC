
package lab14;

import java.util.Scanner;

public class Que3 {
    float ac_bal = (float) 70000.3;
    
    void display(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        int a = s.nextInt();
        if (a<=ac_bal) {
            System.out.println("Your money is debited...");
        } 
        else {
            try {
                throw new InsufficientFundException("Insufficient Fund");
            } 
            catch (InsufficientFundException e) {
                System.err.println(e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {
        Que3 r = new Que3();
        r.display();
    }
}


package Recursion;

public class Fact {

    public static int factorial(int i){
        if (i==0) {
            return 1;
        }
        return i*factorial(i-1);
        
    }
    public static void main(String[] args) {
        int res = factorial(5);
        System.out.println("Factorial is: "+res);
    }
}


package lab11;

import java.util.Scanner;

public class Validate {
    void Email(){
        System.out.println("**********************Email Validation************************");
        Scanner sc = new Scanner(System.in);
    
       String st = sc.next();
       String sp = "@.com";
      int one=st.lastIndexOf('@');
      int two=st.lastIndexOf('.');
      boolean three=st.contains(sp);
      int four=st.lastIndexOf("com");

      //System.out.println(three);
      if(two>one && four>0 )
      {
            System.out.println("Email is valid");
      }
      else
      
            System.out.println("Email is invalid");

    }
    public static void main(String[] args) {
        Validate v = new Validate();
        v.Email();
        
        
        
    }
}

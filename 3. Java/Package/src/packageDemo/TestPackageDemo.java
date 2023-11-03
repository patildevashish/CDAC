
package packageDemo;

import static java.lang.Math.*;
import static packageDemo.pack1.FirstDemo.*;
import packageDemo.pack2.SecondDemo;


public class TestPackageDemo {
    public static void main(String[] args) {
//        packageDemo.pack1.FirstDemo fd = new FirstDemo();
//        packageDemo.pack2.FirstDemo fd1 = new packageDemo.pack2.FirstDemo();
        
        //FirstDemo fd = new FirstDemo();
        SecondDemo fd1 = new SecondDemo();
        show();
        
        fd1.show1();
        System.out.println(sqrt(25));
    }
    
}

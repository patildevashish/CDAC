
package Generic;

import java.util.*;

public class GenericMethod {
//    //Normal Method
//    public static void showData(String arr[]){
//        for (String s : arr) {
//            System.out.println(s);
//        }
//    }
    /*
    //Generic Method
    public static<E> void showData(E arr[]){
        for (E s : arr) {
            System.out.println(s);
        }
    }
    */
    /*
    public static <E>void showData(List<E> lst){              //upper
        for (E s : lst) {
            System.out.println(s);
        }
    }
*/
    /*
    public static void showData(List<? extends Number> lst){              //upper
        for (Number s : lst) {
            System.out.println(s);
        }
    }
    */
    public static void showData(List<? super Integer> lst){              //Lower bond
        for (Object s : lst) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
//        String names[]={"Ramesh","Suresh","Dinesh","mahesh"};
//        Integer ages[]={23,24,25,35};
//        showData(names);
//        showData(ages);
        
//        List lst1 = List.of("Ramesh","Suresh","Dinesh","Mahesh");
        List<Integer> lst2 = List.of(23,24,25,35);
        List<Number> lst3 = List.of(23.4,24.6,25.99,35.45);
//        showData(lst1);
        showData(lst2);
        showData(lst3);
    }
}


package tp;

import java.util.Arrays;


public class Tp {

    public static void main(String[] args) {
        int a[] ={10,20,30,40};
        int b  =a.length;
        Arrays.sort(a);
        System.out.println("Sorting :"+Arrays.toString(a));
        int c = a[b-2];
        System.out.println("2nd largest: "+c);
    }
    
}

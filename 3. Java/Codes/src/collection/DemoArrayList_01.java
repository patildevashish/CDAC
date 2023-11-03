
package collection;

import java.util.*;

public class DemoArrayList_01 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(23);
        lst.add(12);
        lst.add(22);
        lst.add(14);
        lst.add(62);
        System.out.println(lst);
        
        System.out.println("**************************");
        
        Collections.sort(lst);
        int pos = Collections.binarySearch(lst, 10);
        System.out.println("Position: "+pos);
        
        System.out.println("**************************");
        
        boolean b = Collections.disjoint(lst, Arrays.asList(100,200,300));
        System.out.println(b);
        
        System.out.println("\n**************************\n");
        
        Collections.copy(lst, Arrays.asList(100,200,300));
        for (Integer i : lst) {
            System.out.println(i);
        }
        System.out.println("\n**************************\n");
        List<String> lst1 = Arrays.asList("Dindayal","Ramesh","Suresh","Dinesh","Bhavesh");
        Collections.sort(lst1);
        for (String s : lst1) {
            System.out.println(s);
        }
    }
}


package collection.set;

import java.util.*;

public class DemoSet {
    public static void main(String[] args) {
        System.out.println("\n************HashSet**************\n");
        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(30);
        st.add(20);
        st.add(70);
        for (Integer i : st) {
            System.out.println(i);
        }
        
        System.out.println("\n************LinkedHashSet**************\n");
        Set<Integer> ls = new LinkedHashSet<>();
        ls.add(10);
        ls.add(30);
        ls.add(20);
        ls.add(70);
        for (Integer l : ls) {
            System.out.println(l);
        }
        
        System.out.println("\n**************TreeSet**************\n");
        Set<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(70);
        for (Integer t : ts) {
            System.out.println(t);
        }
    }
}

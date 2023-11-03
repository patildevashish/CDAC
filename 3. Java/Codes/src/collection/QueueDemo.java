
package collection;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("Ramesh");
        q.add("Suresh");
        q.add("Mahesh");
        q.add("Dinesh");
        q.add("Bhavesh");
        System.out.println(q);
        
//        System.out.println("\n************Poll**************\n");
//        String p = q.poll();
//        System.out.println(p);
//        System.out.println(q);
        
        System.out.println("\n**************************\n");
        for (String s : q) {
            System.out.println(s);
        }
        
//        Queue<String> q1 = new ArrayDeque<>();
        
    }
}

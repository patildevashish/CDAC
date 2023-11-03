/*
Write a java program to Create a priority queue to insert elements with
different priorities.

 */
package lab_18;

import java.util.PriorityQueue;

public class Que4 {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("Devashish");
        q.add("Kshitij");
        q.add("Pallavi");
        q.add("Sangharsh");
        q.add("Pranav");
        
        for (String s : q) {
            System.out.println(s);
        }
    }
}


package collection.map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        System.out.println("\n**************HashMap**************\n");
        Map<Integer,String> mp = new HashMap<>();
        mp.put(105, "Ramesh");
        mp.put(102, "Suresh");
        mp.put(103, "Mahesh");
        mp.put(104, "Dinesh");
        mp.put(101, "Bhavesh");
        
        for (Integer i :mp.keySet() ) {
            String val = mp.get(i);
            System.out.println("Key: "+i+", Value: "+val+"ji");
        }
        
        System.out.println("\n**************LinkedHashMap**************\n");
        Map<Integer,String> lhp = new LinkedHashMap<>();
        lhp.put(105, "Ramesh");
        lhp.put(102, "Suresh");
        lhp.put(103, "Mahesh");
        lhp.put(104, "Dinesh");
        lhp.put(101, "Bhavesh");
        
        for (Integer i :lhp.keySet() ) {
            String val = lhp.get(i);
            System.out.println("Key: "+i+", Value: "+val+"ji");
        }
        
        System.out.println("\n**************TreeMap**************\n");
        Map<Integer,String> tm = new TreeMap<>();
        tm.put(105, "Ramesh");
        tm.put(102, "Suresh");
        tm.put(103, "Mahesh");
        tm.put(104, "Dinesh");
        tm.put(101, "Bhavesh");
        
        for (Integer i :tm.keySet() ) {
            String val = tm.get(i);
            System.out.println("Key: "+i+", Value: "+val+"ji");
        }
        for (String value : tm.values()) {
            System.out.println(value);
        }
    }
}

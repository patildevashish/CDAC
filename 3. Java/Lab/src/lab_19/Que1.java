/*
Write a java program to Create a HashMap called populationMap,
stores population data for several cities, retrieves and prints the population
of a specific city, iterates through the map to print all city populations,
removes a city from the map, and checks if a city exists in the map.

*/
package lab_19;

import java.util.*;

public class Que1 {
    public static void main(String[] args) {
        HashMap<Integer, String> populationMap = new HashMap<>();
        populationMap.put(235869, "Nagpur");
        populationMap.put(789456, "Mumbai");
        populationMap.put(654789, "Pune");
        populationMap.put(123456, "Goa");
        
        for (Integer i:populationMap.keySet()) {
            String st = populationMap.get(i);
            System.out.println("Population: "+i+", City: "+st);
        }
        System.out.println("\n*********************\n");
        populationMap.remove(235869);
        for (Integer i:populationMap.keySet()) {
            String st = populationMap.get(i);
            System.out.println("Population: "+i+", City: "+st);
        }
        
    }
}

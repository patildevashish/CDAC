
package lab_18;

import java.util.*;

public class EmployeeCollection {
    public static void main(String[] args) {
        ArrayList<Employee> s = new ArrayList<>();
        
        Employee e3 = new Employee(3, "Pranav", 400000);
        Employee e2 = new Employee(2, "Kshijij", 500000);
        Employee e1 = new Employee(1, "Devashish", 600000);
        Employee e4 = new Employee(4, "Pallavi", 300000);
        Employee e5 = new Employee(5, "Bhavesh", 200000);
        
        s.add(e1);
        s.add(e2);
        s.add(e3);
        s.add(e4);
        s.add(e5);
        
//        Collections.sort(s);
//        for (Employee e : s) {
//            System.out.println(e);
//        }
        System.out.println("\n*************With name*************\n");
        EmployeeSortByName esbn = new EmployeeSortByName();
        Collections.sort(s,esbn);
        for (Employee e : s) {
            System.out.println(e);
        }
        
        System.out.println("\n*************With Salary*************\n");
        EmployeeSortBySalary esbs = new EmployeeSortBySalary();
        Collections.sort(s, esbs);
        for (Employee employee : s) {
            System.out.println(employee);
        }
        
/*
Write a java program to find a name from a collection.
*/
        System.out.println("\n*************Find Name*************\n");
        List<String> strs=Arrays.asList("Ramesh","Suresh","Dinesh");
        int x=strs.indexOf("Suresh");
        System.out.println("The index is: "+x);
        System.out.println(strs.get(1));
        

    }
}


package collection;

import java.util.*;

public class StudentCollection {
    public static void main(String[] args) {
        Vector<Student> v  = new Vector<>();
        
        Student s1 = new Student(102,"Ramesh",23);
        Student s2 = new Student(101,"Bhavesh",28);
        Student s3 = new Student(105,"Suresh",25);
        Student s4 = new Student(103,"Mahesh",21);
        
        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);
        
        System.out.println("\n************Natural Sorting**************\n");
        Collections.sort(v);
        for (Student s : v) {
            System.out.println("ID: "+s.getId() +", Name: "+s.getName()+", Age: "+s.getAge());
        }
        
        System.out.println("\n************Sorting by Name**************\n");
        StudentSortingByName ssbn = new StudentSortingByName();
        Collections.sort(v,ssbn);
        for (Student s : v) {
            System.out.println("ID: "+s.getId() +", Name: "+s.getName()+", Age: "+s.getAge());
        }
        
        System.out.println("\n************Sorting by age**************\n");
        StudentSortingByAge ssba = new StudentSortingByAge();
        Collections.sort(v,ssba);
        for (Student s : v) {
            System.out.println("ID: "+s.getId() +", Name: "+s.getName()+", Age: "+s.getAge());
        }
        // OR
//        Iterator<Student> it = v.iterator();
//        while (it.hasNext()) {
//            Student s = it.next();
//          System.out.println("Name: "+s.getName()+", Age: "+s.getAge());
        
        
        
    }
}

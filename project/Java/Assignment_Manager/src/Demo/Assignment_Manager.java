
package Demo;

import java.util.*;

public class Assignment_Manager {
    public static void main(String[] args) {
        Vector<Student> vs = new Vector<>();
        
        Student s = new Student("Deva", 12);
        
        Vector<Trainer> vt = new Vector<>();
        
        Trainer t = new Trainer("zy");
        vs.add(s);
        vt.add(t);
        
        for (Student student : vs) {
            System.out.println(student);
        }
        for (Trainer trainer : vt) {
            System.out.println(trainer);
        }
    }
}

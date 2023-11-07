
package Demo;

import java.util.*;

public class Assignment_Manager {
    public static void main(String[] args) {
        Vector<Student> vs = new Vector<>();
        
        Student s = new Student("Deva", 12);
        vs.add(s);

        for (Student student : vs) {
            System.out.println(student);
        }
        
        Vector<Trainer> vt = new Vector<>();
        
        Trainer t = new Trainer("zy");
        t.toString();
        for (Trainer trainer : vt) {
            System.out.println(trainer);
        }
    }
}

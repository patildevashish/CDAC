
package Demo;

import java.util.Scanner;

public class Student {
    private String name;
    private int prnNo;
    Scanner sc = new Scanner(System.in);

    public Student(String name, int prnNo) {
        this.name = name;
        this.prnNo = prnNo;
    }
    
    

    public String getName() {
        return name;
    }

    public double getPrnNo() {
        return prnNo;
    }


    @Override
    public String toString() {
        System.out.println("Enter name of student");
        name = sc.nextLine();
        System.out.println("Enter prn number of student");
        prnNo = sc.nextInt();
        return "Student Name = " + name + "\nStudent prnNo = " + prnNo;
    }
    
    
}

package assignment_manager;

import java.text.SimpleDateFormat;
import java.util.*;

class Student{
    String name;
    Double prnNo;
    Scanner sc = new Scanner(System.in);

    
    public String info(){
        System.out.println("Enter the name of students");
        name = sc.next();
        System.out.println("Enter PRN NO of the student");
        prnNo = sc.nextDouble();
        return "name=" + name + ", prnNo=" + prnNo + ", sc=" + sc;
    }

    
}

class Trainer{
    String name;
    Scanner ds = new Scanner(System.in);


    public String display() {
        System.out.println("Enter name of the Trainer");
        name = ds.next();
        return "name=" + name + ", ds=" + ds;
    }
    
    
    
}

class Assignment{
    String Title;
    Date Date = new Date();
    String Description;
    String Assignee;
    
    Scanner ds = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Student s =new Student();
    
    @Override
    public String toString() {
        System.out.println("Title: ");
        Title = ds.next();
        
        System.out.println("Date: "+sdf.format(Date));
        
        System.out.println("Description: ");
        Description = ds.next();
        
        System.out.println("Assignee: "+s.name);   
        return "Title = " + Title + " \nDate=" + Date + " \nDescription=" + Description + "\nAssignee=" + Assignee;
    }
    
}
public class Assignment_Manager {
    Scanner sc = new Scanner(System.in);
    int c;
    
    void Functions(){
        System.out.println("1. Create an assignment");
        System.out.println("2. Add an assignment");
        System.out.println("3. Show assignments");
        System.out.println("4. Save assignments to file");
        System.out.println("5. Load assignments to file");
        c = sc.nextInt();
        System.out.println("Enter what you want to do :"+c);
        switch (c) {
            case 1 -> {
                System.out.println("CREATE AN ASSIGNMENT");
                Functions();
            }
            case 2 ->{
                System.out.println("ADD AN ASSIGNMENT\n");
                Functions();
            }
            case 3 ->{
                System.out.println("SHOW ASSIGNMENTS");
                Functions();
            }
            case 4->{
                System.out.println("SAVE ASSIGNMENT TO FILE");
                Functions();
            }
            case 5->{
                System.out.println("LOAD ASSIGNMENT TO FILE");
                Functions();
            }
            
            default -> {
                System.out.println("Enter Correct Number");
                Functions();
            }
        }
    }
    public static void main(String[] args) {
       Student s =new Student();
       s.info();
       Trainer t =new Trainer();
       t.display();
       Assignment a = new Assignment();
       a.toString();
       
       Assignment_Manager am = new Assignment_Manager();
       am.Functions();
    }
    
}

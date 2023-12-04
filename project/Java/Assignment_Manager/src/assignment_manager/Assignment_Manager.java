package assignment_manager;

import com.sun.source.tree.BreakTree;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.*;

class Student{
    private String name;
    private int prnNo;

    public Student(String name, int prnNo) {
        this.name = name;
        this.prnNo = prnNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getPrnNo() {
        return prnNo;
    }

    public void setPrnNo(int prnNo) {
        this.prnNo = prnNo;
    }

    public String toString() {
        return "\nStudent name = " + name + "\nStuddent prnNo = " + prnNo;
    }
}

class Trainer{
    private String name;

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Trainer name = " + name;
    }
}

class Assignment{
    private String title;
    private Date date;
    private String description;
    private Student assignee;
    private Trainer trainer;
    

    public Assignment(String title, Date date, String description, Student assignee, Trainer trainer) {
        this.title = title;
        this.date = date;
        this.description = description;
        this.assignee = assignee;
        this.trainer = trainer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student getAssignee() {
        return assignee;
    }

    public void setAssignee(Student assignee) {
        this.assignee = assignee;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "\nTitle = " + title + "\nDate = " + date + "\nDescription = " + description + "\nAssignee = " + assignee + "\nTrainer = " + trainer;
    }
}
public class Assignment_Manager {
    static Scanner sc =new Scanner(System.in);
    
    static List<Assignment> assig = new ArrayList<>();
    
    static Path path =Paths.get("D:\\Storage.txt");
    
    public static String createAssignment(){
        System.out.println("Enter the title of the assignment:");
        String title = sc.nextLine();
        
        System.out.println("Enter the description of the assignment:");
        String description = sc.nextLine();
        
        System.out.println("Enter the name of the student:");
        String studentName = sc.nextLine();
        
        System.out.println("Enter the PRN number of the student:");
        int prnNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the trainer:");
        String trainerName = sc.nextLine();
        
        Student student = new Student(studentName, prnNo);
        
        Trainer trainer = new Trainer(trainerName);
        
        Date d = new Date();
        SimpleDateFormat rtx = new SimpleDateFormat("dd-MMM-yyyy");
        String rtxDate = rtx.format(d);
        
        Assignment assignment = new Assignment(title, d, description, student, trainer);
        
        assig.add(assignment);
        System.out.println("Assignment created successfully!");
        
        String s = "\nTitle: "+title+"\nDescription: "+description+"\nStudent's Name: "+studentName+"\nStudent's prnNo: "+prnNo+"\nTrainer Name: "+trainerName+"\nDate: "+rtxDate+"\n" ;
        return s;
    }
    
    public static List showAssignments() {
        
        if (assig.isEmpty()) {
            System.out.println("No assignments found!");
        } else {

            System.out.println("\nThe assignments are:");
            for (Assignment a : assig) {
                System.out.println(a);
            }
        }
        return assig;
    }
    
    public static void saveAssignment(){
        /*
        List<Assignment> k = showAssignments();
        String z = k.toString();
        try {
            Path path =Paths.get("D:\\Study\\Cdac\\project\\Java\\Assignment_Manager\\Storage.txt");
            Files.write(path,z.getBytes(),StandardOpenOption.APPEND);
            System.out.println("Completed");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
        File file = new File("D:\\Study\\Cdac\\project\\Java\\Assignment_Manager\\Storage.txt");

        try (PrintWriter pw = new PrintWriter(file)) {
            for (Assignment a : assig) {
                pw.println(a);
            }
            System.out.println("Assignments saved to the file!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
    public static void loadAssignment(){
        try{
        Path path =Paths.get("D:\\Study\\Cdac\\project\\Java\\Assignment_Manager\\Storage.txt");
        List<String> lst=Files.readAllLines(path);
        for(String str:lst){
            System.out.println(str);
        }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to the Assignment Manager!");
        System.out.println("Please choose an option:");
        System.out.println("1. Create an assignment");
        System.out.println("2. Show the assignments");
        System.out.println("3. Save the assignments to a file");
        System.out.println("4. Load the assignments from a file");
        System.out.println("5. Exit");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1 -> {
                createAssignment();
                main(args);
            }
            case 2 ->{
                showAssignments();
                main(args);
            }
            case 3 ->{
                saveAssignment();
                main(args);
            }
            case 4 ->{
                loadAssignment();
                main(args);
            }

            case 5 ->{
                System.out.println("Really want to exit?    [y/n]");
                String c = sc.next();
                String y = "y";
                String n = "n";
                    if (c.equals(y)) {
                        System.out.println("Thank you");
                         break;
                    }
                    else if ("n".equals(c)) {
                        main(args);
                    }
                    else{
                        System.out.println("Thanks");
                    }
                }
            default -> {
                System.out.println("Enter correct number");
            }
        }
    }
}
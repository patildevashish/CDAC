
package tp;

import java.util.*;
import java.io.*;
import java.time.*;


class Student {
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
        return "Student [name=" + name + ", prnNo=" + prnNo + "]";
    }
}

class Trainer {

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

    public String toString() {
        return "Trainer [name=" + name + "]";
    }
}

class Assignment {
    private String title;
    private LocalDate date;
    private String description;
    private Student assignee;
    private Trainer trainer;


    public Assignment(String title, LocalDate date, String description, Student assignee, Trainer trainer) {
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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

    public String toString() {
        return "Assignment [title=" + title + ", date=" + date + ", description=" + description + ", assignee=" + assignee
                + ", trainer=" + trainer + "]";
    }
}

public class AssignmentManager {
    static Scanner sc = new Scanner(System.in);

    static List<Assignment> assignments = new ArrayList<>();

    static String fileName = "assignments.txt";

    public static void createAssignment() {

        System.out.println("Enter the title of the assignment:");
        String title = sc.nextLine();
        System.out.println("Enter the date of the assignment (yyyy-mm-dd):");
        String date = sc.nextLine();
        System.out.println("Enter the description of the assignment:");
        String description = sc.nextLine();
        System.out.println("Enter the name of the student:");
        String studentName = sc.nextLine();
        System.out.println("Enter the PRN number of the student:");
        int prnNo = sc.nextInt();
        sc.nextLine(); // To consume the newline
        System.out.println("Enter the name of the trainer:");
        String trainerName = sc.nextLine();

        Student student = new Student(studentName, prnNo);

        // Creating a trainer object
        Trainer trainer = new Trainer(trainerName);

        // Creating a date object
        LocalDate localDate = LocalDate.parse(date);

        // Creating an assignment object
        Assignment assignment = new Assignment(title, localDate, description, student, trainer);

        // Adding the assignment to the list
        assignments.add(assignment);

        // Displaying a success message
        System.out.println("Assignment created successfully!");
    }

    // Creating a method to show the assignments
    public static void showAssignments() {
        // Checking if the list is empty
        if (assignments.isEmpty()) {
            // Displaying a message
            System.out.println("No assignments found!");
        } else {
            // Displaying the assignments
            System.out.println("The assignments are:");
            for (Assignment a : assignments) {
                System.out.println(a);
            }
        }
    }

    // Creating a method to save the assignments to a file
    public static void saveAssignment() {
        // Creating a file object
        File file = new File(fileName);

        // Creating a print writer object
        try (PrintWriter pw = new PrintWriter(file)) {
            // Writing the assignments to the file
            for (Assignment a : assignments) {
                pw.println(a);
            }
            // Displaying a success message
            System.out.println("Assignments saved to the file!");
        } catch (FileNotFoundException e) {
            // Displaying an error message
            System.out.println("File not found!");
        }
    }

    // Creating a method to load the assignments from a file
    public static void loadAssignment() {
        // Creating a file object
        File file = new File(fileName);

        // Creating a scanner object
        try (Scanner sc = new Scanner(file)) {
            // Clearing the list
            assignments.clear();
            // Reading the assignments from the file
            while (sc.hasNextLine()) {
                // Splitting the line by commas
                String[] tokens = sc.nextLine().split(",");
                // Extracting the fields
                String title = tokens[0].substring(tokens[0].indexOf("=") + 1);
                String date = tokens[1].substring(tokens[1].indexOf("=") + 1);
                String description = tokens[2].substring(tokens[2].indexOf("=") + 1);
                String studentName = tokens[3].substring(tokens[3].indexOf("=") + 1);
                int prnNo = Integer.parseInt(tokens[4].substring(tokens[4].indexOf("=") + 1, tokens[4].indexOf("]")));
                String trainerName = tokens[5].substring(tokens[5].indexOf("=") + 1, tokens[5].indexOf("]"));
                // Creating a student object
                Student student = new Student(studentName, prnNo);
                // Creating a trainer object
                Trainer trainer = new Trainer(trainerName);
                // Creating a date object
                LocalDate localDate = LocalDate.parse(date);
                // Creating an assignment object
                Assignment assignment = new Assignment(title, localDate, description, student, trainer);
                // Adding the assignment to the list
                assignments.add(assignment);
            }
            // Displaying a success message
            System.out.println("Assignments loaded from the file!");
        } catch (FileNotFoundException e) {
            // Displaying an error message
            System.out.println("File not found!");
        }
    }


    // Creating the main method
    public static void main(String[] args) {
        // Creating a boolean variable to control the loop
        boolean exit = false;

        // Displaying a welcome message
        System.out.println("Welcome to the Assignment Manager!");

        // Creating a loop
        while (!exit) {
            // Displaying the menu
            System.out.println("Please choose an option:");
            System.out.println("1. Create an assignment");
            System.out.println("2. Show the assignments");
            System.out.println("3. Save the assignments to a file");
            System.out.println("4. Load the assignments from a file");
            System.out.println("5. Exit");

            // Taking input from the user
            int choice = sc.nextInt();
            sc.nextLine(); // To consume the newline

            // Using a switch case to perform the operations
            switch (choice) {
                case 1 -> {
                    createAssignment();
                }
                case 2 ->{
                    showAssignments();
                }
                case 3 ->{
                    saveAssignment();
                }
                case 4 ->{
                    loadAssignment();
                }
                
                default -> {
                    System.out.println("Enter correct number");
                }
            }
        }
    }
}
           

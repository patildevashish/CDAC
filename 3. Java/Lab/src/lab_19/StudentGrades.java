
package lab_19;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> studentGrades = new HashMap<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add students");
            System.out.println("2. Update grades");
            System.out.println("3. Remove students");
            System.out.println("4. View individual grades");
            System.out.println("5. List all students and grades");
            System.out.println("6. Calculate the average grade for all students");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();
                    studentGrades.put(name, grade);
                }
                case 2 -> {
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    double grade;
                    if (studentGrades.containsKey(name)) {
                        System.out.print("Enter new grade: ");
                        grade = scanner.nextDouble();
                        studentGrades.put(name, grade);
                    } else {
                        System.out.println("Student not found.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    if (studentGrades.containsKey(name)) {
                        studentGrades.remove(name);
                    } else {
                        System.out.println("Student not found.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    if (studentGrades.containsKey(name)) {
                        System.out.println(name + "'s grade is " + studentGrades.get(name));
                    } else {
                        System.out.println("Student not found.");
                    }
                }
                case 5 -> {
                    for (String key : studentGrades.keySet()) {
                        System.out.println(key + ": " + studentGrades.get(key));
                    }
                }
                case 6 -> {
                    double totalGrade = 0;
                    for (double value : studentGrades.values()) {
                        totalGrade += value;
                    }
                    double averageGrade = totalGrade / studentGrades.size();
                    System.out.println("The average grade is " + averageGrade);
                }
                case 7 -> {
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}

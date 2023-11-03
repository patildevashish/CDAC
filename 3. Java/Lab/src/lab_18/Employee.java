/*
Write a java program to Create a collection of Employee class and sort
objects using comparable and comparator interfaces.
 */
package lab_18;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id = " + id + ", Name = " + name + ", Salary = " + salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id-o.id;
    }

    
}

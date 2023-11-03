package objectMethods;

import java.util.Objects;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return this.age;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.age != other.age) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
}
public class TestEqHasTostr {
    public static void main(String[] args) {
        Student s1 = new Student("Ramesh", 40);
        Student s2 = new Student("Ramesh", 40);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.toString());
    }
}

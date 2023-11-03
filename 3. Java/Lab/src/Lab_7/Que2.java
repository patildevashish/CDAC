/*
Write a Java program to create an abstract class Person with abstract methods
eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the
Person class and implement the respective methods to describe how each
person eats and exercises.
 */
package Lab_7;

abstract class Person{
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person{
    @Override
    void eat() {
        System.out.println("eats healthy food");
    }

    @Override
    void exercise() {
        System.out.println("exercise form 5:00 AM to 9:00Am");
    } 
}

class LazyPerson extends Person{

    @Override
    void eat() {
        System.out.println("eats junk food");
    }

    @Override
    void exercise() {
        System.out.println("never do any exercise");   }

}
public class Que2 {
    public static void main(String[] args) {
        Person p;
        p = new Athlete();
        System.out.println("Athlete");
        p.eat();
        p.exercise();
        
        p = new LazyPerson();
        System.out.println("\nLazy Person");
        p.eat();
        p.exercise();
    }
}

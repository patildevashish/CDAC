package inheritance.single;
class Parent{
    int a =10;
    void show(){
            System.out.println("a = "+a);
    }
}
class Child extends Parent{
    int b = 20;
    void display(){
        System.out.println("b = "+b);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Child c = new  Child();
        c.show();
        c.display();
    } 
}

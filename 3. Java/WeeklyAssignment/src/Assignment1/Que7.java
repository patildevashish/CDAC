package Assignment1;

class Outer{
        int x=10;
        static class Inner{
            void show(){
                 int y=30;
            Outer o=new Outer();
                System.out.println("Inner="+(o.x+y));
            }
        }
    }
class Out{
    int a=30;
    class Inn{
        void display(){
            int b=50;
            System.out.println("Inn="+(a+b));
        }
    }
}

class Parent{
    void Test(){
        System.out.println("In parent class");
    }
}
class Child{
    Parent p=new Parent()
    {
       void Test(){
        System.out.println("In Annonymous class");
       }
    };
}

public class Que7 {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();
        
        Out obj2=new Out();
        Out.Inn obj3=obj2.new Inn();
        obj3.display();
        Child ch=new Child();
        ch.p.Test();      
    }
}
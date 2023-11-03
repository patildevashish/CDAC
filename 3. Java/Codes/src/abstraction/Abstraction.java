package abstraction;

import java.util.Scanner;

abstract class LivingThing{
    void eyes(){
        System.out.println("Two eyes");
    }
    void mouth(){
        System.out.println("One mouth");
    }
    abstract void legs();
}

class Human extends LivingThing{

    @Override
    void legs() {
        System.out.println("Two legs");
    }
}

class Animal extends LivingThing{

    @Override
    void legs() {
        System.out.println("four legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        LivingThing lt;
        System.out.println("Property of human");
        lt = new Human();
        lt.eyes();
        lt.mouth();
        lt.legs();
        
        System.out.println("*************************");
        
        System.out.println("Property of animal");
        lt = new Animal();
        lt.eyes();
        lt.mouth();
        lt.legs();
          
        }
      
}

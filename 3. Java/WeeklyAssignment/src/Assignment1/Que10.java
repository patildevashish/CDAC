package Assignment1;

import java.util.Arrays;
import java.util.OptionalDouble;


public class Que10 {
    int a[] ={10,20,30,40};
    int b  =a.length;
    
    void sum(){
        int sum = Arrays.stream(a).sum();
        System.out.println("Sum is: "+sum);
    }
    void average(){
        OptionalDouble average = Arrays.stream(a).average();
        System.out.println("Average is: "+average);
    }
    void maximum(){
        int c = a[b-1];
        System.out.println("largest: "+c);
    }
    void minimum(){
        int c = a[b-4];
        System.out.println("smallest: "+c);
    }
    public static void main(String[] args) {
        Que10 q = new Que10();
        System.out.println("Array is: "+Arrays.toString(q.a));
        q.sum();
        q.average();
        q.maximum();
        q.minimum();
    }
}

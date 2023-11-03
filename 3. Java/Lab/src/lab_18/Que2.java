/*
Write a java program to Implement Queue data structure using
LinkedList and Queue collection.
 */
package lab_18;


import java.util.Queue;
import java.util.LinkedList;

class Que2 {

  public static void main(String[] args) {
    Queue<Integer> numbers = new LinkedList<>();

 
    numbers.offer(1);
    numbers.offer(2);
    numbers.offer(3);
    System.out.println("Queue: " + numbers);

    int removedNumber = numbers.poll();
    System.out.println("Removed Element: " + removedNumber);

    System.out.println("Queue after deletion: " + numbers);
    }
}
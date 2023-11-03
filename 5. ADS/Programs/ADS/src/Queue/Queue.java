
package Queue;

import java.util.Arrays;

public class Queue {
    // class variables
    private final int SIZE = 3; 
    int queue[]=new int [SIZE]; 
    private int front=-1; 
    private int rear=-1;
    
    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return (rear == SIZE - 1);
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = value;
            System.out.println("Inserted " + value);
        }
    }


    public int pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }
        else {
            int value = queue[front];
            front++;
            if (front > rear) {
                front = rear=-1;
            }
            
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        else {
            return queue[front];
        }
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        else {
            return queue[rear];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
//        q.pop();
        q.push(10);
        q.pop();
        q.push(20);
        q.push(30);
        
        q.push(40);
        
        System.out.println("The element at front is " + q.peek());
        System.out.println("The element pop is " + q.pop());
        System.out.println("The element at rear is " + q.rear());
        System.out.println(Arrays.toString(q.queue));
    }
}

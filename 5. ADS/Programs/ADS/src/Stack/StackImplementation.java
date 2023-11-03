
package Stack;

import java.util.Arrays;

class MyStack{
    final int SIZE = 3;
    int arr[] = new int [SIZE];
    int top =-1;
    
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top == SIZE-1;
    }
    public void push(int value){
        if (isFull()) {
            System.out.println("Stack is full..........");
        }
        else{
            ++top;
            arr[top]= value;
        }
    }
    public void pop(int par){
        if (isEmpty()) {
            System.out.println("Stack is Empty..........");
        }
        else{
            
            top--;
        }
    }
    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack is Empty.........");
            return 0;
        }
        System.out.println("Peeked element is "+arr[top]); 
        return 0;
    }
}
public class StackImplementation{
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        System.out.println("10 is pushed..........");
        
        stack.push(20);
        System.out.println("20 is pushed..........");
        
        stack.push(30);
        System.out.println("30 is pushed..........");
        
        stack.pop(30);
        System.out.println("30 is poped...........");
        
        stack.push(40);
        System.out.println("40 is pushed..........");
        
        //stack.push(50);
        
//        stack.pop(40);
//        stack.pop(20);
//        stack.pop(10);
        stack.peek();
        System.out.println(Arrays.toString(stack.arr));
    }
    
}

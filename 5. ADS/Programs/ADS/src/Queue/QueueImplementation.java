
package Queue;


import java.util.Arrays;

class Sample{
    int rear=-1;
    int front=0;
    int size =5;
    int arr[]= new int[size];

    public void Push(int value) {

        if(rear==(size-1)) {
                System.out.println("Queue is full..");
        }
        else {
                ++rear;
                arr[rear]= value;
    }
}
	
    public void pop() {

        if(rear==-1 && front==-1) {
                System.out.println("Queue is empty..");
        }
        else {
                System.out.println("value is popped..");

                for(front=0;front<size-1;front++) {
                arr[front]=arr[front+1];
                }
                if(rear<size) {
                        arr[rear]=0;
                }
                rear--;
        }

    }
}

public class QueueImplementation {

	public static void main(String[] args) {
            Sample s= new Sample();
            s.Push(10);
            System.out.println("10 is pushed..");
            s.Push(20);
            System.out.println("20 is pushed");
            s.Push(30);
            System.out.println("30 is pushed..");
            s.Push(40);
            System.out.println("40 is pushed..");
            s.Push(50);
            System.out.println("50 is pushed..");
            System.out.println(Arrays.toString(s.arr));
            s.pop();
            s.Push(20);
            System.out.println("20 is pushed");
            System.out.println(Arrays.toString(s.arr));
            s.pop();
            //s.pop();
            System.out.println(Arrays.toString(s.arr));
            //s.Push(60);
            s.pop();
            s.pop();
            s.pop();
            System.out.println(Arrays.toString(s.arr));
	}

}

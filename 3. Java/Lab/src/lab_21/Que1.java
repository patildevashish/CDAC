/*
.Write a Java program that creates two threads to find and print even and odd numbers from 1
to 20
 */
package lab_21;



class Even implements Runnable{
    int i;

    public Even(int i) {
        
        this.i = i;
    }
    public int findEven(){
        synchronized (this) {
            
            for (i = 1; i <=20; i++) {
                if (i%2==0) {
                    System.out.println("Even Number: "+i);
                }
            }
            
            return i;
        }
    }
    @Override
    public void run() {
        while (true) {            
            findEven();
            break;
        }
    }
    

}
class Odd implements Runnable{
    int j;
    public Odd(int j) {
        
        this.j = j;
    }
    public int findodd(){
        synchronized (this) {
            for (j = 1; j <=20; j++) {
                if (j%2!=0) {
                    System.out.println("Odd Number: "+j);
                }
            }
            return j;
        }
    }
    @Override
    public void run() {
        while (true) {            
            findodd();
            break;
        }
    }
}
public class Que1 {
    public static void main(String[] args) {
        Even e =new Even(20);
        Odd o = new Odd(20);
        
        Thread t1 = new Thread(e);
        Thread t2 = new Thread(o);
        
        t1.start();
        t2.start();
    }
}

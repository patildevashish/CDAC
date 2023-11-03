
package Thread.Synchronization;


public class SynchDemo implements Runnable{
    static int x=0;
    @Override
    public void run() {
        synchronized (this) {
        for (int i = 0; i < 1000; i++) {
            x++;
            x--;
        }
        }
    }
    
    public static void main(String[] args) {
        SynchDemo sd = new SynchDemo();
        
        Thread th[] = new Thread[100];
        for (int i = 0; i < th.length; i++) {
            th[i] = new Thread(sd);
            th[i].start();
        }
        System.out.println("Final value of X is: "+x);
    }
    
}

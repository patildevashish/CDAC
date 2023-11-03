
package islandOfIsolation;

public class Test {
    Test i;
    
    protected void finalize(){
        System.out.println("Object is destroyed");
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        
        t1.i=t2;
        t2.i=t1;
        
        t1 = null;
        //t2 = null;
        System.gc();
    }
}

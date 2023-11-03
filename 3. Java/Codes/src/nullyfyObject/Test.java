
package nullyfyObject;


public class Test {
    protected void finalize(){
        System.out.println("Object is destroyed");
    }
    
    public static void main(String[] args) {
        Test t1 = new Test();
        t1 = null;
        System.gc();
    }
}

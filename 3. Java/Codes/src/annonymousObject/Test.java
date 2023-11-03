
package annonymousObject;

public class Test {
    protected void finalize(){
        System.out.println("Object is destroyed");
    }
    public static void main(String[] args) {
        new Test();
        System.gc();
    }
}

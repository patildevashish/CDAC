
package tp;

public class NewClass {
    void show (int n){
        if (n<1) {
            return;
        }
        System.out.println(n);
        show(--n);
    }
    public static void main(String[] args) {
        NewClass n= new NewClass();
        n.show(5);
    }
}


package exception;

public class TestThrows {

    int a = 10, b = 2;

    void show() throws Exception {
        System.out.println(a / b);
        Class.forName("");  // run time exception

    }
    void display() {
        System.out.println("display()");

    }

    void test() {
        System.out.println("test()");
        display();

    }

}
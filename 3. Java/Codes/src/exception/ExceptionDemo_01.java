
package exception;

import java.util.Arrays;

public class ExceptionDemo_01 {
    int a = 10;
    int b = 5;
    int arr[] = {1,2,123};
    void show(){
        System.out.println("B");
        try{
            System.out.println("C");
            System.out.println(a/b);
            arr[4]=12/0;
            System.out.println(Arrays.toString(arr));
            System.out.println("D");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("E");
        }
    }
    public static void main(String[] args) {
        System.out.println("A");
        ExceptionDemo_01 z = new ExceptionDemo_01();
        z.show();
        System.out.println("F");
    }
}


package lab14;

import java.util.Arrays;

public class Que1 {
    int arr[] = {1,2,3};
    void show(){
        try {
            arr [5] = 12;
            System.out.println(Arrays.toString(arr));
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }
    
    public static void main(String[] args) {
        Que1 q = new Que1();
        q.show();
    }
}

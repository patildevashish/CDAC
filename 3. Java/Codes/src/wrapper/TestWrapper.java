
package wrapper;

public class TestWrapper {
    public static void main(String[] args) {
        int x = 10;
        /*
        Integer i = new Integer(x);     //Boxing
        int a = i.intValue();               // Unboxing
        */
        
        Integer i = x;            // AutoBoxing
        int a = i;               // AutoUnboxing
        System.out.println("primitive x = "+x);
        System.out.println("Referance x = "+i);
        System.out.println("Primitive x = "+a);
        
        // String to corresponding Numeric Value 
        String age = "25";
        int age1 = Integer.parseInt(age);
        System.out.println(age + 5);    //it will give 255 as output
        System.out.println(age1 + 5);
    }
}

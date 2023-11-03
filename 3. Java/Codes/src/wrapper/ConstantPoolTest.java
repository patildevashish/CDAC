
package wrapper;

public class ConstantPoolTest {
    public static void main(String[] args) {
        // for integral family -128 to 127
        Byte b1 = Byte.valueOf("127");
        Byte b2 = Byte.valueOf("127");
        System.out.println(b1 == b2);
        
        System.out.println("\nShort");
        Short b3 = Short.valueOf("128");
        Short b4 = Short.valueOf("128");
        System.out.println(b3 == b4);
        
        System.out.println("\nBoolean");
        Boolean b5 = Boolean.valueOf("True");
        Boolean b6 = Boolean.valueOf("True");
        System.out.println(b5 == b6);
        
        System.out.println("\nFloat");
        Float b7 = Float.valueOf("12.23");
        Float b8 = Float.valueOf("12.23");
        System.out.println(b7 == b8);
        
        System.out.println("\nCharacter");
        Character b9 = Character.valueOf('\u0950');
       // Character b10 = Character.valueOf('A');
        System.out.println(b9);
        //System.out.println("\u0950");
    }
}

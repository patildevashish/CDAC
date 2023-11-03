
package lab11;

public class Length {
    String str;
    
    void length(){
        str="Beautiful";
        System.out.println("length="+str.length());
    }
    public static void main(String[] args) {
        Length l = new Length();
        l.length();
    }
}

package Lambda;
interface LengthFinder{
    int strLength(String str);
}
public class Lambda {
    public static void main(String[] args) {
        LengthFinder lf = (str) ->str.length();
        System.out.println("Length is: "+lf.strLength("Soft Polynmaials"));
    }
}

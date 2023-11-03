
package inner.Anonymous;
class ParentOfAnonymous{
    void greeting(){
        System.out.println("Helloooooo.....");
    }
}
class OuterOfAnonymous{
    ParentOfAnonymous p = new ParentOfAnonymous(){
        @Override
        void greeting() {
            System.out.println("Namasteee.........");
        }
    };
}
public class TestAnonymous {
    public static void main(String[] args) {
        OuterOfAnonymous o = new OuterOfAnonymous();
        o.p.greeting();
        
    }
}

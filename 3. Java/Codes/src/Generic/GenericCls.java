
package Generic;

class Container<T>{
    T contain;

    public Container(T contain) {
        this.contain = contain;
    }

    public T getContain() {
        return contain;
    }
    
    public void showTYpe(){
        System.out.println(contain.getClass().getName());
    }
}
public class GenericCls {
    public static void main(String[] args) {
        Container<String> c= new Container("CDAC");
        String s = c.getContain();
        System.out.println(s);
        c.showTYpe();
    }
}

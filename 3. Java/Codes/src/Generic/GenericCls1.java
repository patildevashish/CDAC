
package Generic;

class Container<T,V>{
    T contain;

    public Container(T contain) {
        this.contain = contain;
    }

    public T getContain() {
        return contain;
    }
    public V showData(V data){
        return data;
    }
    public void showTYpe(){
        System.out.println(contain.getClass().getName());
    }
}
public class GenericCls1 {
    public static void main(String[] args) {
        Container<String,Integer> c= new Container("CDAC");
        String s = c.getContain();
        System.out.println(s);
        
        System.out.println(c.showData(10));
        c.showTYpe();
    }
}

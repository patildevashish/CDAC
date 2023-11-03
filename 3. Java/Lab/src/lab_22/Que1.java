/*
Write a generic method to count the number of elements in a collection that have a
specific property (for example, odd integers, prime numbers, palindromes).

 */
package lab_22;


class Container<T>{
    T contain[];

    public Container(int contain, int par1, int par2) {
      
    }

    

    public T getContain() {
        return (T) contain;
    }
    
    public void showTYpe(){
        System.out.println(contain.getClass().getName());
    }
}
public class Que1 {
    public static void main(String[] args) {
        Container<Integer> c = new Container(1,2,3);
    }
}

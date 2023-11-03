package collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

    public static void main(String[] args) {
        List lst = new ArrayList();
//        List lst1 = new ArrayList();
//        lst1.add(1);
//        lst1.add(2);
//        lst1.add(3);
//        lst.add('D');
//        lst.add('A');
//        lst.add('B');
//        lst.add('D');
//        
//        lst.add(3, 'C');
//        lst.addAll(0, lst1);
//        lst.remove(0);
//        
//        System.out.println(lst.get(3));
//        System.out.println(lst.contains('B'));
//        System.out.println(lst);

        lst.add(23);
        lst.add(12.23);
        lst.add("String");
        lst.add(new Date());
//        System.out.println(lst);
        for (Object o : lst) {
            System.out.println(o);
        }
        System.out.println("*******************************");
        Iterator it = lst.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
    }
}

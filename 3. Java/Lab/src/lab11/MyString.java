
package lab11;

import java.util.Scanner;




public class MyString {
    String s = "Create MyString class and perform different string manipulation methods.";
    void indexof(){
        System.out.println("Indexof Method: -");
        System.out.println("Position "+s.indexOf("l"));
        System.out.println("*********************************");
    }
    void lastindexof(){
        System.out.println("Lastindexof method");
        System.out.println(s.lastIndexOf("class"));
        System.out.println("*********************************");
    }
    void charat(){
        System.out.println("CharAt method: - ");
        System.out.println(s.charAt(36));
        System.out.println("*********************************");
    }
    void contain(){
        
        System.out.println(s.contains("Create"));
        System.out.println("*********************************");
    }
    void isempty(){
        System.out.println("*********************************");
        System.out.println(s.isEmpty());
    }
    void isblank(){
        System.out.println("*********************************");
        System.out.println(s.isBlank());
    }
    void comapreto(){
        System.out.println("Split method");
        String a[] = s.split(" ");
        for (String s : a) {
            System.out.println(s);
        }
        for (int i = 0; i < a.length -1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i].compareTo(a[j])>0){
                    String temp;
                    temp = a[i];
                    a[i]= a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("*********************************");
        System.out.println("Sorted Order");
        for (String s : a) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        MyString m = new MyString();

        System.out.println("Choose the method ");
        System.out.println("1.indexof \n2. lastindexof \n3.charat\n4.contain \n5.comapreto \n6.isblank \n7.isempty  ");
        Scanner b = new Scanner(System.in);
        int z = b.nextInt();
        switch(z) {
            case 1 -> {
                m.indexof();
}
            case 2 -> {
                m.lastindexof();
}
            case 3 -> {
                m.charat();
}
            case 4 -> {
                m.contain();
}
            case 5 -> {
                m.comapreto();
}
            case 6 -> {
                m.isblank();
}
            case 7 -> {
                m.isempty();
}
            default -> {
                System.out.println("Enter correct value");}
        }
    }
}


package lab15;

import java.io.*;


public class Q1 {
    void readline() throws IOException{
        String s;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Provide Statemenr");
        do {            
            s = bf.readLine();
            System.out.println(s);
        } while (!s.equals("bss re"));
    }
    public static void main(String[] args) throws IOException {
        Q1 q = new Q1();
        q.readline();
    }
}

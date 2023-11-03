package iotest;

import java.io.FileInputStream;

public class ReadFile {
    void readFile(){
        int i;
        //try with resource
        try(FileInputStream fin=new FileInputStream("D:\\Study\\Cdac\\3. Java\\Dac_Sept_23\\src\\iotest\\Read.txt")){
        do{
            i=fin.read();
            System.out.print((char)i);
        }
        while(i!=-1);//eof
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        ReadFile rf=new ReadFile();
        rf.readFile();
    }
}

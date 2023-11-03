package iotest;
import java.io.*;
public class ReadAndCopyFile {
    void copyFile(){
        int i;
        try(FileInputStream fin=new FileInputStream("D:\\pic.jpeg.jpg");
                FileOutputStream fout=new FileOutputStream("D:\\Study\\photo.png")){
        do{
            i=fin.read();
            fout.write(i);
        }while(i!=-1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        ReadAndCopyFile cf=new ReadAndCopyFile();
        cf.copyFile();
    }
}

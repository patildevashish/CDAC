package iotest.niotest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            Path path=Paths.get("D:\\Study\\Cdac\\3. Java\\Dac_Sept_23\\src\\iotest\\Read.txt");
            
            String content=" DEVASHISH ";
            for(int i=0;i<10;i++)
                Files.write(path,content.getBytes(),StandardOpenOption.APPEND);
            System.out.println("Completed");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

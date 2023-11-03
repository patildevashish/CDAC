package iotest.niotest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        try{
        Path path=Paths.get("C:\\Users\\OPS\\Desktop\\CDAC\\NioTest\\Ram.txt");
        List<String> lst=Files.readAllLines(path);
        for(String str:lst){
            System.out.println(str);
        }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

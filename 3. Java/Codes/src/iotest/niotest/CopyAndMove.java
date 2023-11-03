package iotest.niotest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyAndMove {
    public static void main(String[] args) {
        try{
            Path path=Paths.get("C:\\Users\\OPS\\Desktop\\CDAC\\NioTest\\Ramesh.txt");
            Path pathCopy=Paths.get("C:\\Users\\OPS\\Desktop\\CDAC\\Samir.txt");
            Files.move(path, pathCopy);
            System.out.println("Copied");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}


package collection.set;

import java.util.*;

public class BackupSet {
    public static void main(String[] args) {
        System.out.println("\n**************Original Set**************\n");
        Set<Integer> originalSet = new HashSet<>();
        originalSet.add(100);
        originalSet.add(200);
        originalSet.add(300);
        System.out.println(originalSet);
        
        System.out.println("\n**************Backup Set**************\n");
        Set<Integer> backupSet = new HashSet<>(originalSet);
        System.out.println(backupSet);
        
        System.out.println("\n**************Addition of value in Backup Set**************\n");
        backupSet.add(500);
        System.out.println(originalSet);
        System.out.println(backupSet);
    }
}

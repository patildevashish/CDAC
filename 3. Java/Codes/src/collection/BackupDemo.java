
package collection;

import java.util.*;

public class BackupDemo {
    public static void main(String[] args) {
        System.out.println("\n**************Original List**************\n");
        List<Integer> originallst = new ArrayList<>();
        originallst.add(100);
        originallst.add(200);
        originallst.add(300);
        System.out.println(originallst);
        
        System.out.println("\n**************Backup List**************\n");
//        List<Integer> backuplist = originallst.subList(0, originallst.size());
        List<Integer> backuplist = originallst.subList(0, 2);
        System.out.println(backuplist);
        
        System.out.println("\n**************Addition in Backup List**************\n");
        backuplist.add(500);
        backuplist.add(700);
        System.out.println(originallst);
        System.out.println(backuplist);
        
        System.out.println("\n**************Removal in Backup List**************\n");
        backuplist.remove(2);
        System.out.println(originallst);
        System.out.println(backuplist);
        
    }
}

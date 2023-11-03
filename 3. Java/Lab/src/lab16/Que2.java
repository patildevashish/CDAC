/*
Q2.Parsing Strings into Dates:
a. Create a SimpleDateFormat object to parse a date string in the "yyyy-MM-dd" format. Parse
the string "2023-10-23" and print the Date object.
b. Parse a date string in the "dd/MM/yyyy" format from user input and print the parsed Date
object. Handle any potential ParseException
*/
package lab16;

import java.time.LocalDate;
import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        System.out.println("Enter Date 'date/month/year': ");
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String arr[] = date.split("/");
        
        int d = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int y= Integer.parseInt(arr[2]);
        LocalDate l = LocalDate.of(y, m, d);
        
        System.out.println(l);
        
    }
}

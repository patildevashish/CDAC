
package dateDemo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeApplication {
    public static void main(String[] args) {
        System.out.println("Enter your Date of Birth 'date/month/year': ");
        Scanner sc = new Scanner(System.in);
        
        String dob = sc.next();
        String arr[] = dob.split("/");
        
        int d = Integer.parseInt( arr[0]);
        int m = Integer.parseInt(arr[1]);
        int y = Integer.parseInt(arr[2]);
        
        LocalDate birthDate = LocalDate.of(y, m, d);
        LocalDate today = LocalDate.now();
        
        Period p = Period.between(birthDate, today);
        System.out.println("You are "+p.getYears()+" years, "+p.getMonths()+" months and "+p.getDays()+" day old");
        
        System.out.println("*******************************************");
        System.out.println(today.minusDays(120));
        System.out.println(today.minusMonths(7));
        System.out.println(today.minusYears(1));
        System.out.println(today.isAfter(LocalDate.of(2021, 4, 22)));
        System.out.println(today.getMonth());
        System.out.println(today.getYear());
        System.out.println(today.getDayOfWeek());
    }
}

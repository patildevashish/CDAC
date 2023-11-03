/*
Q.1.Formatting Dates to Strings:
a. Create a SimpleDateFormat object to format the current date in the "dd-MM-yyyy"
pattern. Print the formatted date.
b. Format the current time in the "HH:mm:ss" pattern and display it.
c. Create a SimpleDateFormat object to format a given date of your choice in the "MMM dd,
yyyy" pattern.
*/
package lab16;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Que1 {
    public static void main(String[] args) {
        Date d = new Date();
        //a
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String sdfDate = sdf.format(d);
        System.out.println(sdfDate);
        //b
        LocalTime t = LocalTime.now();
        System.out.println(t.getHour()+":"+t.getMinute()+":"+t.getSecond());
        //c
        SimpleDateFormat rtx = new SimpleDateFormat("MMM-dd-yyyy");
        String rtxDate = rtx.format(d);
        System.out.println(rtxDate);
    }
}

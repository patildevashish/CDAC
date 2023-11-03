
package dateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManupulation {
    public static void main(String[] args) {
        Date d = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat rtx = new SimpleDateFormat("dd-MMM-yyyy");
        //for converting date into String
        String strDate = sdf.format(d);
        String rtxDate = rtx.format(d);
        System.out.println(strDate);
        System.out.println(d);
        System.out.println(rtxDate);
        
        //for converting string to date
        String sDate = "2023-10-23 8:35:45";
        
        SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try{
        Date dt = a.parse(sDate);
            System.out.println(dt);
        }
        catch (Exception e){}
    }
}

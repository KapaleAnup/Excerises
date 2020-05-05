package devqa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class GetCurrentDate {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);  // print the local date

        /*
        if want any pattern for date.
         */
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));

        /*
        LocalDate class has other useful methods that we can use to get more
        detail about the current date such as: getDayOfWeek(),
         getDayOfMonth(), getDayOfYear()
         */

        System.out.println("Today's date :" + localDate.toString());
        System.out.println("Day of week: " + localDate.getDayOfWeek().toString());
        System.out.println("Day of month: " + localDate.getDayOfMonth());
        System.out.println("Day of year: " + localDate.getDayOfYear());

         System.out.println("Time now: " + localDate.toString());
       //System.out.println("Formatted time: " + localDate.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}

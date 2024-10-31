package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Seven {
    public static void main(String[] args) {
        String date="2024-10-04";
        LocalDate localDate=LocalDate.parse(date);
        DayOfWeek dayOfWeek=localDate.getDayOfWeek();
        System.out.println(dayOfWeek);
   }    
}

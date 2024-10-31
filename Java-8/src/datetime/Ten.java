package datetime;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class Ten {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.of(2024,Month.OCTOBER, 1);
        LocalDate localDate=ld.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        
        List<LocalDate> list=new ArrayList<>();
        LocalDate currMonday=localDate;
        while (currMonday.getMonth()==ld.getMonth()) {
            list.add(currMonday);
            currMonday=currMonday.plusWeeks(1);
        }

        System.out.println(list);
    }
}

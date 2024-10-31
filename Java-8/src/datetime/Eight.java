package datetime;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Eight {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        LocalDate nextTuesday=localDate.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(nextTuesday);
    }
}

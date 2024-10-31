package datetime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodObject {
    public static void main(String[] args) {
        // Period Object defines the gap or represent quantity of Time

        LocalDate today=LocalDate.now();
        LocalDate birthDay=LocalDate.of(2002,04,17);
        Period period=Period.between(birthDay, today);
        System.out.println(period);

    }
}

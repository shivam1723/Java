package datetime;

import java.time.LocalDate;
import java.time.Period;

public class Four {
    public static void main(String[] args) {
        // 4) Write a program that takes a birthdate (eq 1994-11-31) and calculates the exact age in year, months and days using Period.

        LocalDate today=LocalDate.now();
        LocalDate birDate=LocalDate.of(2002,04,17);
        Period period=Period.between(birDate, today);
        System.out.println(period.getYears()+" Years "+period.getMonths()+" Months "+period.getDays()+" Days");
    }
    
}

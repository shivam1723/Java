package datetime;

import java.time.LocalDate;

public class Three {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getYear());
    }
}

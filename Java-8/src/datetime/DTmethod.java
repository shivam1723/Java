package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DTmethod {
    public static void main(String[] args) {

        System.out.println("Local Date");
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate); //LocalDate gives current date
        System.out.println("Local Date Month "+localDate.getMonth());
        System.out.println("Local Date Month by Value "+localDate.getMonthValue());
        System.out.println("Local Day of Current Month "+localDate.getDayOfMonth());
        System.out.println("Local Day of Current Year "+localDate.getYear());
        System.out.println("Local Date "+localDate.getDayOfMonth()+"-"+localDate.getMonthValue()+"-"+localDate.getYear());

        System.out.println("Local DateTime");
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime); //Local Date and Time is fetched

        System.out.println("Local Time");
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime); //Local Time is fetched
        System.out.println("Local Time "+localTime.getHour()+"-"+localTime.getMinute()+"-"+localTime.getSecond()+"-"+localTime.getNano());

    }
}

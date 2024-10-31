package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Six {
    public static void main(String[] args) {
        // Write a java program that formats the current LocalDateTime into the format dd-MM-yyyy HH:mm:ss using dateTimeFormatter.
        LocalDateTime localDateTime=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime=localDateTime.format(formatter);
        System.out.println(formattedDateTime);
    }
    
}

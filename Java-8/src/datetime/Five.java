package datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Five {
    public static void main(String[] args) {
        // Convert the date and time from default zone to another time zone

        ZoneId zone=ZoneId.of("America/New_York");
        ZonedDateTime zt=ZonedDateTime.now(zone);
        System.out.println(zt);
    }
}

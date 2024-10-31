package datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class RepresentZone {
    public static void main(String[] args) {

        // ZoneId zone=ZoneId.systemDefault();
        // zone=ZoneId.of("America/Los_Angeles");
        // LocalDateTime localDateTime=LocalDateTime.now();
        // ZonedDateTime z=ZonedDateTime.of(localDateTime, zone);
        // System.out.println(zone);
        // System.out.println(z);
        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zt = ZonedDateTime.now(la);
        System.out.println(zt);

        

    }
}

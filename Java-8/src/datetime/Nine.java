package datetime;

import java.time.Duration;
import java.time.LocalTime;

public class Nine {
    public static void main(String[] args) {
        LocalTime lt=LocalTime.now();
        LocalTime localTime=LocalTime.of(16,15,30);
        Duration duration=Duration.between(lt,localTime);
        System.out.println(duration);
    }
}

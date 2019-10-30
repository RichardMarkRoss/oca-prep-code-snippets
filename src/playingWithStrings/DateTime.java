package playingWithStrings;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args){
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss a");
        LocalTime Time = LocalTime.of(23,59,59);
        System.out.println(Time.format(time));
    }
}

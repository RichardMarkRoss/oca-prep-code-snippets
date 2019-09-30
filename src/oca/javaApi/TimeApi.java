package oca.javaApi;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeApi {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("G yyyy/LLLL/dd SSSSSS.ss:mm:hh a");
        LocalTime time = LocalTime.now();
//        System.out.println(time.format(formatter));
        System.out.println(time.getHour());

        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getEra());

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.format(formatter));
        String name = date.toString();
        String times = time.toString();
        String run = time.toString();
        System.out.println(dateTime.now());

        System.out.println(name == name);
        System.out.println(times == times);
        System.out.println(times.equals(run));
    }
}

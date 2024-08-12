package Java8_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTime_Example {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime parsedDateTime = LocalDateTime.parse("2024-08-24T11:14");

        LocalDate localDate = parsedDateTime.toLocalDate();
        System.out.println(localDate);
        LocalTime localTime =  parsedDateTime.toLocalTime();
        System.out.println(localTime);
        System.out.println(parsedDateTime);

        localDate.getDayOfMonth();
        localDate.getDayOfWeek();
        localDate.getYear();
        localTime.getHour();
        localTime.getMinute();
        //localTime.isAfter();

    }


}

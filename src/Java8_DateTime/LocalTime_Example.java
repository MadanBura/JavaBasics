package Java8_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTime_Example {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime customeTime =  LocalTime.of(14,30,30);
        System.out.println(customeTime);

        String time_ = "03:45:40";
        LocalTime parsedTime= LocalTime.parse(time_);
      //  LocalTime parsedTime = LocalTime.parse(time_, DateTimeFormatter.ofPattern())
        System.out.println(parsedTime);
        LocalTime beforeOneHr = currentTime.minusHours(1);
        LocalTime beforeTenMinutes = currentTime.minusMinutes(10);

        System.out.println(beforeOneHr);
        System.out.println(beforeTenMinutes);

    }
}

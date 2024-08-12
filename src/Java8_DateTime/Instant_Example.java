package Java8_DateTime;

import javax.xml.transform.Source;
import java.time.Instant;

public class Instant_Example {

    //Instant it returns time in millisecond which is counted from January 1 1970 UTC

    public static void main(String[] args) {

        long millis = System.currentTimeMillis();
        System.out.println(millis);

        //Monday, August 12, 2024 6:10:05.308 AM
        //go to epoch Converter to read this timestamp

        Instant now_ = Instant.now();
        System.out.println(now_);
        //Here it prints time includes nano seconds


    }

}

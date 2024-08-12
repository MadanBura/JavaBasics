package Java8_DateTime;

import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatter_Example {
    public static void main(String[] args) {

        LocalDateTime cu = LocalDateTime.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String str = cu.format(myFormatter);
        System.out.println(str);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.CANADA);
        String s = cu.format(formatter);
        String s1 = cu.format(formatter2);
        System.out.println(s);
        System.out.println(s1);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter3);
        System.out.println(formattedDate);


        String dateStr = "2024-08-12 10:15:30";
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        //this is overloaded method of parse which take second parameter as formatter
        LocalDateTime dateTime = LocalDateTime.parse(dateStr, formatter4);
        System.out.println(dateTime);

        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy").withLocale(Locale.FRANCE);
        LocalDate date = LocalDate.now();
        String formattedDate1= date.format(formatter5);
        System.out.println(formattedDate1);


        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z").withZone(ZoneId.of("America/New_York"));
        String formattedDate2 = formatter.format(zonedDateTime);
        System.out.println(formattedDate2);


        Format format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").toFormat();
        DateTimeFormatter frm = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //Here are some common patterns
//        "yyyy-MM-dd": 2024-08-12
//        "dd/MM/yyyy": 12/08/2024
//        "MMMM d, yyyy": August 12, 2024
//        "EEE, MMM d, ''yy": Mon, Aug 12, '24
//        "hh:mm a": 10:15 AM
//        "HH:mm:ss.SSS": 10:15:30.123








    }
}

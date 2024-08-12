package Java8_DateTime;

import java.time.*;
import java.util.Set;

public class ZonedDateTime_Example {

    public static void main(String[] args) {

        ZonedDateTime current = ZonedDateTime.now();
        System.out.println(current);

        Set<String> availableZones = ZoneId.getAvailableZoneIds();
        availableZones.forEach(str -> System.out.println(str));

        ZonedDateTime specificZonedDateTime = ZonedDateTime.of(LocalDate.of(2024, 8, 12), LocalTime.of(14, 30), ZoneId.of("America/New_York"));
        System.out.println(specificZonedDateTime);

        ZonedDateTime parsedZonedDateTime = ZonedDateTime.parse("2024-08-12T14:30:00-04:00[America/New_York]");
        System.out.println(parsedZonedDateTime);

        LocalDateTime localDateTime = current.toLocalDateTime();
        System.out.println(localDateTime);

        ZoneId zone = current.getZone();
        System.out.println(zone);

        ZoneOffset offset = current.getOffset();
        System.out.println(offset);


    }
}

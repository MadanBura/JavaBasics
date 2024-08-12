package Java8_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate_Example {

    public static void main(String[] args) {


        LocalDate todays_Date  = LocalDate.now();
        System.out.println(todays_Date);

        LocalDate customDate = LocalDate.of(1999,9,24);
        System.out.println(customDate);

        int dayOfMonth = todays_Date.getDayOfMonth();
        Month month = todays_Date.getMonth();
        int year = todays_Date.getYear();

        System.out.println(dayOfMonth+" "+month+" "+year);

        LocalDate yesterday = todays_Date.minusDays(1);
        System.out.println(yesterday);

        LocalDate pastDate = todays_Date.minusMonths(25);
        System.out.println(pastDate);

        if(pastDate.isLeapYear()){
            System.out.println("Yes it is Leap year >> ");
        }else {
            System.out.println("it is not >> ");
        }




    }
}

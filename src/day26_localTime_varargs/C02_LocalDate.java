package day26_localTime_varargs;

import java.time.LocalDate;
import java.time.LocalTime;

public class C02_LocalDate {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.isLeapYear());
        LocalDate date2 = LocalDate.of(2224,10,10);
        System.out.println(date2.isLeapYear());
        System.out.println(date.plusYears(1).plusMonths(1).plusDays(0));
        System.out.println(date.minusMonths(3).minusDays(3));

        System.out.println(date.getDayOfYear());  // Yilin 76. gunu
        System.out.println(date.getMonth()); // MARCH
        System.out.println(date.getMonthValue()); // 3 (yani 3. ay)

        LocalDate date3 = LocalDate.of(1982,5,4);
        System.out.println(date3.getDayOfWeek()); // TUESDAY
        System.out.println(date.isBefore(date3)); // false
        System.out.println(date.isAfter(date3)); // true


    }
}

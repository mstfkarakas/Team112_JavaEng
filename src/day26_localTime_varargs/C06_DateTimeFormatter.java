package day26_localTime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C06_DateTimeFormatter {
    public static void main(String[] args) {
        // Java tarih ve zamani kendi formatinda olusturur. Bizim cevirmemize izin verir. Bunun icin DateTime Formatter class'i vardir.

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);  // 2023-03-17T04:40:59.201826400
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d / MMM / yyyy");
        System.out.println(ldt.format(dtf));  // 17 / Mar / 2023

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd.MM.yy");
        System.out.println(ldt.format(dtf2));  // 17.03.23

        // d is for the number of the day without zero. dd is with zero for less than 10.
        // DDD yilin kacinci gunu oldugunu yazdirir
        // same for m or mm for month
        // MMM is for first three letters of the month such as APR, AUG
        // MMMM is for the entire month name
        // mm is used for minutes !!!!
        // mm a is used for AM or PM
        // yy for the last two digits of the year
        // yyyy for the entire year

        // h 12 saat uzerinden, H 24 saat uzerinden saati yazar.
        // E, EE, EEE gun isminin ilk 3 harfi
        // EEEE gun isminin tamami

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEEE HH:mm");
        System.out.println(ldt.format(dtf3)); // Friday 04:55

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("EEE h:mm a");
        System.out.println(ldt.format(dtf4)); // Fri 4:55

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("EEEE hh:mm a");
        System.out.println(ldt.format(dtf5)); // Friday 05:00 AM



    }
}

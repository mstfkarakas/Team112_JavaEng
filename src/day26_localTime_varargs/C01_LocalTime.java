package day26_localTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime hour1 = LocalTime.of(20,15);  // 20:15
        System.out.println(hour1);

        LocalTime hour = LocalTime.now(); // Kod calistigi andaki saati verir.
        System.out.println(hour); // 23:42:51.176901500
        System.out.println(hour.getHour()); //23
        System.out.println(hour.plusHours(2).plusMinutes(10)); // 01:52:51.176901500
        System.out.println(hour.minusMinutes(10).minusHours(2)); // 21:32:51.176901500
        System.out.println(hour.withSecond(0).withNano(0)); // 23.42  burda saniyeyi ve nano'yu sifirladi.
        System.out.println(hour.isAfter(hour1)); // suanki bilgisayar saati (23.42), hour1'e atanan 20:15'ten sonradir.
        System.out.println(hour.toSecondOfDay());  // bilgisayar saatine kadar o gunde gecen saniyeleri sayar.


    }
}

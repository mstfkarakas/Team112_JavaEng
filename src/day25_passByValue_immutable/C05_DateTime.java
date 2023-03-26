package day25_passByValue_immutable;

import java.time.LocalTime;

public class C05_DateTime {
    public static void main(String[] args) {

        LocalTime hour = LocalTime.now();
        System.out.println(hour);  // 15:57:40.156898600

        System.out.println(hour.getNano());  // 805813300 Nano saniyeyi verir

        // Asagidaki islem kac NANO SANIYE surer?
        // Basinda ve sonundaki Local time'i alarak hesaplariz.
        // Bu islemin calismasi icin, for loop bittiginde yeniden LocalTimeNOW almamiz lazim.

        int startTime = hour.getNano();

        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }
        LocalTime newHour = LocalTime.now();
        int endTime = newHour.getNano();

        System.out.println("For Loop islem suresi, Nano saniye olarak: " + (endTime-startTime));





    }
}

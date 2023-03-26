package day26_localTime_varargs;

import java.time.LocalDate;
import java.util.Scanner;

public class C03_KimBuyuk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk kisinin ismini giriniz: ");
        String name1 = scan.nextLine();

        System.out.println("Ikinci kisinin ismini giriniz: ");
        String name2 = scan.nextLine();

        System.out.println("Ilk kisinin dogum gununu gun,ay,yil olarak girin: ");
        int gun = scan.nextInt();
        int ay = scan.nextInt();
        int yil = scan.nextInt();
        LocalDate date1 = LocalDate.of(yil,ay,gun);

        System.out.println("Ikinci kisinin dogum gununu gun,ay,yil olarak girin: ");
        gun = scan.nextInt();
        ay = scan.nextInt();
        yil = scan.nextInt();

        LocalDate date2 = LocalDate.of(yil,ay,gun);

        System.out.println(date2.isAfter(date1) ? "Buyuk olan " + name1 : "Buyuk olan: " + name2);

    }
}

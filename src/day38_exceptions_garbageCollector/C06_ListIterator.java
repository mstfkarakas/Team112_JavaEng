package day38_exceptions_garbageCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C06_ListIterator {
    public static void main(String[] args) {

        // ListIterator'da cok fazla metod oldugu icin cok kullanisli.
        // Normal Iterator kullanmayiz.

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(7);

        // tum elementleri index kullanmadan 3 artirin

        ListIterator lit = sayilar.listIterator();
        while (lit.hasNext()) {
            Integer sayi = (Integer) lit.next();
            lit.set(sayi+3);
        }
        System.out.println(sayilar);
    }
}

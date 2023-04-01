package day38_exceptions_garbageCollector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C05_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        //  su anda liste bos. Asagida eleman ekliyoruz.

        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(7);

        // cift sayilari siliniz.  [5, 1, 7] bulmak istiyoruz.

        Iterator it1 = sayilar.iterator();

        while (it1.hasNext()) {  // = yaninda eleman oldugu muddetce ilerle
            //  it1.next();  // next() metodu en soldan baslayip sag yanindaki elemani bize getirir.

            Integer sayi = (Integer) it1.next();  // objenin sayi oldugunu biliyoruz, atama yapip sayiya cevirmeliyiz.

            if (sayi % 2 == 0) {
                it1.remove();
            }
        }
        System.out.println(sayilar);
    }
}

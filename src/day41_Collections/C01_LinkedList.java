package day41_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        Collections objeleri bir arada tutuan yapılardır.
        Günlük hayatta karşılaşılan durumlarla ilgili oluşan ihtiyaçlara göre farklı collections yapıları vardır.
        Bir uygulamada hangi collection'ı kullancağımıza biz özelliğine göre karar veririz.
        3 ana collection'dan bahsedebiliriz
            1-List
            2-Queue
            3-Set
            3 Interface ile kuralları belirleniyor.
        Interface'lerden obje oluşturamadığımız için childclass'lardan conctructor'larını  kullanılır
        Özellikleri constructor'lar değil DATA TÜRÜ olarak seçtiğimiz collection belirler.
         */

        // LinkedList<> List&Queue&Deque interface'lerinin childclass'i oldugu icin objeyi orda olusturuyoruz.
        LinkedList<String> linked1 = new LinkedList<>();
        List<String> linked2 = new LinkedList<>();
        Queue<String> linked3 = new LinkedList<>();
        Deque<String> linked4 = new LinkedList<>();
    }
}

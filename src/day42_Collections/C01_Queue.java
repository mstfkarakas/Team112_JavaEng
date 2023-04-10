package day42_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        // Queue interface'i sirayla islem yapar. Her yeni geleni en sona koyar.
        // Priority Queue ise en basa yazar. Acil bir hastanin ilk muayene sirasina gecmesi gibi.

        Queue<String> harfler = new LinkedList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("A");

        System.out.println(harfler); // [A, B, C, A]

        // index girerek ekleme yapamayiz. Cunku Queue her zaman sona ekler, araya eklemez.

// remove method'u ilk gordugunu siler ve sildigini yazdirir.
        System.out.println(harfler.remove()); // A
        System.out.println(harfler);

        harfler.add("K");
        harfler.add("L");


// element() method'u. queue bos ise exception firlatir.
// peek() de ayni isi yapar ama exception firlatmaz, null dondurur.
        System.out.println(harfler.element()); // ilk elemani dondurur ama silmez.
        System.out.println(harfler.peek());
        System.out.println(harfler);

// let's create an empty queue:
        Queue<String> karakterler = new LinkedList<>();
        System.out.println(karakterler.peek()); // null
//      System.out.println(karakterler.element()); // NoSuchElementException

// poll() method'u ilk elemani siler ve dondurur, queue bos ise null dondurur.
        System.out.println(harfler);        // [B, C, A, K, L]
        System.out.println(harfler.poll()); // B
        System.out.println(harfler);        // [C, A, K, L]

    }
}

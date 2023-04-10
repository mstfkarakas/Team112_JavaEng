package day42_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {

        // Deque Double-ended queue

        Deque<String> harfler = new LinkedList<>();
        harfler.add("J");
        harfler.add("K");
        System.out.println(harfler); // [J, K]

        harfler.addFirst("B");
        System.out.println(harfler.remove()); // ilk elemani kaldirir ve dondurur

        harfler.addLast("T"); // T'yi sona ekler

        System.out.println(harfler); // [J, K, T]

        System.out.println(harfler.removeFirstOccurrence("T")); // true.    ilk buldugu T'yi siler
        System.out.println(harfler); // [J, K]
        System.out.println(harfler.removeLastOccurrence("T"));  // false.   son buldugu T'yi siler, yoksa false dondurur// .

        System.out.println(harfler.peekFirst()); // J
        System.out.println(harfler.peekLast()); // K


        LinkedList<String> karakterler = new LinkedList<>();

        karakterler.add("*");
        karakterler.add("?");
        System.out.println(karakterler);
        karakterler.push("&");
        System.out.println(karakterler); // [&, *, ?]

        LinkedList<String> copy = (LinkedList<String>) karakterler.clone(); // (LinkedList<String>) ile cast ediyoruz.
        System.out.println(copy); // [&, *, ?]


    }
}

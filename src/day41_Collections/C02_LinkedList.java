package day41_Collections;

import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
        /*
        List data türünde bir linkedlist oluşturalım
         */
        List<String> harfler=new LinkedList<>();
        harfler.add("H");
        harfler.add("K");
        harfler.add("M");
        harfler.add("L");
        System.out.println(harfler); //[H, K, M, L]
        harfler.add("B");
        System.out.println(harfler); // [H, K, M, L, B]

        harfler.add(3, "T");
        System.out.println(harfler); // [H, K, M, T, L, B]

        harfler.set(3, "R");
        System.out.println(harfler); // [H, K, M, R, L, B]

        System.out.println(harfler.size()); // 6

        List<String> semboller = new LinkedList<>();

        semboller.add("*");
        semboller.add("B");
        semboller.add("%");
        semboller.add("&");

        System.out.println(semboller); // [*, B, %, &]

// retainAll methodu: common element'leri korur digerlerini siler.

        System.out.println(harfler.retainAll(semboller)); // true yani islemi yaptigini soyluyor. Ortak eleman bulamazsa herseyi silmis olur.
        System.out.println(harfler); // [B]

// addAll methodu ile bir list'i diger list'e ekliyoruz.

        harfler.addAll(semboller);
        System.out.println(harfler); // [B, *, B, %, &]

// removeAll
        System.out.println(harfler.removeAll(semboller)); // true (semboller'deki butun elemanlari harfler'de bulup siler.)
        System.out.println(harfler); // []

    }
}

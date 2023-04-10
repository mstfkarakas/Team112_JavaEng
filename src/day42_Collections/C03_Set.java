package day42_Collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class C03_Set {
    public static void main(String[] args) {

        // Works like sets in maths.
        // You can't have the same element more than once.

        Set<String> ogrenciler = new TreeSet<>();

        ogrenciler.add("Emre");
        ogrenciler.add("Kerem");
        ogrenciler.add("Duygu");
        ogrenciler.add("Burcu");

        System.out.println(ogrenciler); //  [Burcu, Duygu, Emre, Kerem]. Dogal siralama yapti;alfabetik
        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler); //  [Ahmet, Burcu, Duygu, Emre, Kerem]
        ogrenciler.add("Kerem");
        System.out.println(ogrenciler); //  [Ahmet, Burcu, Duygu, Emre, Kerem].


    }

}

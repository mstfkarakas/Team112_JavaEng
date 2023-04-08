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


    }
}

package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C02_StringSplitMethod {
    public static void main(String[] args) {

        // Bir String'i istedigimiz parcalara ayirmak icin kullanilir

        String str= "Java candir can, bundan suphesi olan var mi?";

        // str kac kelimedir?

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words)); // [Java, candir, can,, bundan, suphesi, olan, var, mi?]
        System.out.println("Number of words in the array is " + words.length);

        int longestElement = words[0].length();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length()>longestElement) {

               longestElement = words[i].length();

            }
        }
        System.out.println("Longest word is: " + longestElement + " characters long.");

        // bir string'i karakterlerine ayirmak istersek HICLIK kullaniriz ("")

        String[] characters = str.split("");

        System.out.println(Arrays.toString(characters)); // [J, a, v, a,  , c, a, n, d, i, r,  , c, a, n, ,,  , b, u, n, d, a, n,  , s, u, p, h, e, s, i,  , o, l, a, n,  , v, a, r,  , m, i, ?]
        System.out.println("Cumledeki karakter sayisi: " + characters.length);  // 44

        // String'in de karakter sayisini yazdirsak yukari ile ayni olur.
        System.out.println(str.length());  // 44
    }
}

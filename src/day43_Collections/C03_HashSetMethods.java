package day43_Collections;

import java.util.HashSet;
import java.util.Set;

public class C03_HashSetMethods {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        set1.add("Kadir");
        set1.add("Yusuf");
        set1.add("Suleyman");
        set1.add("Emre");
        set1.add("Duygu");
        set1.add(null);

        System.out.println(set1); // [null, Suleyman, Duygu, Yusuf, Kadir, Emre]

        set1.add("Emre"); // Emre'yi tekrar ekledik.
        System.out.println(set1); // [null, Suleyman, Duygu, Yusuf, Kadir, Emre] Onceki Emre'yi silip yerine yeni Emre'yi ekler.


    }
}

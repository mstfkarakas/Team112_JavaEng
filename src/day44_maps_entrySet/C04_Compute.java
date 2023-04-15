package day44_maps_entrySet;

import java.util.Map;
import java.util.TreeMap;

public class C04_Compute {
    public static void main(String[] args) {

        Map<String , Integer> ornekMap = new TreeMap<>();

        ornekMap.put("A", 20);
        ornekMap.put("B", 15);
        ornekMap.put("K", 25);
        ornekMap.put("M", 20);
        ornekMap.put("T", 30);

        System.out.println(ornekMap); // {A=20, B=15, K=25, M=20, T=30}

        // eger map'de A varsa degerini 40 yapin

        // ornekMap.put("A",40); // varsa update eder, yoksa ekler ama biz bu yontemi kullanmiycaz:

        ornekMap.computeIfPresent("A", (k,v) -> 40 );  // we can also write v=40
        System.out.println(ornekMap); // {A=40, B=15, K=25, M=20, T=30}

        // map'de B yoksa B'yi deger olarak 50 ile ekle
        ornekMap.putIfAbsent("B", 50); // B yoksa 50 degeri ile ekler ama varsa bisey yapmaz.
        System.out.println(ornekMap);  // {A=40, B=15, K=25, M=20, T=30}

        ornekMap.computeIfAbsent("B", v -> 50); // B yoksa 50 degeri ile ekler ama varsa bisey yapmaz.
        System.out.println(ornekMap);  // {A=40, B=15, K=25, M=20, T=30}



    }
}
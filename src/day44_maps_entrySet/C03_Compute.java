package day44_maps_entrySet;

import java.util.Map;
import java.util.TreeMap;

public class C03_Compute {
    public static void main(String[] args) {

        // verilen bir String array'de her bir harfin kacar defa kullanildigini yazdirin
        // Ornek : String[] arr = {"A","C","B","N","A","N","A"}
        //               Output : A=3, B=1, C=1, N=2

        String[] arr = {"A", "C", "B", "N", "A", "N", "A"};

        Map<String, Integer> letterCount = new TreeMap<>();
// FIRST METHOD
        // contains kullanarak yapalim.
        // arr'deki her bir elemani ele alalim

        for (String each : arr) {

            // eger ele aldigim element map'de yoksa
            // map'e element, 1 eklerim

            if (!letterCount.containsKey(each)) {
                letterCount.put(each, 1);
            } else {
                // element daha once map'de varsa, lettercount'i bir artirmamiz lazim
                int oldLetterCount = letterCount.get(each);  // A'yi istersek, bize 1'i verir. Biz bu degeri artiricaz
                letterCount.put(each, oldLetterCount+1); // her bir element'e eski kullanim miktari arti 1 ekler, boylde devam eder.
            }
        }
        System.out.println(letterCount);

// SECOND METHOD using COMPUTE

        Map<String, Integer> computeMap = new TreeMap<>();

        for (String eachHarf : arr) {

            computeMap.computeIfPresent(eachHarf, (k,v) -> v+1); // varsa 1 artiracak. (k,v)'deki k&v random harfler.
            computeMap.putIfAbsent(eachHarf,1); // yoksa ekleyecek ve 1 degeri atayacak

        }
        System.out.println("Second method results: ");
        System.out.println(computeMap);

    }
}

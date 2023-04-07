package day40_Maps;

import day39_maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C01_Update {
    public static void main(String[] args) {

        Map<Integer, String> okulMap = MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);
        // {101=Ali-Cem-10-H-MF, 102=Veli-Can-10-M-TM, 103=Ali-Can-11-M-Soz, 104=Ayse-Cem-11-H-TM, 105=Ayse-Han-10-H-MF, 106=Veli-Han-10-H-MF}

        // 1- Once value'leri bir Collection olarak kaydedelim
        // 2- Her bir value'yu split ile array'e donusturelim
        // 3- Sube bilgisi eskiSube olanlari yeniSube yapalim
        // 4- array'deki bilgileri bilgilestirerek, yeniden map'e ekleyelim
        // 5- okulMap'inin son halini return edelim
        // 6- return edilen yeni halini eski okulMap'e assign edelim

        System.out.println(okulMap.get(101));  // Ali-Cem-10-H-MF
        okulMap.put(101, "Ali-Cem-10-M-MF"); // What does this do?
        System.out.println(okulMap); // Bu class'da kalici degisiklik yapar. 101 key'ine yeni value'muzu ekler.
        okulMap.put(102, "Kemal-Can-11-M-Soz"); // Yine 102 key'ine yeni value'leri atar.
        System.out.println(okulMap);

        //Method yazalim, Intellij method'u otomatik olustursun;
        okulMap = MapMethodDepo.topluSubeDegistirme(okulMap, "M", "N"); // okulMap'i yolladik, eskiSube'yi yolladik ve yeniSube'yi yolladik.

        System.out.println(okulMap);

    }
}

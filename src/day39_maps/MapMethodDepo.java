package day39_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodDepo {

    public static Map<Integer, String> ornekMapOlustur() {

        Map<Integer, String> okulMap = new HashMap<>();

        okulMap.put(101, "Ali-Cem-10-H-MF");
        okulMap.put(102, "Veli-Can-10-M-TM");
        okulMap.put(103, "Ali-Can-11-M-Soz");
        okulMap.put(104, "Ayse-Cem-11-H-TM");
        okulMap.put(105, "Ayse-Han-10-H-MF");
        okulMap.put(106, "Veli-Han-10-H-MF");

        return okulMap;
    }

    public static void subeOgrenciListesiYazdir(Map<Integer, String> okulMap, String istenenSube) {
        // 1- value'lari ayri bir collection olarak kaydedelim
        Collection<String> valueCollection = okulMap.values();
        // [Ali-Cem-10-H-MF, Veli-Can-10-M-TM, Ali-Can-11-M-Soz, Ayse-Cem-11-H-TM, Ayse-Han-10-H-MF, Veli-Han-10-H-MF, Kerem-Umut-12-K-MF]

        // 2- her bir value'u split ile bir array'e donusturelim

        System.out.println("========Sube Listesi=======");
        System.out.println("# Sinif Isim Soyisim");
        int siraNo = 1;
        for (String eachValue : valueCollection) { // example: Ali-Cem-10-H-MF
            String[] valueArr = eachValue.split("-"); // [Ali, Cem, 10, H, MF]

            // 3- array'den sube'yi kontrol edip
            //    eger istenen sube ise ogrencinin sinif isim ve soyismini yazdiralim

            if (valueArr[3].equalsIgnoreCase(istenenSube)) {
                System.out.println(siraNo + " - " + valueArr[2] + ", " + valueArr[0] + ", " + valueArr[1]);
                siraNo++;
            }
        }

    }

    public static Map<Integer, String> topluSubeDegistirme(Map<Integer, String> okulMap, String eskiSube, String yeniSube) {

        // 1- once key'leri bir Set olarak kaydedelim
        Set<Integer> okulKeySeti = okulMap.keySet(); // [101, 102, 103, 104, 105, 106]

        for (Integer eachKey : okulKeySeti) {
            // 2- her bir key'e ait value'yu split ile array'e donusturelim
            String[] valueArr = okulMap.get(eachKey).split("-"); // [Ali, Cem, 10, M, MF]
            // 3- sube bilgisi eskiSube olanlari yeniSube yapalim
            if (valueArr[3].equalsIgnoreCase(eskiSube)) { // eskiSube'yi M olarak belirledik
                valueArr[3] = yeniSube; // [Ali, Cem, 10, N, MF]   yeniSube'yi de N olarak belirledik.
            }

            // 4- array'deki bilgileri "-" ile birlestirelim,
            // Ali-Cem-10-N-MF

            String yeniValue = "";
            for (int i = 0; i < valueArr.length - 1; i++) {
                yeniValue += valueArr[i] + "-";
            }
            yeniValue += valueArr[valueArr.length - 1];

            // yeniValue'lerimizi yeniden map'e ekleyelim
            okulMap.put(eachKey, yeniValue);
        }

        // 5- okulMap'inin son halini return edelim
        return okulMap;
    }

    public static Map<Integer, String> yilSonuSiniflariDegistir(Map<Integer, String> okulMap) {

        // 1- key'leri bir Set olarak kaydedelim
        Set<Integer> keySeti = okulMap.keySet(); // [101, 102, 103, 104, 105, 106]

        for (Integer eachKey : keySeti) {  // Ali-Cem-10-H-MF
            // 2- Set'deki her bir key'e ait value'yu for-each loop ile ele alalim
            // 3- her key'e ait value'yu split() ile ayirip, array olarak kaydedelim
            String[] valueArr = okulMap.get(eachKey).split("-");    // [Ali, Cem, 10, M, MF]

            // 4- array olarak kaydettigimiz bilgilerde istenen update'i yapalim
            if (valueArr[2].equalsIgnoreCase("12")) {
                valueArr[2] = "Mezun";
            } else { // "9", "10", "11"
                int sinif = Integer.parseInt(valueArr[2]);
                sinif++;
                valueArr[2] = sinif + "";  // Hiclik ekleyerek integer olan sinif degerini geri String'e cevirdik.
            } // yeni value // [Ali, Cem, 11, M, MF] oldu

            // 5- array'in yeni halini String olarak birlestirip yeniValue elde edelim

            String yeniValue = "";
            for (int i = 0; i < valueArr.length - 1; i++) {
                yeniValue += valueArr[i] + "-";
            }
            yeniValue += valueArr[valueArr.length - 1];


            // 6- her bir key ve yeniValue'yu map'e ekleyerek map'i update edelim
            okulMap.put(eachKey, yeniValue);

        }

        // 7- map'in yeni halini return edelim
        return okulMap;
    }

    public static Map<Integer, String> numaraIleSoyisimDegistir(Map<Integer, String> okulMap, int okulNo, String yeniSoyisim) {

        String istenenOgrenciValue = okulMap.get(okulNo);   // Veli-Can-10-M-TM
        String[] valueArr = okulMap.get(okulNo).split("-"); // [Veli, Can, 10, M, TM]

        valueArr[1] = yeniSoyisim;  // [Veli, Han, 10, M, TM] if yeniSoyisim is Han.

        String yenivalue = "";
        for (int i = 0; i < valueArr.length - 1; i++) {
            yenivalue += valueArr[i] + "-";
        }
        yenivalue += valueArr[valueArr.length - 1];

        okulMap.put(okulNo, yenivalue);

        return okulMap;
    }

    public static void sinifaGoreListeYazdir(Map<Integer, String> okulMap, int istenenSinif) {

        // 1- okulmap'deki entry'leri kaydedelim
        Set<Map.Entry<Integer, String>> okulEntrySeti = okulMap.entrySet();

        // 2- Her bir entry'i ele alip, istenen islemi yaptiralim

        for (Map.Entry<Integer, String> eachEntry : okulEntrySeti) {

            //    System.out.println(eachEntry);
            //    101=Ali-Cem-10-H-MF
            //    102=Veli-Can-10-M-TM
            //    103=Ali-Can-11-M-Soz
            //    etc...


            // isim, soyisim, bolumlerini bir String'e atayalim:

            String value = eachEntry.getValue(); // Ali-Cem-10-H-MF
            String[] valueArr = value.split("-"); // [Ali, Can, 10, M, TM]

            if (valueArr[2].equals(istenenSinif + "")) {

                // no'yu yazdiralim:
                System.out.print(eachEntry.getKey() + " "); // herbir entry'deki key degerlerini yanyana yazdirir. // 101 102 103 etc..

                // isim, soyisim, bolum
                System.out.print(valueArr[0] + " " + valueArr[1] + " " + valueArr[4]);
                System.out.println("");

            }
        }
    }

    public static Map<Integer, String> soyisimleriBuyukYap(Map<Integer, String> okulMap) {

        // Entry'ler ile cozelim:

        Set<Map.Entry<Integer, String>> okulEntrySeti = okulMap.entrySet();
        // herbir Entry'i elden gecirip, sadece soyisimleri buyuk harf yapalim. for each loop gerekir

        for (Map.Entry<Integer, String> eachEntry : okulEntrySeti) {

            // her bir entry'deki value'yu alalim
            String value = eachEntry.getValue(); // Ali-Cem-10-H-MF
            // value'yu array'e cevirelim
            String[] valueArr = value.split("-"); // [Ali, Can, 10, M, TM]
            // array icinde soyismi buyuk harf yapalim

            valueArr[1] = valueArr[1].toUpperCase(); // [Ali, CAN, 10, M, TM]

            eachEntry.setValue(valueArr[0] + " " + valueArr[1] + " " +valueArr[2] + " " +valueArr[3] + " " +valueArr[4] + " ");


        }
        return okulMap;
    }
}
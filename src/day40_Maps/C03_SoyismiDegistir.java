package day40_Maps;

import day39_maps.MapMethodDepo;

import java.util.Arrays;
import java.util.Map;

public class C03_SoyismiDegistir {
    public static void main(String[] args) {

        // 101 no'lu ogrencinin soyismini "Yan" olarak degistir.
        Map<Integer,String> okulMap = MapMethodDepo.ornekMapOlustur();

        System.out.println(okulMap.get(101)); // Ali-Cem-10-H-MF

        String[] valueArr = okulMap.get(101).split("-"); // [Ali, Cem, 10, H, MF]
        valueArr[1] = "Yan";
        System.out.println(Arrays.toString(valueArr)); //  [Ali, Yan, 10, H, MF]

        String yeniValue = "";

        for (int i = 0; i < valueArr.length-1; i++) {
            yeniValue += valueArr[i] + "-";

        } yeniValue += valueArr[valueArr.length-1];

        okulMap.put(101, yeniValue);
        System.out.println(okulMap);
  //    {101=Ali-Yan-10-H-MF, 102=Veli-Can-10-M-TM, 103=Ali-Can-11-M-Soz, 104=Ayse-Cem-11-H-TM, 105=Ayse-Han-10-H-MF, 106=Veli-Han-10-H-MF}

    }
}

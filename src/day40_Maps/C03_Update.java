package day40_Maps;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C03_Update {
    public static void main(String[] args) {

        Map<Integer, String> okulMap = MapMethodDepo.ornekMapOlustur();

        okulMap = MapMethodDepo.numaraIleSoyisimDegistir(okulMap, 102, "Han");

        System.out.println(okulMap);  // Soyisim degismeden onceki hali
        MapMethodDepo.numaraIleSoyisimDegistir(okulMap,102, "Top");
        System.out.println(okulMap);  // Soyisim degistikten sonraki hali

    }
}

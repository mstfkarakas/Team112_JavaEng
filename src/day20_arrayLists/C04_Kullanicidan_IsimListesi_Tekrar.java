package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_Kullanicidan_IsimListesi_Tekrar {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        //liste olarak dondurecek bir method olusturun.

        System.out.println(isimListesiOlusurma());

    }
    public static List<String> isimListesiOlusurma() {

        List<String> isimler = new ArrayList<>();
        String girilenIsim ="";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Listeye isim ekleyin. Bitirmek icin Q'ya basin.");
            girilenIsim = scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("Q")) {
                isimler.add(girilenIsim);
            }

        }while (!girilenIsim.equalsIgnoreCase("Q"));
        return isimler;

    }
}

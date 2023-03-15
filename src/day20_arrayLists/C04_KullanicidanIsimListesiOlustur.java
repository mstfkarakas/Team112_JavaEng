package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullanicidanIsimListesiOlustur {
    public static void main(String[] args) {

        System.out.println(isimListesiOlustur());

    }
    public static List<String> isimListesiOlustur () {

        List<String> isimListesi = new ArrayList<>();
        String girilecekIsim ="";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Listeye eklemek icin isim giriniz: ");
            girilecekIsim = scan.nextLine();

            if (!girilecekIsim.equalsIgnoreCase("q")) {
                isimListesi.add(girilecekIsim);
            }

        }while (!girilecekIsim.equalsIgnoreCase("q"));
        return isimListesi;
    }
}

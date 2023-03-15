package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_IstenmeyeniSil {
    public static void main(String[] args) {
        //  Soru 3- Verilen String bir listede
        //  istenmeyen harf iceren elementleri silip,
        //  kalan kismini list olarak bize donduren bir method olusturun

        List<String> list = C04_Question2_createList_from_userEntries.createListFromUser();
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanilmasini istemediginiz harf girin: ");

        String istenmeyenHarf = scan.next().substring(0,1);  // girilen kelimenin ilk harfini alir

        List<String> clearedList = deleteElementsWithUnwantedLetter(list, istenmeyenHarf); // Once bbu satiri yazdik.
                                                                    // Intellij method'u create yapmayi teklif etti,
                                                                    // ve asagidkai methodu baslatti. !! Siuper

        System.out.println(clearedList);

    }

    public static List<String> deleteElementsWithUnwantedLetter(List<String> list, String istenmeyenHarf) {

        List<String> silinmeyenlerListesi = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).contains(istenmeyenHarf)) {
                silinmeyenlerListesi.add(list.get(i));
            }
        }
        return silinmeyenlerListesi;


    }
}

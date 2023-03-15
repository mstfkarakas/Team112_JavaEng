package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_IstenmeyeniSil_Tekrar {
    public static void main(String[] args) {
// Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
// kalan kismini list olarak bize donduren bir method olusturun

        List<String> list = C04_Kullanicidan_IsimListesi_Tekrar.isimListesiOlusurma();
        Scanner scan = new Scanner(System.in);
        System.out.println(list);
        System.out.println("Istenmeyen harfi giriniz: ");
        String istenmeyenHarf = scan.next().substring(0,1);

        List<String> ayiklanmisList = istenmeyenHarfliKelimeyiSil(list, istenmeyenHarf);
        System.out.println(ayiklanmisList);
    }
    public static List<String> istenmeyenHarfliKelimeyiSil(List<String> list, String istenmeyenHarf) {
        // mesela listemiz ali, veli, ayse, fatma ve istenmeyen harf a
        // for loop ile elementleri ele alirken remove yaparsak
        // list'in uzunlugu degisecegi icin sorun yasariz
        // farkli bir list olusturup, silinmeyecekleri yeni listeye kaydedelim

        List<String> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).contains(istenmeyenHarf))
                newList.add(list.get(i));
        }
return newList;
    }
}
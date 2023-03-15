package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class C04_Question2_createList_from_userEntries {
    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        createListFromUser();


    }
    public static List<String> createListFromUser() {
        List<String> isimler = new ArrayList<>();
        String girilenIsim = "";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Listeye eklemek icin isim giriniz"+ "\nBitirmek icin Q'ya basiniz: ");
            girilenIsim = scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("Q")) {

                isimler.add(girilenIsim);
            }else {
                System.out.println("Isimler listeye eklendi.");
            }

        }while (!girilenIsim.equalsIgnoreCase("Q"));

        System.out.println(isimler);

        return isimler;
    }
}

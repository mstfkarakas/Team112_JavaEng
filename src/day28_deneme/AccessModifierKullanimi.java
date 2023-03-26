package day28_deneme;

import day28_AccessModifier_Encapsulation.C03_Encapsulation_Data;

public class AccessModifierKullanimi {
    public static void main(String[] args) {

        C03_Encapsulation_Data obj = new C03_Encapsulation_Data();
        System.out.println(obj.a); // read
        obj.a = 100; // write

        // System.out.println(obj.satisTutari); // read
        // obj.satisTutari = 100; // write


        /*
            Baska bir classdaki variable veya method'a ulasmak istedigimizde
            - ulasmak istedigimiz class uyesinin static olup olmamasi
              erisim yontemini etkiler
              static ise calssIsmi.uyeIsmi yazarken
              static degilse obje olusturup objeIsmi.uyeIsmi
            - ulasmak istedigimiz uyenin access modifier'i ise
              o uyeye ulasip ulasamayacagimizi belirler
              ulasabilirsek o datayi okuyabilir veya o dataya yeni deger atayabiliriz
         */
    }
}

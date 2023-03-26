package day28_deneme;

import day28_AccessModifier_Encapsulation.C03_Encapsulation_Data;

public class EncapsulationKullanimi {

    public static void main(String[] args) {

        System.out.println(C03_Encapsulation_Data.getIsim());

        C03_Encapsulation_Data obj =new  C03_Encapsulation_Data();
        obj.setSatisTutari(100);
        obj.setSatisTutari(200);
        obj.setSatisTutari(300);


        System.out.println("Toplam satis : "+ obj.getToplamSatis());


    }
}
/*
    C03_EncapsuleDatalar class'indaki
    isim variable'inin degeri gorunsun ama degistirilemesin
    satisTutari ise deger girilebilsin ama girilen degerler sonradan gorulemesin
    Eger bir variable icin read veya write ozelliklerinin
    birbirinden ayrilmasi isteniyorsa
    oncelikle access modifier ile kimsenin ulasamamasini saglayin
    private yaparak kimsenin ulasamayacagini garantiye aldiktan sonra
    READ yetkisi vermek istediklerimiz icin getter()
    WRITE yetkisi vermek istediklerimiz icin setter() olusturmaliyiz
 */

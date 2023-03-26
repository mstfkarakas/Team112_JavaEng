package day29_inheritance;

public class C02_EncapsulationKullanimi {
    public static void main(String[] args) {

        C01 obj = new C01();
        obj.isim = "Melike";  // write yetkisi

        System.out.println(obj.isim);  // read yetkisi

        obj.setSayi(40); // write yetkisini kullanarak 40 atadik.
        System.out.println(obj.getSayi()); // read yetkisi ile de 40'i gorebiliriz.

        /*
            bir class uyesinin public olmasi ile
            private yapilip, getter ve setter method'larinin olusturulmasi
            islevsel acidan ayni sonucu olusturur
            Bazi developer'lar set(write) ve get(read) yekilerinin
            kullanildigini vurgulamak icin
            2.yontemi tercih ederler.
         */

    }
}

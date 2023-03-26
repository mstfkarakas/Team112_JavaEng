package day30_inheritance;

public class BToyota extends Araba{ // Totoya Araba'nin tum ozelliklerine sahip oldu.

    String marka = "Toyota";
    String aku = "Inci aku"; // Mesela Totoya hep Inci aku kullaniyor olsun.
    String lastik = "Bridgestone"; // Mesela Totoya hep Bridgestone lastik kullaniyor olsun.

    public void motor(){

        System.out.println("Toyotalar cevreci toyota motorlar kullanir");
    }

    public void guvenlik(){

        System.out.println("Toyota araclar extra guvenlik onlemleri barindirir");
    }
}

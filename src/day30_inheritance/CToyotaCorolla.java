package day30_inheritance;

public class CToyotaCorolla extends BToyota{

    String lastik="Lassa 205-55-15";
    String model="Corolla";
    String yakit="Corolla dizel,benzinli ve elektrikli olabilir";

    public void motor(){

        System.out.println("Corolla araclar turkiye'de uretilen motor kullanir");
    }

    public void uretimYeri() {

        System.out.println("Corolla araclar Turkiye'de uretilir");
    }

    public static void main(String[] args) {

        CToyotaCorolla corolla=new CToyotaCorolla();
        System.out.println(corolla.lastik); // CToyotaCorolla class'inda oldugu icin burdan alir
        System.out.println(corolla.model); // CToyotaCorolla class'inda oldugu icin burdan alir
        System.out.println(corolla.yakit); // CToyotaCorolla class'inda oldugu icin burdan alir
        corolla.motor();// CToyotaCorolla class'inda oldugu icin burdan alir
        corolla.uretimYeri(); // CToyotaCorolla class'inda oldugu icin burdan alir

        System.out.println(corolla.marka);// BToyota class'indan alir.
        System.out.println(corolla.aku); // BToyota  class'indan alir.
        corolla.guvenlik(); // BToyota  class'indan alir.

        System.out.println(corolla.vites); // Araba  class'indan alir.



    }
}

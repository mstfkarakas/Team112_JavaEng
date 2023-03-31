package day33_pollymorphism;

public class BChild extends AParent {

    @Override
    void method1() {
        super.method1();
        // burada super. olursa hem child hem parent class'daki method1 calisir.
        // parent'taki method1'i calistirmak istemiyorsak, super.'yi silmek lazim

    }

    void method2() {
        // @Override notasyonu kullanilabilir, method silinirse, notasyon CTE verir.


    }
    Integer method3() {

                /*
            Overridden method ile overriding method'un
            isim ve signature'lari ayni olmalidir
            return type ve access modifier
            signature'a dahil degildir
            ancak overriding'de bunlarla ilgili de kurallar vardir
            1- access modifier kurali :
                child parent'i kisitlayamaz
                eger overridden ve overriding method'lari
                private yaparsak
                bu iki method BAGIMSIZ OLARAK calisir
                aralarinda override islemi olmaz
             2- Return type kurali
                return type primitive veya void ise
                iki method'un return type'i AYNI OLMALIDIR
                non-primitive oldugunda
                ya ayni olmali
                veya parent class'daki return Type
                child class'daki return type'in parent'i OLMALI
                (Covariant data)
         */


        return 0;
    }

}


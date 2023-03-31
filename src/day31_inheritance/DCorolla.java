package day31_inheritance;

public class DCorolla extends CToyota{
    String str3 = "Corolla";

    protected DCorolla(){
        System.out.println("Corolla Parametresiz constructor calisti.");
    }

    protected DCorolla(int sayi){
        super(8);
        System.out.println("Corolla int Parametreli constructor calisti.");
    }

    public static void main(String[] args) {
        DCorolla obj1 = new DCorolla(5);
    }
    /*
        Biz gorunur bir constructor olusturdugumuzda
        Java'nin default constructor'i silmesine benzer olarak
        Extends keyword kullanilmis bir class'daki
        herhangi bir constructor'in ilk satirinda
        gozle gorunur bir constructor call yazilmissa
        java default olarak koydugu super()'u siler
        bir constructor'in icinde
        sadece 1 tane constructor call olabilir
        o da ilk satirda olmak zorundadir
        Eger this(parametreler) veya super(parametreler) ile
        constructor call yaptigimizda
        yazdigimiz argument ile uyumlu parametreye sahip
        bir constructor yoksa Java CTE verir
     */

}

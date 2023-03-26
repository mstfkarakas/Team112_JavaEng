package day28_AccessModifier_Encapsulation;

public class C02 {
    public static void main(String[] args) {


        C01 obj = new C01();
        // System.out.println(obj.b); access modifier private
        // System.out.println(C01.c); access modifier private


        obj.str = "tava";
        C01.s = "Tava";

        C01.a = 50;  // Public access modifier oldugu icin ulasabiliyoruz.
        obj.d = 40;  // instance variable'lara obje uzerinden ulasabiliriz. Class uzerinden sadece static variable cagirabiliriz.




    }
}

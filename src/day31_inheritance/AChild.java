package day31_inheritance;
import day30_inheritance.GParent;
public class AChild extends GParent {

    String childStr;
    AChild(){
        // Her class'in parametresiz constructor'inin ilk satirinda gorunmeyen Super() constructor call calisir.
        System.out.println("Day 31 Child class costructor calisti");
    }

    public static void main(String[] args) {
     //   System.out.println(childStr);  childStr static olmadigindan ulasamayiz, obje gerekir.
     //   System.out.println(sayiParent); static degil
     //   System.out.println(sayiGrandparent); static degil

        AChild objeChild = new AChild();

    }



        /*
            Java'da inheritance kullanirken
            child class'daki obje parent class(lar)'daki tum ozelliklere sahip olur
            bunu saglayan Java mekanizmasi super() constructor call'dur.

            Extends keyword kullanan bir class'da
            olusturulan her bir constructor'in ilk satirinda
            biz gormesek bile super() vardir
            super() ==> once parent class'a gidip oradaki parametresiz constructor'i calistir demektir
            bu sekilde child class'daki constructor calistiginda
            extends keyword kullanmayan parent buluncaya kadar
            parent class'lara gider.
         */



}

package day14_methodOverloading_whileLoops;

public class C04_MethodOverloading {
    public static void main(String[] args) {

        /*
            Java overloading kurallari
            1- isim ve parametreleri ayni olan birden fazla method olusturulamaz
            2- data turleri farkli olan parametrelerin yerlerini degistirirsek
               java yeni bir method olarak kabul eder (int, double) (double,int)
            Overloading olan class'larda
            Java hangi method'un calistirilacagina su sekilde karar verir
            1- cagrilan isimde method var mi ?
            2- method call'da kullanilan arguments ile method'lardaki
               parametrelerin %100 uyumlu oldugu var mi ?
            3- argument ile parametre ayni olmasa bile
               verilen argumentleri kabul edecek parametre var mi ?
            4- Casting ile birden fazla method'u kullanabiliyorsa
               daha az casting ile calisacak method'u kullanir
         */

        add(2,3);  // 5
        add(3.4,2.3); // 5.7

        // topla("ali","veli");  CTE bu argument'leri kabul edebilecek parametre yok

        add('a', 'b');  // 195  ASCII tablosuna gore
        add (3f, 4f); // 7.0   double and double method works.

    }

    public static void add (int a, int b) {

        System.out.println("Sum of integer and integer: " + (a + b) );

    }
    public static void add (double a, double b) {

        System.out.println("Sum of double and double: " + (a + b) );

    }
    public static void add (int num1, double num2) {

        System.out.println("Sum of integer and double: " + (num1 + num2) );

    }
    public static void add (double num1, int num2) {

        System.out.println("Sum of double and integer: " + (num1 + num2) );

    }


}

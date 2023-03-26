package day27_stringBuilder;

public class C03_Equals_Compare {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
  //    System.out.println(sb1.capacity());  // 16 + 4 = 20
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1 == sb2); // false. new ile yeni obje olusturuldugu icin her zaman false verir
        System.out.println(sb1 == sb2); // true

        System.out.println(sb1.equals(sb2));  // false.
        // StringBuilder equals methodunu false dondurur. Cunku class'in icinde equals methodu yoktur. Object class'indan cekiyor, o zaman da
        // hep false verir.

        System.out.println(sb1.equals(str));  // false

        // COMPARE TO

        System.out.println(sb1.compareTo(sb2)); // 0
     //   System.out.println(sb1.compareTo(str));  // CTE verir.

        StringBuilder sb3 = new StringBuilder("Hava");
        StringBuilder sb4 = new StringBuilder("Hara");


        System.out.println(sb1.compareTo(sb3)); // 2   Alafabede farkli olan iki harf arasindaki ASCII fark sayisini verir.
        System.out.println(sb1.compareTo(sb4)); // 2
        System.out.println(sb3.compareTo(sb4)); // 4

        // Equals methodunu kullanamadigimiz icin, compare to methodu ile 0 bulursak, iki metin ayni anlamina gelir.




    }
}

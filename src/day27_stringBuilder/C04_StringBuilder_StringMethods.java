package day27_stringBuilder;

public class C04_StringBuilder_StringMethods {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Candir");
        StringBuilder sb2 = new StringBuilder("Java candir");
        System.out.println(sb1.substring(5));

        // sb1 = sb1.substring(5);  CTE. Can't store a String as a StringBuilder

        // TO STRING ile string'e cevirip String metodlarini StringBuilder'lar icin kullanabiliriz.
        // String donduren metodlar kalici degisiklik yapmaz. DIKKAT !!!
        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString())); // true

    }
}

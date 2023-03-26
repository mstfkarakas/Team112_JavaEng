package day26_localTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {

        // Verilen iki sayiyi toplayin yazdiran metod olusturun

        sum(3,5);  // 8
        // sum (3,5,6)  kabul etmez. 3 parameter yok.

    }
    public static void sum (int a, int b) {
        System.out.println(a+b);
    }
}

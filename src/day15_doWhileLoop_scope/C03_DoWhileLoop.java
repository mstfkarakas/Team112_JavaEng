package day15_doWhileLoop_scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
               While loop'da bitis sarti kontrolu her zaman body'den bir fazla calisir
               while loop'da kullanicidan alacagimiz degerlere once bizim deger atamamiz gerekir
               bu da bazan hatalara sebep olur
         */
        int number =3;
        int sum = 0;

        while (number>0) {
            sum += number*number;
            number--;
        }
        System.out.println(sum + " with While Loop");

        // Repeat it with DO WHILE LOOP

        number = 3;  // we reset the number back to 3
        sum = 0;

        do {
            sum += number*number;
            number--;
        } while (number>0);
        System.out.println(sum + " with DoWhile Loop");
    }
}

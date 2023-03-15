package day14_methodOverloading_whileLoops;

public class C05_ForLoop_WhileLoop {
    public static void main(String[] args) {

        // add numbers from 50 to 100 inclusive

        int sum = 0;

        for (int i = 50; i <101 ; i++) {
            sum += i;
        }
        System.out.println("Sum is " + sum + " with For Loop");

        // ayni soruyu while loop ile yapalim
        // for loop'da 3 seyi takip ederiz
        //  1- baslangic degeri
        //  2- bitis sarti
        //  3- artis veya azalis sekli

        sum =0;
        int number=50;
        while (number<=100){
            sum += number;
            number++;
        }
        System.out.println(sum + " with While Loop");

    }
}

package day14_methodOverloading_whileLoops;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // Kullanicidan toplanmak uzere sayilar alin
        // toplam 500 olursa veya 500'u gecerse
        // kac sayi girdigini ve sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        int inputNumber = 0;
        int sum = 0;
        int countInputNumbers = 0;

        while (sum<500) {
            System.out.println("Enter an integer to add: ");
            inputNumber = scan.nextInt();
            sum += inputNumber;
            countInputNumbers++;

        }
        System.out.println(countInputNumbers + " number(s) entered and their sum is: " + sum);

    }
}

package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C07_DoWhileLoop {
    public static void main(String[] args) {
    /*
        // Kullanicidan toplanmak uzere sayilar alin
        // kullaniciya bitirmek icin 0'a basmasini soyleyin
        // kullanici 0'a bastiginda
        // 0 haric kac sayi girildigini ve toplamlarini yazdirin
     */

        Scanner scan = new Scanner(System.in);
        int number = 0;
        int sum = 0;
 //       int numberCount = 0;

        do {
            System.out.println("Enter an integer to add to the sum: ");
            number = scan.nextInt();
            sum += number;

        }while (number!=0);

        System.out.println("Sum is: " + sum);


    }
}
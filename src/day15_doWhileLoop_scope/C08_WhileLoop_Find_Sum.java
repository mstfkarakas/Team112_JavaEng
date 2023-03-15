package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C08_WhileLoop_Find_Sum {
    public static void main(String[] args) {
        /*
        // Kullanicidan toplanmak uzere sayilar alin
        // kullaniciya bitirmek icin 0'a basmasini soyleyin
        // kullanici 0'a bastiginda
        // 0 haric kac sayi girildigini ve toplamlarini yazdirin
     */
        Scanner scan = new Scanner(System.in);
        int number = 1; // first value doesn't affect anything since the user will input
        int sum = 0;

        while (number!=0) {
            System.out.println("Enter a number: ");
            number = scan.nextInt();

            sum += number;
        }
        System.out.println("Sum is: " + sum);

    }
}

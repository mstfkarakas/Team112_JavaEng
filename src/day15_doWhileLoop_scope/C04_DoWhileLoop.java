package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar alin
        // kullaniciya bitirmek icin 0'a basmasini soyleyin
        // kullanici 0'a bastiginda
        // 0 haric kac sayi girildigini ve toplamlarini yazdirin

        Scanner scan = new Scanner(System.in);


        int inputNumber = 1;
        int sum = 0;
        int numberOfNumbers = 0;

        while (inputNumber!=0) {
            System.out.println("Enter integers to sum: " + "\nType 0 to finish.");
            inputNumber = scan.nextInt();

            if (inputNumber!=0) {
                sum += inputNumber;
                numberOfNumbers++;
            }

        }
        System.out.println("The sum of " + numberOfNumbers + " numbers is " + sum);

    }
}

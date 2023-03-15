package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C01_WhileLoop_Sum_of_Digits {
    public static void main(String[] args) {

        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scan= new Scanner(System.in);
        System.out.println("Add a number to add its digits");
        int inputNumber = scan.nextInt();

        int number = inputNumber; // we might use the inputNumber later, so let's create another variable to use
        int onesDigit = 0;
        int sumOfDigits = 0;

        while (number>0) {
            onesDigit = number%10;
            sumOfDigits += onesDigit;
            number /=10;
        }
        System.out.println("The sum of the digits of " + inputNumber + " is " + sumOfDigits);

    }

}

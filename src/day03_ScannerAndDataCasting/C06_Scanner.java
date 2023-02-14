package day03_ScannerAndDataCasting;

import java.util.Scanner;

public class C06_Scanner {

    //Question 7 (Interview)- Take two numbers from the user and change their values (swap).

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int firstNumber = scan.nextInt();

        System.out.println("Please enter the second number");
        int secondNumber = scan.nextInt();

        int tempNumber =0;

        // we will assign second number to tempNumber
        tempNumber = secondNumber;

        // We will assign firstNumber to secondNumber
        secondNumber = firstNumber;

        // We will assign tempNumber to first number
        firstNumber = tempNumber;

        System.out.println("New firstNumber Value : " +firstNumber);
        System.out.println("New secondNumber Value : "+ secondNumber);



    }

}

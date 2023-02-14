package day03_ScannerAndDataCasting;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        //Question 2- Take a double and an int number from the user and print their sum and product.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an int");

        int number1 = scan.nextInt();

        System.out.println("Please enter a double");
        double number2 = scan.nextDouble();

        System.out.println("result of " + number1 + " + " + number2+ " is : "+ (number1+number2));

    }


}

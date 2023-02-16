package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C08_Questions {

    //Question 1- Let's take a positive 4-digit integer from the user and find the sum of the digits


    //  1469

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 4-digit integer");
        int number = scan.nextInt();

        int sum = 0;

        sum = sum + number % 10;
        number = number / 10;

        sum = sum + number % 10;  // ctrl +alt + l  // to make everything tidy
        number = number / 10;

        sum = sum + number % 10;
        number = number / 10;

        sum = sum + number % 10;

        System.out.println("sum of digits : " + sum);


    }


}

package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C04_Questions {

    public static void main(String[] args) {

        //Question 3- Get a number from the user, no matter whatever value the user enters,
        // convert that number to a number between -128 and 127 and print it.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");

        int number = scan.nextInt();

        byte newNumber = (byte) number;

        System.out.println(newNumber);



    }
}

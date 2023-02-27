package day12_forLoops;

import java.util.Scanner;

public class C05_ForLoops {
    public static void main(String[] args) {
        //Question 4- Get positive numbers as starting and ending values from the user,
        // print the sum of all numbers between them, including the borders.
        // Let the program run even if the end value is smaller than the start value

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a starting Number");
        int startingNumber = scan.nextInt();

        System.out.println("Please enter an ending number");
        int endingNumber = scan.nextInt();

        int sum = 0;

        if (startingNumber<endingNumber){

            for (int i = startingNumber; i <=endingNumber ; i++) {
                sum = sum + i;
            }

        } else {

            for (int i = startingNumber; i >=endingNumber ; i--) {
                sum = sum +i;
            }
        }

        System.out.println(sum);


    }
}

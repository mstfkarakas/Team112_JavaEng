package day37_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_MultiExceptions {
    public static void main(String[] args) {


        int sum = 0;
        int counter = 0;
        int input = 0;

        Scanner scan = new Scanner(System.in);

        do {
            try {
                System.out.println("Please enter an integer to find the sum and enter Q or q to end the program: ");
                input = scan.nextInt();
                sum += input;
                counter++;
            } catch (InputMismatchException e) {
               char letter = scan.next().charAt(0);
               if (letter == 'Q' || letter == 'q') {
                   System.out.println("The sum of " + counter+ " is: " + sum);
                   break;
               } else {
                   System.out.println("Pleas enter a number to add or press q to finish!");
               }
            }
        } while (true);

    }
}

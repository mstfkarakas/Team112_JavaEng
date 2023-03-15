package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C02_Find_Sum_of_Digits_While_For_Loops {
    public static void main(String[] args) {
        // Find the sum of digits of a given number using While Loop

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number to find the sum of its digits: ");

        int number = scan.nextInt();
        int sum = 0;

        while (number!=0) {  // Loop should continue unless
            sum = sum + number%10;
            number = number/10;
        }
        System.out.println("The sum of the digits with While Loop is " + sum);


        int numberOfDigits = (number+ "").length();

        for (int i = 1; i <=numberOfDigits ; i++) {
            sum = sum + number%10;
            number = number/10;
        }
        System.out.println("The sum with For Loop is: " + sum);
    }
}

package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C03_CreateMethods_SumOfDigits {

    public static void sumOfDigitsWhileLoop(int number){

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number to find the sum of its digits: ");

        number = scan.nextInt();
        int sum = 0;

        while (number!=0) {  // Loop should continue unless
            sum = sum + number%10;
            number = number/10;
        }
        System.out.println("The sum of the digits with While Loop is " + sum);

    }


}

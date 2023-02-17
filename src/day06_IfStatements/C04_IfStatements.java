package day06_IfStatements;

import java.util.Scanner;

public class C04_IfStatements {

    public static void main(String[] args) {
        //Question 3- Get a number from the user,
        // print “Number divisible by 3” if the number is divisible by 3,
        // “Number divisible by five” if it is divisible by 5.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = scan.nextInt();

        if (number%3==0){
            System.out.println("Number divisible by three");
        }

        if (number%5==0){
            System.out.println("Number divisible by five");
        }



    }
}

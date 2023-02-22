package day08_NestedIfElse_Ternary_SwtichStatements;

import java.util.Scanner;

public class C05_Ternary {
    // Question 6- Get a number from the user and print its absolute value
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();

//        if (number>=0){
//            System.out.println(number);
//        } else {
//            number = number * (-1); // if it is lower than zero, by multiplying it by -1 will make it a positive number
//            System.out.println(number);
//        }

        System.out.println(number>=0 ?  number  :  number * (-1) );


    }







}

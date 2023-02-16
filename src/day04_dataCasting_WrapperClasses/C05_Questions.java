package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C05_Questions {
    public static void main(String[] args) {


        //Question 4- Take two double numbers from the user,
        // divide the first number by the second number and
        // print the integer part of the result of the division operation.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a double number");
        double num1 = scan.nextDouble();

        System.out.println("Please enter another double number");
        double num2 = scan.nextDouble();

        double result = num1/num2;

        System.out.println(result);

        // double :  12,23  >>>>> assign it to an integer, assigment will remove decimals

        int resultInt = (int) result;

        System.out.println(resultInt);



    }
}

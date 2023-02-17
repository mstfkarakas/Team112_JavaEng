package day06_IfStatements;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        // Q1: Take a number from user
        // check if It can be devided by 5. If it is, write "It can be devided by 5;


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();

        if (number%5==0){
            System.out.println(number+" can be divided by 5");

        }





    }


}

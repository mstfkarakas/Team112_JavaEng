package day06_IfStatements;

import java.util.Scanner;

public class C10_IfElseStatements {

    //Question 4- Ask the user to enter a character,
    // print whether the entered character is uppercase or not.


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a Capital letter");
        char chr = scan.next().charAt(0);

        if (chr >= 65  && chr <= 90){
            System.out.println("Yes, It is a capital letter");

        }else {
            System.out.println("It is something else");
        }

    }



}

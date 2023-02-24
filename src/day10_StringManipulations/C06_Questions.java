package day10_StringManipulations;

import java.util.Scanner;

public class C06_Questions {
    public static void main(String[] args) {
        //Question 1: Get a String from the user and the text to be searched.
        // Print whether the String contains the desired text using the indexOf( ) method.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String that you want to search");
        String str1 = scan.nextLine();

        System.out.println("Please enter another String to search for");
        String str2 = scan.next();

        if (str1.indexOf(str2)!=(-1)){
            System.out.println("str1 contains str2");
        }else {
            System.out.println("str1 does not contain str2");
        }








    }
}

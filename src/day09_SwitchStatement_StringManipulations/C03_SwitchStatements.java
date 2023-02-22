package day09_SwitchStatement_StringManipulations;

import java.util.Scanner;

public class C03_SwitchStatements {
    public static void main(String[] args) {

        //Question 6- Get the month number from the user and print the season.


            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a month number to learn the season");
            int monthNumber = scan.nextInt();

            // organiser and case selecters should have same data types.

            switch (monthNumber) {
                case 12:
                case 1 :
                case 2 :
                    System.out.println("Winter");
                    break;
                case 3 :
                case 4 :
                case 5 :
                    System.out.println("Spring");
                    break;
                case 6 :
                case 7 :
                case 8 :
                    System.out.println("Summer");
                    break;
                case 9 :
                case 10 :
                case 11 :
                    System.out.println("Autumn");
                    break;

                default:
                    System.out.println("Incorrect month number is entered");
            }


    }

}

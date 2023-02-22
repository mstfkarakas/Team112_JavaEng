package day09_SwitchStatement_StringManipulations;

import java.util.Scanner;

public class C01_SwitchStatements {
    // ask a letter from user
    // print days staring with the letter
    // if user enters invalid data, print invalid letter
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter");
        char letter = scan.next().charAt(0);

        // Monday, Tuesday,  Wednesday, Thursday, Friday, Saturday, Sunday
        letter = Character.toUpperCase(letter); // this code will turn a lowercase to a capital

//        if (letter == 'F'){
//            System.out.println("Friday");
//        } else if (letter == 'M') {
//            System.out.println("Monday");
//        }else if (letter == 'T') {
//            System.out.println("Tuesday and Thursday");
//        }else if (letter == 'S') {
//            System.out.println("Saturday and Sunday");
//        }else if (letter == 'W') {
//            System.out.println("Wednesday");
//        }else {
//            System.out.println("Invalid letter");
//        }


        switch (letter) {

            case 'F' : System.out.println("Friday");
            break;
            case 'M' : System.out.println("Monday");
            break;
            case 'T' : System.out.println("Tuesday and Thursday");
            break;
            case 'S' : System.out.println("Saturday and Sunday");
            break;
            case 'W' : System.out.println("Wednesday");
            break;
            default  : System.out.println("Invalid letter");

        }
    }
}

package day03_ScannerAndDataCasting;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //Question 5- Take the name, surname and age of the user and print them in the format below.
        //	information entered : J Doe, 44

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name");
        //String name  = scan.nextLine();
        char firstLetter = scan.nextLine().charAt(0);  // J

        System.out.println("Please enter your surname");
        String surname = scan.nextLine();

        System.out.println("Please enter your age");
        int age = scan.nextInt();

        System.out.println("information entered : " + firstLetter + " " + surname + ", " + age);


    }


}

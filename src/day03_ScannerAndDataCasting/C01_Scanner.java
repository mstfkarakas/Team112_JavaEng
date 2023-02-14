package day03_ScannerAndDataCasting;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        //Question 1- Get values in three different data types from the user and print the entered values with their explanations.

        // ask for the name (String) // age (byte) // salary (int)


        // 1) create a scanner object
        Scanner scan = new Scanner(System.in);

        // 2) Inform user
        System.out.println("Please enter your name");

        // 3) store the data
        String name = scan.nextLine();

        System.out.println("Please enter your age");
        byte age = scan.nextByte();

        System.out.println("Please enter your salary");
        int salary = scan.nextInt();

        System.out.println("User's name : " + name);
        System.out.println("User's age : "+ age);
        System.out.println("User's salary : " + salary);









    }


}

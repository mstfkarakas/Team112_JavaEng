package day03_ScannerAndDataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        //Question 3- Take the name, surname and age of the user and print them in the format below.
        //	Your name : John
        //	Your last name: Doe
        //	Your age : 44
        //	Your registration has been successfully completed.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = scan.nextLine();

        System.out.println("Please enter your surname");
        String surname = scan.nextLine();

        System.out.println("Please enter your age");
        int age = scan.nextInt();

//        System.out.println("Your name : " + name);
//        System.out.println("Your last name: "+ surname);
//        System.out.println("Your age : "+age);
//        System.out.println("Your registration has been successfully completed.");

        System.out.println("Your name : "+ name + "\nYour last name: "+ surname+"\n" +
                "Your age : "+ age +"\nYour registration has been successfully completed.");

    }

}

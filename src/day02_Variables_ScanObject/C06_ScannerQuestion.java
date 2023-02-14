package day02_Variables_ScanObject;


import java.util.Scanner;

public class C06_ScannerQuestion {

    public static void main(String[] args) {

        // create a program that saves name and surname of the user then print it on the screen

        //1) create a scanner object
        Scanner scan = new Scanner(System.in);

        //2) inform the user
        System.out.println("Please enter your name and surname");

        //3) To save the data, create a variable and store the data user entered
        String nameAndSurname = scan.nextLine();

        System.out.println("User's name and surname : " + nameAndSurname);










    }

}

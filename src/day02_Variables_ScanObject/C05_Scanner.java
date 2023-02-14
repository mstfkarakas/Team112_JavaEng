package day02_Variables_ScanObject;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        //to take a data from user you should follow three steps

        //1) Create the scanner object
        Scanner scan = new Scanner(System.in);

        //2) Inform user about what you expect
        System.out.println("Please enter your password");

        //3) create a variable to store the data user entered
        // to do that we will use scanner object that we have created
        int userPassword = scan.nextInt();

        // to print what we have received from the user
        System.out.println("User password is : " + userPassword);





    }



}

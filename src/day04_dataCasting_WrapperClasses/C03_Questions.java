package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C03_Questions {
    public static void main(String[] args) {
        //Question 2- Take a letter from the user and print the next 3 letters in the alphabet.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a letter");

        char letter = scan.next().charAt(0);  //a ===> 97

        System.out.println("user entered : " + letter +
                "\nnext letter : "+ (char)(letter+1)+
                "\nnext letter : "+ (char)(letter+2)+
                "\nnext letter : "+ (char)(letter+3));




    }
}

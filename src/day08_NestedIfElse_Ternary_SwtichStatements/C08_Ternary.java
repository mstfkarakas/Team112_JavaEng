package day08_NestedIfElse_Ternary_SwtichStatements;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {
        //Question 3- Ask the user for a letter,
        // if the entered character is lowercase,
        // print it in uppercase, otherwise print the entered letter


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter");
        char letter = scan.next().charAt(0);

        System.out.println(Character.isLowerCase(letter)? Character.toUpperCase(letter) : letter );
        // letter>='a' && letter <= 'z' : Instead of   "Character.isLowerCase(letter" we could have used  letter>='a' && letter <= 'z'


    }

}

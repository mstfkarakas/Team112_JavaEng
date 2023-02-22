package day08_NestedIfElse_Ternary_SwtichStatements;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {
        //Question 1- Get the gender and age from the user.
        // Female, 60 years old and over,
        // Men 65 years and older can retire.
        // Print “You can retire” or “You need to work .. more years to retire”,
        // taking into account gender and age.

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter an age");
        int age = scan.nextInt();

        System.out.println("Please enter the gender: Female : F , Male : M ");
        //String gender = scan.next();
        char gender = scan.next().charAt(0);


        if (gender == 'F' || gender =='f' ) {
            // we will write codes accoridng to Female
            if (age < 18 || age >140){
                System.out.println("Invalid age");

            } else if (age < 60) {
                System.out.println("You need to work "+ (60-age) +" more years to retire");

            } else {
                System.out.println("You can retire");
            }

        } else if (gender == 'M' || gender =='m' ) {
            // we will write codes accoridng to male
            if (age < 18 || age >140){
                System.out.println("Invalid age");

            } else if (age < 65) {
                System.out.println("You need to work "+ (65-age) +" more years to retire");

            }else {
            System.out.println("You can retire");
            }

        } else {
            System.out.println("Invalid gender");
        }


    }

}

package day07_review_ifElseIfStatements;

import java.util.Scanner;

public class C04_IfElseIfStatements {
    public static void main(String[] args) {

        //Question 2- Ask for the user's weight (kg) and height (cm)
        // and calculate the body mass index (weight * 10000 / (height * height))
        // if the body mass index is greater than 30 obese,
        // between 25-30 overweight, between 20-25 normal,
        // if less than 20 print thin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Plese enter your wight as kg");
        int kg = scan.nextInt();

        System.out.println("Please enter your hight as cm");
        int cm = scan.nextInt();;

        int bmi = (kg*10000/(cm*cm));
        System.out.println(bmi);
        
        if (bmi>30){
            System.out.println("obese");
        } else if (bmi>25 ) {
            System.out.println("overweight");            
        } else if (bmi>20) {
            System.out.println("normal");
        }else {
            System.out.println("thin");
        }
    }
}

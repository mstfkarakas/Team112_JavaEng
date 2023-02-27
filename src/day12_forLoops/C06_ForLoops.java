package day12_forLoops;

import java.util.Scanner;

public class C06_ForLoops {
    public static void main(String[] args) {
        //Question 5- Take a number less than 20 from the user and calculate the factorial value of this number.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        int factoriel = 1;


        for (int i = number; i >=1 ; i--) {

            factoriel = factoriel * i;
        }
        System.out.println(factoriel);






    }
}

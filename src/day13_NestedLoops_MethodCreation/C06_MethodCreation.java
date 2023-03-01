package day13_NestedLoops_MethodCreation;

import java.util.Scanner;

public class C06_MethodCreation {
    public static void main(String[] args) {

        add();
        add();
        add();

    }

    public static void add() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pleae enter a number");
        int firstNumber = scan.nextInt();

        System.out.println("Please enter second number");
        int secondNumber = scan.nextInt();

        int result = firstNumber + secondNumber;

        System.out.println(result);
        System.out.println("End of the calculation");

    }

}

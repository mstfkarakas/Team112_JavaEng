package day06_IfStatements;

import java.util.Scanner;

public class C05_IfStatements {

    public static void main(String[] args) {

        //Question 4- Get  each lengths of a triangle’s 3 sides from the user,
        // and if the triangle is equilateral, print "Equilateral Triangle".

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter three sides ");

        int side1 = scan.nextInt();
        int side2 = scan.nextInt(); // ctrl + D to create a copy of the line
        int side3 = scan.nextInt();

        if (side1 == side2 && side2 == side3 && side1>0) {

            System.out.println("Equilateral Triangle");

        }


    }
}

package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C00_Question_Ali_Yilmaz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name =scan.nextLine();
        System.out.println("Enter your surname name: ");
        String surname =scan.nextLine();

        System.out.println(nameConverter(name, surname));

    }

    public static String nameConverter (String name, String surname) {

        String output = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() + " " +
                        surname.substring(0,1).toUpperCase() + surname.substring(1).toLowerCase();

        return output;
    }

}

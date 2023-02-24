package day10_StringManipulations;

import java.util.Scanner;

public class C09_Questions {
    public static void main(String[] args) {
        //Question 2: Get a String from the user and the text to be searched.
        // Check the usage of the desired text in the String and print the appropriate one of the following sentences

        //String does not contain the searched text
        //Searched text used only once in the String
        //Searched text used more than 1 in the String

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first String to be searched");
        String str1 = scan.nextLine();

        System.out.println("Please enter desired text");
        String str2 = scan.next();

        int firstIndex = str1.indexOf(str2);
        int lastIndex = str1.lastIndexOf(str2);

        if (firstIndex==(-1)){
            System.out.println("there isnt any str2 in str1");
        } else if (firstIndex == lastIndex) {
            System.out.println("there is only one str2 in str1");
        }else {
            System.out.println("there is more than one str2 in str1");
        }


    }
}

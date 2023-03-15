package day21_forEachLoop;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C04_Question4 {
    public static void main(String[] args) {
        //Question 4- Take a sentence and a letter from the user,
        // print how many times the letter is used in the sentence,
        // if not, print “the letter is not used in the sentence”.

        String str = "We should work hard to get paid";
        String letter = "x";

        Scanner scan = new Scanner(System.in);
        int counter = 0;

        // split str by using nothing and assign it to an array
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        for (String each: arr
             ) {
            if (each.equalsIgnoreCase(letter)) {
                counter++;
            }
        }
            if (counter == 0) {
                System.out.println("Letter " + letter + " is not used in the sentence.");
            }else {
                System.out.println("Number of times the letter " + letter + " is used is " + counter);

            }




    }
}

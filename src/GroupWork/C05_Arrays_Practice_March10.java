package GroupWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C05_Arrays_Practice_March10 {
    public static void main(String[] args) {
        /*
        7.	Given
        int[] numbers = {1, -4, 5, -2, 9, 5, 6, -3, 8, 7, -4};
        a.	Display all negative values
        b.	Display all positive values
        c.	Find the total of all negative and positive values
        d.	Find the count of all negative and positive values
        e.	 Convert all negative values into positive ones and print all the numbers in an array format
        f.	Accept a number from the user and check whether the entered number is present in the given array or not.
        g.	Check the frequency of number -4 in the given list.

         */

        int[] numbers = {1, -4, 5, -2, 9, 5, 6, -3, 8, 7, -4};

        //  a.	Display all negative values

        for (int each: numbers
             ) {
            if (each<0) {
                System.out.print(each + " ");
            }
        }
        //  b.	Display all positive values
        System.out.println();
        for (int each: numbers
        ) {
            if (each>0) {
                System.out.print(each + " ");
            }
        }

        //  c.	Find the total of all negative and positive values
        System.out.println();
        int negativeSum = 0;
        int positiveSum = 0;

        for (int each: numbers
        ) {
            if (each<0) {
                negativeSum += each;
            }else {
                positiveSum += each;
            }
        }
        System.out.println("Negative sum: " +negativeSum + "\n"+
                " Positive sum: " +positiveSum );

        //  d.	Find the count of all negative and positive values
        int counterNegative =0;
        int counterPositive =0;

        for (int each: numbers
        ) {
            if (each<0) {
                counterNegative++;
            }else {
                counterPositive++;
            }
        }
        System.out.println("Negative: " + counterNegative);
        System.out.println("Positive: " + counterPositive);

        //  e.	Convert all negative values into positive ones
        //      and print all the numbers in an array format


        List<Integer> negativeNumbers = new ArrayList<>();
        for (int each: numbers
        ) {
            if (each<0) {
                negativeNumbers.add(each*-1);
            }
        }
        System.out.println(negativeNumbers); // Liste hali: [4,2,3,4]

        int[] newArr = new int[negativeNumbers.size()]; // Array hali: [0,0,0,0]
        for (int i = 0; i < negativeNumbers.size(); i++) {
            newArr[i] = negativeNumbers.get(i);
        }
        System.out.println(Arrays.toString(newArr)); // [4, 2, 3, 4]

// !!!  Second way. Bunu henuz yapamadik.


        int[] newArray2 = new int [counterNegative]; // counterNegative = 4

        for (int i = 0; i < counterNegative; i++) {
            if (numbers[i]<0) {
                newArray2[i] = numbers[i]*-1;
            }
        }
        System.out.println(Arrays.toString(newArray2)); // [0, 4, 0, 2, 0, 0, 0, 3, 0, 0, 4]



        //  f.	Accept a number from the user and
        //  check whether the entered number is present in the given array or not.
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number to check: ");
        int input = scan.nextInt();
  //    int[] numbers = {1, -4, 5, -2, 9, 5, 6, -3, 8, 7, -4};

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == input) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("The number is not in the list");
        } else {
            System.out.println("The given number appears in the list " + counter + " times");
        }

        //  g.	Check the frequency of number -4 in the given list.

        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == -4) {
                counter++;
            }
        }
        System.out.println("Number of times: " + counter);


    }
}

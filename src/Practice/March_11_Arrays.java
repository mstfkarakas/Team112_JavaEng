package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class March_11_Arrays {
    public static void main(String[] args) {


    /*
        9) Accept five numbers from the user
           Copy the numbers to another array and print it in reverse order
     */
        int[] numbers = {1, 2, 3, 4, 5};
        int[] newNumbers = new int[numbers.length]; // [0 0 0 0 0]

        for (int i = 0; i < newNumbers.length; i++) {
            newNumbers[i] = numbers[i];
        }
        System.out.println(Arrays.toString(newNumbers)); // [1, 2, 3, 4, 5]

        for (int i = newNumbers.length - 1; i >= 0; i--) {
            System.out.print(newNumbers[i] + " "); // 5 4 3 2 1
        }

    }
}

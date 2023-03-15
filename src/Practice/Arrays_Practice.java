package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Practice {
    public static void main(String[] args) {

        int[] intNumbers = new int[5];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < intNumbers.length; i++) {

            System.out.println("Enter integers: ");
            int num = scan.nextInt();
            intNumbers[i] = num;
        }
        System.out.println(Arrays.toString(intNumbers));

    }
}

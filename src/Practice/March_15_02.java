package Practice;

import java.util.ArrayList;
import java.util.Random;

public class March_15_02 {
    public static void main(String[] args) {
        // Create an ArrayList of type Integer and add 10 random numbers to it.
        // Then, use a for loop to find the sum of all the numbers in the ArrayList.

        Random randomTenNumbers = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            int number = randomTenNumbers.nextInt(1, 100);
            //      numbers.add(randomTenNumbers.nextInt());
            numbers.add(number);
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);

    }
}

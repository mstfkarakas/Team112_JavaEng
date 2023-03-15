package GroupWork;

import java.util.Arrays;

public class C04_Arrays_Practice_March10 {
    public static void main(String[] args) {
        /*
        6.	Given
            int[] numbers = {12, 4, 5, 2, 22, 13, 9, 21};
            a.	Find the size of the array
            b.	Display the numbers that are bigger than 15
            c.	Display the numbers that fall within 10 and 20
            d.	Find the maximum number in the given array
            e.	Find the total of all the numbers in the given array
            f.	Find the average of array elements
            g.	Find the count of all even numbers in the given array
         */
        int[] numbers = {12, 4, 5, 2, 22, 13, 9, 21};

        // a.	Find the size of the array
        System.out.println(numbers.length); //8
        System.out.println("-------------");

        // b.	Display the numbers that are bigger than 15
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 15) {
                System.out.print(numbers[i] + " ");
            }
        }

        // c.	Display the numbers that fall within 10 and 20
        System.out.println("-----");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 10 && numbers[i] <= 20) {
                System.out.print(numbers[i] + " ");
            }
        }
        // d.	Find the maximum number in the given array

        System.out.println();
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 1]);  //22
        System.out.println(numbers[numbers.length - 2]);  //21
        System.out.println(numbers[0]);  //2

        // e.	Find the total of all the numbers in the given array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);  // 88

        // f.	Find the average of array elements
        System.out.println(sum / (numbers.length)); // 88/8 = 11
        // g.	Find the count of all even numbers in the given array
        int counter = 0;
        for (int each : numbers) {
            if (each % 2 == 0) {
                System.out.print(each + " ");  // 2 4 12 22
                counter++;
            }
        }
        System.out.println(); // bosluk biraktik
        System.out.println(counter); // 4
    }
}

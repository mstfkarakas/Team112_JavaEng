package day21_forEachLoop;

import java.util.Arrays;

public class C03_Question2 {
    public static void main(String[] args) {
        // Question 2- Create a method that takes the squares of each element in the given int array and prints the
        //sum of its squares.

        int[] arr = {3,5,2,3,1,1};
        sumOfSquares(arr);
    }
    public static void sumOfSquares(int[] array) {

        int sum = 0;
        for (int each: array
             ) {
            sum += each*each;
        }
        System.out.println(sum);


    }


}

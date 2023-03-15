package day19_ArrayLists;

import java.util.Arrays;

public class C09_Question2 {
    public static void main(String[] args) {
        // Question 2- Add the elements with the same index in a given 2 dimensional array and assign these sums to a
        //single-layered array that we will create.
        //input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        //output: [5, 7, 11]

        int [][] arr = {{1,8},{3,4,5},{2,3,6,7}};
        int shortestInnerArray = arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length<shortestInnerArray) {
                shortestInnerArray = arr[i].length;
            }
        }

        int [] arrayOfSums = new int[shortestInnerArray];
        int sumOfSameIndices = 0;

        // to find the sum of elements with the same inner index:

        for (int i = 0; i < arrayOfSums.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               sumOfSameIndices += arr[j][i];
            }
            arrayOfSums[i] = sumOfSameIndices;
            sumOfSameIndices = 0;
        }
        System.out.println(Arrays.toString(arrayOfSums));
    }
}

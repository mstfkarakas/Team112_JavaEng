package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C06_SplitMethod_ENG {
    public static void main(String[] args) {

        String str = "Java is the life, and characters";

        String[] array = str.split(" ");
        System.out.println(Arrays.toString(array));  // [Java, is, the, life]

        int[] array2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(array2));  // [1, 2, 3, 4, 5]

        System.out.println(array.length); // 4


        int longestWord = array[0].length();

        for (int i = 0; i < array.length; i++) {
            if (array[i].length()>longestWord) {
                longestWord = array[i].length();
            }
        }
        System.out.println(longestWord);


    }
}

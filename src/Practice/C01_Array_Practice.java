package Practice;

import java.util.Arrays;

public class C01_Array_Practice {
    public static void main(String[] args) {

        int[] array = new int[6];

        array[0] = 4;
        array[1] = 5;
        array[2] = 6;
        array[3] = 7;
        array[4] = 8;

        System.out.println(Arrays.toString(array));


    }

    // Calismiyor;
    public static void ArrayPractice_1 (int[] array, int numberOfFruits) {
        int[] array2 = new int[9];
        for (int i = 0; i <9; i++) {
            array2[i] = i;
        }
        System.out.println(Arrays.toString(array2));
    }
}

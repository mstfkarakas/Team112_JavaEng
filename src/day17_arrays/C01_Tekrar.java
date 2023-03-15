package day17_arrays;

import java.util.Arrays;

public class C01_Tekrar {
    public static void main(String[] args) {

        int array[] = {3,4,5,6,7,8,9,};

        array = incrementArrays(array,4);
        System.out.println(Arrays.toString(array));

    }
    public static int[] incrementArrays(int[] array,int increase) {

        for (int i = 0; i <array.length ; i++) {

            array[i] += increase;
        }
        return array;
    }


}

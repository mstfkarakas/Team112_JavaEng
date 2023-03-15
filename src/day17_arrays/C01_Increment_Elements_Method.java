package day17_arrays;

import java.util.Arrays;

public class C01_Increment_Elements_Method {
    public static void main(String[] args) {
        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int[] arr = {3,4,5,6};
        arr = increaseElementsOfArray(arr, 2);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] increaseElementsOfArray(int[] array, int incrementAmount){

        for (int i = 0; i < array.length; i++) {
            array [i] += incrementAmount;
        }
        return array;

    }

}

package day16_scope_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_Print_Array_Elements {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,};

        // Print Array as an Array:
        System.out.println(Arrays.toString(arr));  // [1, 2, 3, 4, 5, 6, 7, 8, 9]

  //    Print Arrays' Elements as a list

        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " "); // 1 2 3 4 5 6 7 8 9
        }

    }
}

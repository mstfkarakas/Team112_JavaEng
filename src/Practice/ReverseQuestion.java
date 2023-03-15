package Practice;

import java.util.Arrays;

public class ReverseQuestion {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3};
        int[] reversed = new int[arr.length];

        for (int i = 0, j= reversed.length-1; i < arr.length; i++, j--) {
            reversed[j] = arr[i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}

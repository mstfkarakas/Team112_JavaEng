package day16_scope_arrays;

import java.util.Arrays;

public class C04_Increment_Arrays_Elements {
    public static void main(String[] args) {

        int[] prices = {15,25,30,10,50};
  //    ADD 3 dollars to each price

        for (int i = 0; i < prices.length; i++) {
            prices[i] +=3;
        }
        System.out.println(Arrays.toString(prices)); // [18, 28, 33, 13, 53]


    }

}

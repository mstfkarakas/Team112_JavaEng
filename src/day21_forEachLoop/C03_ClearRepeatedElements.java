package day21_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ClearRepeatedElements {
    public static void main(String[] args) {
  //    Question 1- For the repeating elements in a given array, delete the duplicates, make only one of all the
  //    elements, assign the new version to the old array and print it.

        int[] arr = {2,3,4,5,3,4,5,3,4,5,6,7,8,4,5,6,7,8,9};
        List<Integer> newList = new ArrayList<>();

        for (int each: arr) {
            if (!newList.contains(each)) {
                newList.add(each);
            }
        }
        System.out.println(newList);

        int [] newArr = new int[newList.size()];

        for (int i = 0; i < newList.size(); i++) {

            newArr[i] = newList.get(i);
        }
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }
}

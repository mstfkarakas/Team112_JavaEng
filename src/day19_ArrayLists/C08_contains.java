package day19_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C08_contains {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        int[] arr = {2,3,3,4,5,6,7,8,76,45,3,3,4,4,5,6,78,5};

 //     ADD all the elements of the array to our LIST.

        for (int i = 0; i < arr.length; i++) {
            numbers.add(arr[i]);
        }
        System.out.println(numbers);

        System.out.println(numbers.contains(3)); // true

   //   CLEAR method DELETES ALL the elements in the LIST.

        numbers.clear();
        System.out.println("-----");
        System.out.println(numbers);

    }
}

package day19_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_RepeatedNumbers_ArrayLists {
    public static void main(String[] args) {
        // delete the repeated numbers
        int [] arr = {3,4,5,6,7,3,4,5,3,4,5,5,4,5,6,7,8,9,8,7,8,9,6,5,1,2,1,1};

        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!uniqueList.contains(arr[i])) {
                uniqueList.add(arr[i]);
            }
        }
        System.out.println(uniqueList);
    }
}

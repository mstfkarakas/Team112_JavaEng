package day21_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_CommonElements_in_Arrays {
    public static void main(String[] args) {

        Integer[] arr1 = {2,3,6,7};
        Integer[] arr2 = {3,9,6,3};

        List<Integer> commonElements = new ArrayList<>();

        for (int each1: arr1
             ) {
            for (int each2: arr2
                 ) {
                if (each1 == each2 && !commonElements.contains(each1)) {
                    commonElements.add(each1);
                }
            }
        }
        System.out.println(commonElements);

    }
}

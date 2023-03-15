package day19_ArrayLists;
import day17_arrays.C06_Array_Eleman_Ekle_Method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayLists {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(Arrays.toString(arr));
        arr = C06_Array_Eleman_Ekle_Method.addElement(arr,11);
        System.out.println(Arrays.toString(arr));

    //  Array Lists

        List<String> letters = new ArrayList<>();
        System.out.println(letters);  // []

        letters.add("s");
        letters.add("l");
        letters.add("a");
        System.out.println(letters);  // [s, l, a]

    }
}

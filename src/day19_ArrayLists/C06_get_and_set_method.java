package day19_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_get_and_set_method {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(2);

        System.out.println(numbers.get(0));
        // and the last element

        System.out.println(numbers.get(numbers.size() - 1));

        // UPDATE a value with SET

        System.out.println(numbers.set(1, 7));   // we update the first index with the value 7
        System.out.println(numbers);  // [3, 7, 2]


    }
}

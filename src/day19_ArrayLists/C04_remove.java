package day19_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {

        List<String> letters = new ArrayList<>();

        letters.add("A");
        letters.add("B");
        letters.add("K");

        System.out.println(letters);

        System.out.println(letters.remove("B"));  // true
        System.out.println(letters); // [A, K]

        letters.remove(0);  // removes the zeroth index
        System.out.println(letters);  // [K]

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(56);
        numbers.add(45);

        System.out.println(numbers);

    //    numbers.remove(56);  // it looks for the index 56. Exception
    //    We assign the index to an object when the List is a list of NUMBERS

        Integer numberToBeRemoved = 56;

        numbers.remove(numberToBeRemoved);
        System.out.println(numbers);

    }
}

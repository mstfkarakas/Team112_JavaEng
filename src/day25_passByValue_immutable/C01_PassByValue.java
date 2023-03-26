package day25_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);  // [3,4,5]

        incrementElements(numbers);  // [6, 8, 10]
        // after running incrementElements method
        System.out.println("After incrementElements method: " + numbers);  // Elementlerdeki degisim kalici oldu.  // [6, 8, 10]

        newListAssignment(numbers);  //  [1, 2, 3]
        System.out.println("After newListAssignment method: " +numbers);  // [6, 8, 10]

    }
    public static void incrementElements (List<Integer> numbers){
        // each element should increase by 2.
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, 2*numbers.get(i));
        }
        System.out.println("Increment the elements: " + numbers);

    }
    public static void newListAssignment (List<Integer> numbers) {
        // assign a new list value to the numbers list
        // add elements 1,2,3

        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("With the newListAssignment method: " + numbers);







    }
}

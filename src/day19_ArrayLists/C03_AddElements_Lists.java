package day19_ArrayLists;
import java.util.ArrayList;
import java.util.List;
public class C03_AddElements_Lists {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(2);

        System.out.println(numbers);  // [3,5,2]

        numbers.add(1,7);  // adding 7 to the first index
                                        // so it is now [3,7,5,2]
        System.out.println(numbers);    // [3, 7, 5, 2]

        List <Integer> addOn = new ArrayList<>();

        addOn.add(45);
        addOn.add(67);
        System.out.println(addOn);  // [45, 67]

    // Add one list to another list;

        numbers.addAll(addOn);
        System.out.println(numbers); // [3, 7, 5, 2] + [45, 67]  =  [3, 7, 5, 2, 45, 67]

        numbers.addAll(2,addOn);  // Adds addOn to the second index
        System.out.println(numbers);   //   [3, 7, 45, 67, 5, 2, 45, 67]

        numbers.addAll(0,addOn);  // Adds addOn to the first index
        System.out.println(numbers);   //   [45, 67, 3, 7, 45, 67, 5, 2, 45, 67]



    }
}

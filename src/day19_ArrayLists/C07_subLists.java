package day19_ArrayLists;
import java.util.ArrayList;
import java.util.List;
public class C07_subLists {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(13);
        numbers.add(53);
        numbers.add(2);
        System.out.println(numbers);

        List <Integer > subList = numbers.subList(1,4);
        System.out.println(subList);

    }
}

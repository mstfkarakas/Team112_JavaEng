package day25_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C02_MutableImmutable {
    public static void main(String[] args) {

        String str = "Java is getting more fun each day";

        str.substring(5);
        str.substring(3,15);
        str.startsWith("Java");
        str.toLowerCase();

        System.out.println(str);  // str is still the same.  // Java is getting more fun each day

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);

        System.out.println(numbers);  // still no assignment, but list is not empty anymore. It changed. [5,8]
    }

}

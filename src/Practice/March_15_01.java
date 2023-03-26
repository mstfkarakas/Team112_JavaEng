package Practice;

import java.util.ArrayList;
import java.util.List;

public class March_15_01 {
    public static void main(String[] args) {
        // Create an ArrayList of type String and add 5 elements to it.
        // Then, use a for loop to print each element in the ArrayList.

        ArrayList<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("Ali");
        names.add("Ayhan");

        for (String name : names) {
            System.out.println(name);
        }

    }
}

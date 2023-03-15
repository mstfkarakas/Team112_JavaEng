package Practice;
import java.util.Arrays;
public class Arrays_Exercises_5 {
    public static void main(String[] args) {
      /*  5)Print the names whose first character starts with "D"
            Print the names whose last character ends with "a"
            Print the names that contain "Al" or "el"
            Print the names that have more than or equal to five characters
            Print the longest name in the given array */
        String[] names = {"Alexandra", "Alex", "Daniel", "David",
                "Michel", "Mabel", "Dani", "James",
                "Jim", "Robert", "Linda", "Nora", "Julia"};

        System.out.println("Array elements are: " + Arrays.toString(names));
        for (int i = 0; i < names.length; i++) {
            if (names[i].startsWith("D")) {
                System.out.print(names[i] + " ");
            }
        }

        System.out.println("Names that end with letter \"a\"");
        for (int i = 0; i < names.length; i++) {
        if (names[i].endsWith("a")) System.out.print(names[i] + " ");
        }


    }
}

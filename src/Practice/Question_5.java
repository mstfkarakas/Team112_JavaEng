package Practice;

public class Question_5 {
    public static void main(String[] args) {
        /*
        Given
        String [] names = {"Alexandra", "Alex", "Daniel", "David", "Michel", "Mabel", "Dani", "James",
                           "Jim", "Robert", "Linda", "Nora", "Julia"};
        Print the names whose first character starts with "D"
        Print the names whose last character ends with "a"
        Print the names that contains "Al" or "el"
        Print the names that have more than or equal to five characters
        Print the longest name in the given array
         */

        String [] names = {"Alexandra", "Alex", "Daniel", "David",
                          "Michel", "Mabel", "Dani", "James",
                          "Jim", "Robert", "Linda", "Nora", "Julia"};

        // Print the names whose first character starts with "D"

        for (int i = 0; i < names.length; i++) {
            if (names[i].charAt(0) == 'D') {
                System.out.println(names[i]);
            }
        }

        // Print the names whose last character ends with "a"



    }
}

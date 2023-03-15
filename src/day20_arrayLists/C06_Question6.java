package day20_arrayLists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_Question6 {
    public static void main(String[] args) {
        // Question 6- Create a method that takes a positive integer from the user and returns all positive
        // integers that can divide that integer to us as a list.

        System.out.println(factors());  // this is the last step

    }
    public static List<Integer> factors () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer to find its factors: ");
        int input = scan.nextInt();;

        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= input; i++) {
            if (input%i == 0) {
                factors.add(i);
            }


        }
        return factors;
    }

}

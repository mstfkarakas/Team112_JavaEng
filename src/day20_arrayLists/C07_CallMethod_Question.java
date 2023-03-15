package day20_arrayLists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C07_CallMethod_Question {
    public static void main(String[] args) {
    // Print Good if the number of factors are more than 10
    int number = 100;
    int numberOfFactors = factors2(number).size();
        System.out.println(numberOfFactors);
}
    public static List<Integer> factors2 (int input) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= input; i++) {
            if (input%i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
        // NOT FINISHED
}

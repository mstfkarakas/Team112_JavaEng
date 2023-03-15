package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C08_Fibonacci_again {
    public static void main(String[] args) {
        // [0,1,1,2,3,5,8,13,21,34,55,89, ...]

        System.out.println(listFibonacciNumbers(15));

    }
    public static List<Integer> listFibonacciNumbers (int quantity) {
        List<Integer> fibonacciSequence = new ArrayList<>();

        if (quantity <= 0) {
            System.out.println("Wrong input");
        } else if (quantity == 1) {
            fibonacciSequence.add(0);

        } else if (quantity == 2) {
            fibonacciSequence.add(0);
            fibonacciSequence.add(1);
        }else {
            int firstNumber = 0;
            fibonacciSequence.add(firstNumber);
            int secondNumber = 1;
            fibonacciSequence.add(secondNumber);
            int sum = firstNumber + secondNumber;
            fibonacciSequence.add(sum);

            while (fibonacciSequence.size()<quantity) {

                firstNumber = secondNumber;
                secondNumber = sum;
                sum = firstNumber + secondNumber;
                fibonacciSequence.add(sum);
            }
        }
        return fibonacciSequence;
    }
}

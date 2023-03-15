package day20_arrayLists;
import java.util.ArrayList;
import java.util.List;
public class C08_Fibonacci {
    public static void main(String[] args) {
        // [0,1,1,2,3,5,8,13,21,34,55,89, ...]
        System.out.println(fibonacciNumbers(5));
    }
    public static List<Integer> fibonacciNumbers(int nextNumber) {
        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);
        fibonacciList.add(1);

        int userInput = 8;
        nextNumber = 0;

        for (int i = 3; i < userInput; i++) {
            nextNumber = fibonacciList.get(i - 2) + fibonacciList.get(i - 1);
            fibonacciList.add(nextNumber);
        }
        return fibonacciList;
    }
}
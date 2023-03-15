package GroupWork;

public class C02_WhileLoop {
    public static void main(String[] args) {

        // Print 2-digit positive integers divisible by 7 using while loop.

        int number = 10;

        while (number<100) {
            if (number%7 == 0) {
                System.out.print(number + " ");
            }
            number++;
        }
    }
}

package GroupWork;

import java.lang.Math;
public class C03 {
    public static void main(String[] args) {
        // Ask the user for a number and the power he wants to calculate.
        // Create a method that calculates and prints the desired power of the given number using the while loop.

        int ans1 = (int) Math.pow(2,7);
        System.out.println(ans1);

        power(2,7);

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Input the base of the index: ");
//        System.out.println("Input the power of the index: ");

        int power;
    }
    public static void power(int number, int power) {
        int result = 1;
        int flag = 0;   // tabani kac defa carpacagini buluyor. (power)

        while (flag!=power){
            result *= number;
            flag++;
        }
        System.out.println(result);

    }



}

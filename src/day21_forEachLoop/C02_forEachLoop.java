package day21_forEachLoop;
import java.util.Arrays;
public class C02_forEachLoop {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,3,4,5,6,7,8,9,23,39};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        // find the sum using for each loop
        int sum2 =0;
        for (int each : arr) {sum2 += each;}  // or {sum += each;} using {} braces
        System.out.println(sum2);

        // find the elements divisible by 3

        for (int each: arr
             ) {
            if (each %3 == 0) {
                System.out.print(each + " ");
            }
        }
        System.out.println();
        System.out.println("----------");
        // number of odd numbers in the array using for each loop
        int flag = 0;
        for (int each:arr
             ) {
            if (each %2 != 0) {
                flag++;
            }
        }
        System.out.println("Number of odd numbers: ");
        System.out.println(flag);

    }
}
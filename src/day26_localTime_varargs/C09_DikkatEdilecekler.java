package day26_localTime_varargs;

import java.util.Arrays;

public class C09_DikkatEdilecekler {
    public static void main(String[] args) {
        sum(4,2,3,1,5);
    }
    public static void sum (int c, int ... a) {  // int ... a, int c olmaz.
        // Varargs doymaz, o yuden basa konmaz,
        // kendisinden sonra parametre kabul etmez
        System.out.println(Arrays.toString(a));

        int sum = 0;
        for (int each : a) {
            sum += each;
        }
        System.out.println("The first number times the sum of the rest: " + c*sum); // e.g 4 * 11 for [4, 2, 3, 1, 5]

    }
}

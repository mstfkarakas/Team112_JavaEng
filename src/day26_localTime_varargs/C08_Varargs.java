package day26_localTime_varargs;

import java.util.Arrays;

public class C08_Varargs {
    public static void main(String[] args) {

        // parametrelerin sayisi belli degilse, 3 nokta koyariz
        // int ... a deriz.
        // Varargs bir array'dir.

        sum(1,2); // [1,2]. Argumentlerimizi Array olarak kaydetmis.
        sum(1,2,3);
        sum(1,2,3,4);
        sum(1,2,3,4,5);
        sum(1,2,3,4,5,6);
        sum(1,2,3,4,5,6,7);
        sum(1,2,3,4,5,6,7,8);
    }

    public static void sum (int ... a) {
        System.out.println(Arrays.toString(a)); // Array oldugu icin

        int sum = 0;
        for (int each : a) {
            sum += each;
        }
        System.out.println("The sum: " + sum);
        }
    }
package day16_scope_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String [] names = {"Ali", "Veli", "Berke"};
        int [] numbers = {3,4,5,6,7,8,9,};

        char [] characters = {'e', '4', ','};

        String [] arr = new String[5]; // Uzunluk belirtmek sart. 5 dedik burda

        System.out.println(Arrays.toString(arr)); //  [null, null, null, null, null]

        System.out.println(Arrays.toString(names));  // [Ali, Veli, Berke]
        System.out.println(Arrays.toString(numbers)); // [3, 4, 5, 6, 7, 8, 9]

        int [] a = new int [7];
        System.out.println(Arrays.toString(a));  // [0, 0, 0, 0, 0, 0, 0]

        a[0] = 4;

        System.out.println(Arrays.toString(a));  // [4, 0, 0, 0, 0, 0, 0]

        a[3] = 7;

        System.out.println(Arrays.toString(a));  // [4, 0, 0, 7, 0, 0, 0]
    }
}

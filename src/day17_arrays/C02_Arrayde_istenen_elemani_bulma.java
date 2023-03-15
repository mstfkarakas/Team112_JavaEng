package day17_arrays;

import java.util.Arrays;

public class C02_Arrayde_istenen_elemani_bulma {
    public static void main(String[] args) {

        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {1,2,3,3,2,3,2,2,9,1};
        findAnElement(arr,2);


    }
    public static void findAnElement(int[] array, int element) {
        int counter = 0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i] == element) {
                counter++;
            }
        }
        System.out.println(counter);
    }

}

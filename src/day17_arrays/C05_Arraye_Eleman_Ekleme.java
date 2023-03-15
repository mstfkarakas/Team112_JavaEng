package day17_arrays;

import java.util.Arrays;

public class C05_Arraye_Eleman_Ekleme {
    public static void main(String[] args) {

        /*
            int[] a = {4,5,6};
            int[] b = {4,5,6,10};
            a = b ;
            System.out.println(Arrays.toString(a));
            Array'in uzunlugu degistirilmez
            Ancak array'e yeni bir array degeri atanabilir
         */

        // Verilen array'e istenen elementi ekleyelim

        int[] array = {4,5,6};
        int elementToBeAdded = 10;

        int[] newArray = new int[array.length+1];  // [0,0,0,0]

        for (int i = 0; i < array.length; i++) {

            newArray[i] = array[i];  // newArray[] = {4,5,6,0}
        }
            newArray[newArray.length-1] = elementToBeAdded;
                System.out.println(Arrays.toString(newArray));  // newArray[] = {4,5,6,0}
            array = newArray;
                System.out.println(Arrays.toString(array));
    }
}

package day17_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_Kullanicidan_Al_Array_Olustur {
    public static void main(String[] args) {
        // Kullanicidan array olusturmak uzere pozitif tamsayilar alin
        // kullaniciya islemi bitirmesi icin 0'a basmasi gerektigini soyleyin
        // bir onceki class'dan method kullanarak aldiginiz elementleri arr'e ekleyin

        Scanner scan = new Scanner(System.in);
        int inputNumber = 1;
        int[] arr = new int[0];

        while(inputNumber != 0) {

            System.out.println("Input an integer for the array: "+"\nInput zero to exit: ");
            inputNumber = scan.nextInt();

            if (inputNumber != 0) {
               arr = C06_Array_Eleman_Ekle_Method.addElement(arr,inputNumber);
            }
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

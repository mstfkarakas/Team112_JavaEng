package day17_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C20_Kendim_Tekrar {
    public static void main(String[] args) {

        int[] oldArray = {1,2,4,6,2,7,3};
        System.out.println(Arrays.toString(addingElement(oldArray, 9)));

    }
    public static int[] addingElement (int[] oldArray, int newElement){

        Scanner scan = new Scanner(System.in);

        int[] newArray = new int [oldArray.length+1];
        System.out.println("Enter a new integer element for the array: ");
        newElement = scan.nextInt();

        for (int i = 0; i <oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length-1] = newElement;
        return newArray;

    }

}

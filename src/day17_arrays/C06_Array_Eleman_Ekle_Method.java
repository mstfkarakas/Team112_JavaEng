package day17_arrays;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class C06_Array_Eleman_Ekle_Method {
    public static void main(String[] args) {

        // verilen bir array'e istenen bir elementi ekleyip,
        // yeni halini bize donduren bir method olusturun

        int[] oldArray = {2,4,7,8};

        // Last Step: call the Method;
        oldArray = addElement(oldArray,5);
        oldArray = addElement(oldArray,7);
        oldArray = addElement(oldArray,13);

        System.out.println(Arrays.toString(oldArray));

    }
    public static int[] addElement(int[] oldArray, int itemToBeAdded) {
        int[] newArray = new int[oldArray.length+1];  // [0,0,0,0,0]

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];  // {2,4,7,8,0}

        }
        newArray[newArray.length-1] = itemToBeAdded;   //

        return newArray;
    }

}

package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C08_MDA {
    public static void main(String[] args) {
        String[][] classes = {{"A","B","G","M"},{"F","P","A","V"},{"K","D","Q"}};

 //     Change Q with Y

        classes[2][2] = "Y";
        System.out.println(Arrays.deepToString(classes));

        // number of students:

        int sum = 0;
        for (int i = 0; i < classes.length; i++) {

            sum += classes[i].length;

        }
        System.out.println(sum);


    }
}

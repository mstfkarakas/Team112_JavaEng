package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class March_15_03 {
    public static void main(String[] args) {
        //  Create an ArrayList of type Double and add 5 decimal numbers to it.
        //  Then, use a for loop to calculate the average of all the numbers in the ArrayList.

        Random rndm = new Random();
        ArrayList<Double> dbl = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            double elements = rndm.nextDouble(0, 10);
            dbl.add(elements);
        }
        double sum = 0;
        int quantity = dbl.size();
        for (Double aDouble : dbl) {
            sum += aDouble;
        }
        double average = sum/quantity;
        System.out.println(dbl);
        System.out.println(sum);
        System.out.println(average);


    }
}

package Practice;

import java.util.ArrayList;

public class March_15_04 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("10");
        stringList.add("20");
        stringList.add("35");
        stringList.add("15");
        int sumOfAllNumbers = getSumOfAllNumbers(convertingFromStringIntoInteger(stringList));
    }
    public static ArrayList<Integer> convertingFromStringIntoInteger(ArrayList<String> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (String each : list) {
            int strToInt = Integer.parseInt(each);
            newList.add(strToInt);
        }
        return newList;
    }
    public static int getSumOfAllNumbers(ArrayList<Integer> integers) {
        int sum = 0;
        for (Integer each : integers) {
            sum += each;
        }
        return sum;
    }

}

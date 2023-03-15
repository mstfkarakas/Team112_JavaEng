package day19_ArrayLists;

public class C01_MDA_Questions {
    public static void main(String[] args) {

        int [][] intArr = {{2,3,4,5,},{3,4,5},{2,3},{19}};

        // Create a method that prints the sum of the last elements of each inner array in a given 2
        // dimensional array.

        sumOfLastElements(intArr);

        }
        public static void sumOfLastElements (int [][] intArray) {
            int sum = 0;
            for (int i = 0; i < intArray.length; i++) {
                sum += intArray[i][intArray[i].length-1];
        } System.out.print(sum + " is the sum of the last elements.");
        }
}

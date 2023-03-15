package day18_multiDimensionalArrays;

public class C09_MDA {
    public static void main(String[] args) {

        int[][] arr = {{3,5,7},{1,2,3,4},{1,2},{7}};

        // how many even numbers?

        int evenNumbers = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] %2 ==0) {
                    evenNumbers++;
                    System.out.print("Even numbers are " + arr[i][j] + " ");
                }
            }
        }
        System.out.println("There are " + evenNumbers + " even numbers.");

    }
}

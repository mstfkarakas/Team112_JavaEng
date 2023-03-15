package day18_multiDimensionalArrays;

public class C05_MultiDimensionalArray {
    public static void main(String[] args) {

        int[][] arr = {{3,5,7},{1,2,3,4},{1,2},{7}};

        // toplam element sayisi kactir ?

        int numberOfElements = 0;
        for (int i = 0; i < arr.length; i++) {
            numberOfElements += arr[i].length;
        }
        System.out.println("Element sayisi: " + numberOfElements);

        // tum elementlerin toplamini bulun
        // MDA'lerde her bir elementi elden gecirmek istiyorsak
        // kat sayisi kadar nested for-loop kullaniriz

        int sumOfAllElements=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                sumOfAllElements += arr[i][j];
            }
        }
        System.out.println("Elementler toplami: " +sumOfAllElements);

    }
}

package day12_forLoops;

public class C09_NestedLoops {
    public static void main(String[] args) {

        /*
        1  2  3  4    ===>  1*1   1*2  1*3  1*4
        2  4  6  8    ===>  2*1   2*2  2*3  2*4
        3  6  9  12   ===>  3*1   3*2  3*3  3*4
        4  8  12 16   ===>  4*1   4*2  4*3  4*4


         */
        int number = 10;
        int k = 1;

        for (int j = 1; j <= number; j++) {

            for (int i = 1; i <=number ; i++) {
                System.out.print(j+"*"+i+" ");
            }
            System.out.println();


        }


    }
}

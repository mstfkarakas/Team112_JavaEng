package day05_incrementDecrement_Concatenation;

public class C01_IncrementDecrement {
    public static void main(String[] args) {

        int a = 20;

        // increase the value of a by 3; and assign it to b, then print the b

        a = a + 3; // a += 3;  // a++ , a++ , a++

        int b = a;



        System.out.println("a : " + a + ", b : " + b); // a : 23, b : 23

        // assign a to b, then increase the value of a by 3, then print
        a = 20;

        b = a;
        a += 3;

        System.out.println("a : " + a + ", b : " + b);  // a : 23, b : 20

        // print the value of a, then increase the value of a by 5,
        System.out.println("-----------------------------");
        a= 20;

        System.out.println("a : "+a);  // 20


        a += 5;
        System.out.println("a : "+a);  // 25

        // decrease the value of a by 2, then print it

        a = 20;

        a = a -2; // a-=2

        System.out.println("a : "+a);






    }


}

package day15_doWhileLoop_scope;

public class C06_DoWhileLoops {
    public static void main(String[] args) {

        int startingNumber = 10;

        int sum = 0;

        while (startingNumber < 20) {
            sum += startingNumber;
            startingNumber++;
        }
        System.out.println(sum + " with While Loop");
        startingNumber = 10;
        sum = 0;

        do {
            sum += startingNumber;
            startingNumber++;
        }while (startingNumber<20);

        System.out.println(sum + " with Do While Loop");
    }
}

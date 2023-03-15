package day15_doWhileLoop_scope;

public class C05_DoWhileLoops {
    public static void main(String[] args) {

        int a = 1;

        do {
            System.out.print(a + " ");
            a++;
        } while (a<10);

        System.out.println();

        // With While Loop:
        a=1;
        while (a<10) {
            System.out.print(a + " ");
            a++;
        }

    }
}

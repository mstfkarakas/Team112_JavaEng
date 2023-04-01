package day37_exceptions;

public class C01 {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 0;

        try {
            System.out.println(num1/num2);
        } catch (Exception e) {
            System.out.println("The problem is handled. Go on!");
        }

    }
}

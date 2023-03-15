package Practice;

public class C03_DoWhileLoop__ {
    public static void main(String[] args) {

        int number = 5;
        int sum = 0;

        while (number>0) {

            sum += number*number;
            number--;

        }
        System.out.println(sum);


    }
}

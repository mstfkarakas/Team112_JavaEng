package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C04_DoWhileLoop____ {
    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar alin
        // kullaniciya bitirmek icin 0'a basmasini soyleyin
        // kullanici 0'a bastiginda
        // 0 haric kac sayi girildigini ve toplamlarini yazdirin

  //    first with WHILE LOOP;

        Scanner scan = new Scanner(System.in);

        int number = 1;     // value can be anything but zero.
        int sum = 0;
        int counter = 0;

        while (number!=0) {
            System.out.println("- Input an integer to add to the sum " + "\n- Enter zero to stop: ");
            number = scan.nextInt();
            if (number!= 0) {
                counter++;
                sum += number;
            }
        }
        System.out.println(counter + " numbers were entered and their sum is " + sum);

  //    second with DO WHILE LOOP;

        number = 0;     // reassigning.. The PLUS side of DoWhile Loop is that,
                        // even if the initial value si WRONG, it still works because DoWhile does the work first and then checks.
        sum = 0;        // reassigning
        counter = 0;    // reassigning

        do {
            System.out.println("\"- Input an integer to add to the sum using DoWhile Loop or Enter zero to stop: \"");
            number = scan.nextInt();
            if (number != 0) {
                sum += number;
                counter++;
            }
        }while (number!=0);

        System.out.println(counter + " numbers were added to get " +sum);



    }
}

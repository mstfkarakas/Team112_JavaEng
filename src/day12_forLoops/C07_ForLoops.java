package day12_forLoops;

public class C07_ForLoops {

    public static void main(String[] args) {

        //Question 6- Get a number less than 20 from the user and calculate the factorial value of this number.
        // Also print the configuration of the factorial steps in the console.

        // exp: 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        int number = 6;  // taken from the user

        int factoriel = 1;

        System.out.print(number+"! = ");

        for (int i = number; i >=1 ; i--) {
            factoriel = factoriel * i; // factoriel *=i;

            if (i==1){
                System.out.print(i);
            }else {
                System.out.print(i+" * ");
            }
        }

        System.out.println(" = "+factoriel);


    }
}

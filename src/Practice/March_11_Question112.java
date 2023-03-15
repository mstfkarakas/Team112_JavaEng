package Practice;

public class March_11_Question112 {
    public static void main(String[] args) {
        /*
      12.  Write a program that accepts an array and prints true if it contains 2 or 3
            Sample output
                int[] x = {2,5}; = > true
                int[] y = {4,3}; = > true
                int[] z = {4,5}; = > false
         */
        int[] x = {2,5};

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 2 || x[i] == 3) {
                System.out.println("True");
                break;
            }else {
                System.out.println("False");
            }
        }
    }
}

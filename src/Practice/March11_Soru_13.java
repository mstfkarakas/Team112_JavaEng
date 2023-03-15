package Practice;

public class March11_Soru_13 {
    public static void main(String[] args) {
        /*
     13.   Write a program that accepts an array and
        prints true if the numbers 2 or 3 occur twice.
        Sample output
            int[] x = {2,2}; = > true
            int[] y = {3,3}; = > true
            int[] a = {2,3}; = > false
            int[] b = {12,20,42}; = > false
            int[] c = {2,2,2}; = > false
         */
        int[] x = {2,3,4,2,2,2,2,2,5};

        int counter2 = 0;
        int counter3 = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 2) {
                counter2++;
            } else if (x[i] == 3) {
                counter3++;
            }
        }
        if (counter2 == 2 || counter3 == 2){
            System.out.println("true");
        }else {
            System.out.println("Ne halin varsa gor!");
        }


    }
}

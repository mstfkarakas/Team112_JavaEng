package Practice;

public class March_11_Question11 {
    public static void main(String[] args) {
        /*
        11.    Write a program that accepts an array
            Check the length of the array
            If the length is more than one, then check
                if the first element and the last element are equal.
                    If YES, print true
                    If No, print false
            If the length is NOT more than 1, print not valid an array
         */
        int[] x = {5,3,4,7,8};

        if (x.length > 1) {
            if (x[0] == x[x.length - 1]) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("not a valid array");
        }
    }
}

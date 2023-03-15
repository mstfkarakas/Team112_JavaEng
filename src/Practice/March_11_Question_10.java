package Practice;

public class March_11_Question_10 {
    public static void main(String[] args) {
        /*
    10.    Write a program that accepts an array of type integers from the user and
        returns true if the number 6 appears as either the first or last element in the array.
            Sample output
            int[] x = {1,2,6}; = > true
            int[] y = {6,1,2,3}; = > true
            int[] z = {13,6,1,2,3}; = > false
         */
        int[] x = {1,2,6};
        System.out.println(startsOrEndsWith6(x));
    }
    public static boolean startsOrEndsWith6 (int[] x) {
         boolean flag = false;

        for (int i = 0; i < x.length; i++) {
            if(x[0] == 6 || x[x.length-1] == 6) {
                flag =true;
            }else {
                flag =false;
            }
        }
        return flag;
    }

}

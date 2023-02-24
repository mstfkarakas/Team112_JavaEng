package day10_StringManipulations;

public class C01_subString {
    public static void main(String[] args) {

        String str = "Java is beautiful";

        // there are two ways to use substring method
        // 1. you can enter an index and print the rest starting from that index

        System.out.println(str.substring(3)); // a is beautiful
        System.out.println(str.substring(0)); // Java is beautiful

        System.out.println(str.length()); // 17

        // to see last 3 characters
        System.out.println(str.substring(str.length()-3)); // ful

        System.out.println(str.substring(str.length()));
        //System.out.println(str.substring(18)); // If we try to use an invalid index, it will give an error

        System.out.println(str.substring(8,10));
        System.out.println(str.substring(10,13));
        System.out.println(str.substring(4,14));  // is beauti

        System.out.println(str.charAt(6)); //s
        System.out.println(str.substring(6,7)); //s

        System.out.println(str.substring(2,2));  // nothing  (there is something and it is nothing)

        System.out.println(str.substring(5,1));  // RTE














    }



}

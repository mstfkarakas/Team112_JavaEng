package day13_NestedLoops_MethodCreation;

public class C10_ReverseString {
    // reverse a string

    public static void main(String[] args) {

        System.out.println(reverseString("asdf"));
        System.out.println(reverseString("qwer"));
        System.out.println(reverseString("Java is funny"));

    }

    public static String reverseString(String str) {

        String outPut = "";
        int a = str.length() - 1;

        for (int i = a; i >= 0; i--) {
            outPut = outPut + str.charAt(i);
        }
        return outPut;
    }


}

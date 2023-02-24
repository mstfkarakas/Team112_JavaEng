package day10_StringManipulations;

public class C03_startsWith {
    public static void main(String[] args) {

        String str = "Java is great";

        System.out.println(str.startsWith("java"));  // false
        System.out.println(str.startsWith("Java"));  // true
        System.out.println(str.startsWith("J"));  // true

        String str2 = "Jav";

        System.out.println(str.startsWith(str2)); //true
        System.out.println(str.startsWith(str)); // true

        System.out.println(str.startsWith("")); //true

        System.out.println("=========================");
        System.out.println(str.endsWith("t")); // true
        System.out.println(str.endsWith("eat")); // true
        System.out.println(str.endsWith("")); // true
        System.out.println(str.endsWith("is great")); // true

        System.out.println(str.endsWith(str.substring(str.length()-1))); // true

        System.out.println(str.startsWith("is",5)); // true









    }
}

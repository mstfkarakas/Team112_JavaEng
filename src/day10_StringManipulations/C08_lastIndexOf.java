package day10_StringManipulations;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str = "Java is funny";

        System.out.println(str.lastIndexOf("a")); // 3
        System.out.println(str. indexOf("a",2));  // 1

        System.out.println(str.lastIndexOf("n")); //11
        System.out.println(str.lastIndexOf("n",10)); //10

        System.out.println(str.lastIndexOf("is")); //5

        System.out.println(str.lastIndexOf("Ali")); //-1




    }
}

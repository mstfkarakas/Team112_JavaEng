package day10_StringManipulations;

public class c05_indexOf {
    public static void main(String[] args) {
        String str = "Java is very beautiful, very";

        System.out.println(str.indexOf("v")); //2

        System.out.println(str.indexOf("b")); // 13

        System.out.println(str.indexOf("very"));  //8

        System.out.println(str.indexOf("java")); // -1 // this means it could not be able to find it in str

        System.out.println(str.indexOf("a",13));




    }
}

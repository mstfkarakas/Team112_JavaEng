package day05_incrementDecrement_Concatenation;

public class C03_Concatenation {
    public static void main(String[] args) {


        String a = "Java";
        String b = "is funny";

        System.out.println(a + b); // Javais funny
        System.out.println(a + " " + b); //Java is funny

        int c = 10;
        int d = 20;

        System.out.println(a + c + d); //Java1020
        System.out.println(c+d+a); // 30Java
        System.out.println(""+c+d+a);  //1020Java

        // String is strong : When string data type faces with other data types, result will be string

        // How can I type Java30
        System.out.println(a + (c + d)); //

    }


}

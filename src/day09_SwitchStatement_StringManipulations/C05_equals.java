package day09_SwitchStatement_StringManipulations;

public class C05_equals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "JAVA";
        String str3 = "java";
        String str4 = "JaVa";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str3.equals(str4)); // false

        // sometimes if lowercase or uppercase stuations are not importand

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str3.equalsIgnoreCase(str4)); // true

        String str5 = "Java";
        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6.concat(str7);  // Java  (Ja+va)

        System.out.println(str8);   // Java

        System.out.println( str1 == str5); // Java == Java   // true
        System.out.println( str1 == str8); // Java == Java   // false

        // when we try to compare String data type  with == symbols. It will check text and referance at the same time
        // but "equals" will only check the text

        // when we try to compare Strings we should use equals instead of ==









    }
}

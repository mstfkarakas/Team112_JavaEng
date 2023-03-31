package day36_exceptions;

public class C07_ExceptionTurleri {
    public static void main(String[] args) {

        String str = null;
        System.out.println(str);
        //  System.out.println(str.concat("Java"));   NullPointerException

        // String olarak verilen sayilarin toplamini yazdirin.
        String str1 = "34";
        String str2 = "23";
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));


        // String olarak verilen sayilarin toplamini yazdirin.
        String str3 = "34";
        String str4 = "23a";
        //   System.out.println(Integer.parseInt(str3)+Integer.parseInt(str4));  // NumberFormatException

        Object str5 = "Java Candir";
     // Integer a = (Integer) str5;  // ClassCastException

    }
}

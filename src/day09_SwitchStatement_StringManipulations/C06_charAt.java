package day09_SwitchStatement_StringManipulations;

public class C06_charAt {
    public static void main(String[] args) {

        String str = "Java is funny";

        System.out.println(str.charAt(0)); // J

        // please print 6. letter
        System.out.println(str.charAt(5));

        // please print the last char
        System.out.println(str.charAt(12));

        //
        System.out.println(str.charAt(12-1));

        System.out.println(str.charAt(15)); // str does not have any letter at index 15, so it will give an error
        //Run Time Error: RTE

        //String letter = 12; // Compile Time Error  // CTE



    }


}

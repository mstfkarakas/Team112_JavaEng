package day02_Variables_ScanObject;

public class C03_DataTypes {

    public static void main(String[] args) {

        double number1=3.1234567890123456789; // 3.1234567890123457  // last decimal may be different than the original
        // when you use doubles because of the last decimal you may see interesting results

        // 15/3 = 4,9999999999999999999 , 5.0 , 5.00000000000001



        System.out.println(number1);

        float number2 = 2.1234567890123456789f;  // 2.1234567  // when we are creating a float we need to
        // wrinte f or F at the end of the number

        System.out.println(number2);


        boolean isStudent = true ; // boolean can store two different value, true and false

        byte byteNumber = 12;  // -128 > 127
        short shortNumber = 13;
        int intNumber = 14;
        long longNumber = 15;

        System.out.println(shortNumber+longNumber);

        // we will use int, and double in the lessons









    }




}

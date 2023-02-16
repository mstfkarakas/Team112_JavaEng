package day04_dataCasting_WrapperClasses;

public class C06_WrapperClasses {

    public static void main(String[] args) {


        String str = "Ali Can";

        int number = 12;
        Integer numberW =12;

        /*
        We used primitive data types and stored a lot of data inside
        But these primitive data types do not have any premade methods

        So Java created wrapper classes of these primitive data types

        int  >>> Integer
        char >>> Character
        byte >>> Byte
        boolean >>> Boolean

        These wrapper classes have premade methods for us to in coding
        They store same kind of data.

         */

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        String  strNumber = "345";

        int intNumber = Integer.parseInt(strNumber);

        System.out.println(intNumber+1);


        System.out.println(strNumber+10);
        System.out.println(Integer.parseInt(strNumber)+10);

        char chr = 'k';

        System.out.println(Character.isDigit(chr)); // false
        System.out.println(Character.isLetter(chr)); // true
        System.out.println(Character.isAlphabetic(chr)); // true



    }

}

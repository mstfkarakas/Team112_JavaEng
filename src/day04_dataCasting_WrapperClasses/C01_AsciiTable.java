package day04_dataCasting_WrapperClasses;

public class C01_AsciiTable {

    public static void main(String[] args) {

        /*

        24 ==> 11000
        a  ===> 97 ===> 10100010
        b  ===> 98
        c ====> 99


         */

        //When we assign a number to a char variable, actually we are using the ASCII TABLE

        System.out.println(5 + 'a'); // 102  // when we use single quotes, it means it is a char  // 5a

        char chr = 99;
        System.out.println(chr);  // c

        // to get the next char

        char chr2 = 'b';
        System.out.println(chr2+1); // 99
        System.out.println((char)(chr2+1)); // c


        // when a char sees a math calculation symbol, it will act like a number

        char chr4 = 'f';

        System.out.println((char)(chr4-2));





    }
}

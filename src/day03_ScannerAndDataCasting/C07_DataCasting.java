package day03_ScannerAndDataCasting;

public class C07_DataCasting {

    public static void main(String[] args) {

        boolean bl = true;
        bl = false;

//        bl = "true";
//        bl = 20;
//        bl = 'a';

        char ch = 't';
        ch = '%';
        ch = ' ';
        ch = 'c';
        ch = 99; // interesting

        int num1= 20;

        short num2 = 15;

        double num3 =24;

        num1 = num2;  // int <=== short
        System.out.println(num1);

//        num1 = num3;  // interesting  // int < ==== double

        // num2 = num1 ; // interesting
        // num2 = num3 ;

        num3 = num1 ; // double <==== int

        num3 = num2; // double <=== short

        num1 = ch;

        num3 = ch;

    int a = 12;
    int c = 567;


        byte b = (byte) a;  //!!!!!
        System.out.println(b);

        byte d = (byte) c;
        System.out.println(d);

        int n = 513;

        byte m = (byte) n;
        System.out.println(m);















    }




}

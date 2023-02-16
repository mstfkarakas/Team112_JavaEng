package day04_dataCasting_WrapperClasses;

public class C07_ImportantParts {

    public static void main(String[] args) {

        int a = 20;
        int b = 6;

        System.out.println(a/b);


        double c = 20; //26
        System.out.println(c/b);
        // if we use a double in a calculation result will also calculated in double data type
        System.out.println(c/b); // double / int  // 3.3333333333333335

        float d =20f;

        System.out.println(d/b);  // float / int  // 3.3333333


        System.out.println((double) (a/b));  //3.0

        // when we try to devide an int by another int, result will be an int. So if we try to cast this int
        //to a double, still double will not have decimal units


        // if we want to have a double result from integers, we need to cast one of the int to double
        System.out.println((double) a/b); // 3.3333333333333335
        System.out.println(a/(double)b ); // 3.3333333333333335


            int num = 12;

            num = num +5;

        System.out.println(num);

        System.out.println("---------------------------------------");

        int number = 1467;
        System.out.println(number);

        System.out.println(number = number/10); // number is 146

        System.out.println(number = number/10); // number is 14

        System.out.println(number = number/10); // number is 1

        System.out.println(number = number/10); // number is 0








    }
}

package day05_incrementDecrement_Concatenation;

public class C02_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        /*

        If we are trying to decrease or increase value by one we can use ++ or -- symbols

        If these ++ or -- symbols are in frond of the variable ( ex: ++a), and If we are trying to do two different
        actions at the same time, we need to complete increment first, then we will do the second part

        If these ++ or -- symbols are after the variable ( ex: a++ ), and if we are trying to do two different things
        at the same time, we need to complete the action first then we will increase the value;

         */


        int a = 20;

        a++; // increased the value by one

        System.out.println("a : "+a);  //21

        a = 20 ;

        ++a; // increased the value by one

        System.out.println("a : "+a); // 21

        a=20;

        a--;

        System.out.println("a : " + a); // 19

        System.out.println("------------------------------");

        a = 20;

        System.out.println(++a); // 21

        System.out.println("----------------");
        a = 20;

        System.out.println(a++);  //20;

        System.out.println("a : "+a ); //21


        System.out.println("--------------");
        a = 20;

        int b = a++;

        System.out.println("a : "+a +", b : "+b);

        System.out.println("--------------");

        a= 20;

        b = ++a;


        System.out.println("a : "+a +", b : "+b);


        System.out.println("--------------");

        a = 20;

        b = a--;

        System.out.println("a : "+a +", b : "+b);


        a = 20;
        b= 10 ;

        int c = 30;

        System.out.println(++c); // 31
        System.out.println(a++); // 20
        System.out.println(a);  // 21
        c= b++;
        System.out.println(c); // 10
        System.out.println(--a); // 20
        System.out.println(--a); // 19
        System.out.println(a); // 19



















    }

}

package day13_NestedLoops_MethodCreation;

public class C08_ReturnType {
    public static void main(String[] args) {

        int newNumber = add(4, 7);
        System.out.println(newNumber+5);

    }
 //   1      1     2    3                   4                   5
    public static int add (int firstNumber, int secondNumber){

        int result = firstNumber  +secondNumber;
//      6
       return result;

    }

    /*
    when we are creating a method in line 11
    1) public static
    2) return type ( if we want to receive something we need to enter that data type)
                   ( if we want to type somethign we can use void return type)
    3) name
    4) in () part, you need to create datas that you are planing to use in the method
    5) in body {} write the codes
    6) if u used a return typey at second step, you need to use "return" to decide what to retun

     */



}

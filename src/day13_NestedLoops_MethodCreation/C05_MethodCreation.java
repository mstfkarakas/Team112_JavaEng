package day13_NestedLoops_MethodCreation;

public class C05_MethodCreation {


    // create a method that adds two numbers

    public static void main(String[] args) {
        add(3,5);

        add(455445,334);

        nothing();


    }

    public static void add (int firstNumber, int secondNumber  ) {


        int result = firstNumber + secondNumber ;
        System.out.println(" the result is : "+result);

    }

    public static void nothing(){
        System.out.println("nothing will be printed");
    }


}

package day11_stringManipulations_forLoops;

public class C05_Question {
    public static void main(String[] args) {

        //Question 2: Collect and print the String prices given by the user in a certain format.


        //input1: “15.31 €” , input2: “11.40 €”
        //output : 26.71 €

        String input1 = "15.31 €";
        String input2 = "11.40 €";

        double sum = 0; // ??????

        input1 = input1.replaceAll("\\D","");
        System.out.println(input1); // 1531

        input2 = input2.replaceAll("\\D","");
        System.out.println(input2); // 1140

        double inp1 = Double.parseDouble(input1); // it will become a number data type so we can use them in math calc.
        double inp2 = Double.parseDouble(input2);

        sum = (inp1 + inp2) /100;
        System.out.println(sum);  // 26.71

        System.out.println( sum + " €"); // 26.71 €

    }







}

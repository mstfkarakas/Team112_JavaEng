package day15_doWhileLoop_scope;

public class C02_Sum_of_Digits {
    public static void main(String[] args) {

        // verilen pozitif bir tamsayinin
        // rakamlar toplamini bize döndüren method olusturun

        System.out.println(sumOfDigits(12345));
    }

    public static int sumOfDigits(int givenNumber) {

        int number = givenNumber;
        int onesDigit = 0;
        int sumOfDigits = 0;

        int numberOfDigits = (number + "").length();   // "" kullanarak sayiyi String'e cevirirsek,
                                                       // basamak sayisini .length() kullanarak bulmus oluruz.


        for (int i = 1; i <=numberOfDigits ; i++) {    // i is used to tell Java how many times for loop should loop.
            onesDigit = number%10;
            sumOfDigits += onesDigit;
            number /=10;
            
        }

        return sumOfDigits;


    }

}

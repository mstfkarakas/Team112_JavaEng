package GroupWork;

public class C01_Question {
    public static void main(String[] args) {

        // Create a method that reverses a given String using the while loop and returns this state to us.
        System.out.println(reverseString("masdf"));
                               //         01234
    }

    public static String reverseString (String str) {

    //  Esra hoca'dan;

        String output = "";
        int a = str.length()-1;
        while(a >= 0){
            output += str.charAt(a);
            a--;
        }
        return output;
    }

}



package day13_NestedLoops_MethodCreation;

public class C04_MethodCreation {

    public static void main(String[] args) {

        String str = "Java is the best";

        // change all letters to uppercase

        //System.out.println(str.toUpperCase()); // JAVA İS THE BEST

        // toUpperCase is a method created by java developers. We can create our own methods
        String str2 = str.toUpperCase();

        System.out.println(str2);
    }
}

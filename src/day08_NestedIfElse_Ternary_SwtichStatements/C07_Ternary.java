package day08_NestedIfElse_Ternary_SwtichStatements;

public class C07_Ternary {
    public static void main(String[] args) {
        //Question 2- Get 3 side lengths of triangle from the user,
        // print “Equilateral triangle” if the triangle is equilateral,
        // otherwise print “Not equilateral”.

        int side1 = -12;
        int side2 = -12;
        int side3 = -12;

        System.out.println(side1 == side2 && side2 == side3 && side1>0  // ternary
                                    ? "Equilateral triangle"
                                    : "Not equilateral" );

    }
}

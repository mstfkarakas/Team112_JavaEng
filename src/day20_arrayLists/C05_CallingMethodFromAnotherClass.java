package day20_arrayLists;
import java.util.ArrayList;
import java.util.List;
public class C05_CallingMethodFromAnotherClass {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        products.add("Nutella");
        products.add("Toy Car");
        products.add("Baby Toy");
        products.add("Rabbit");
        products.add("Candy");
        String unwantedLetter = "o";

        System.out.println(C04_RemoveUnwanted.deleteNamesWhichContainsUnwantedLetter(products, unwantedLetter));
    }
}

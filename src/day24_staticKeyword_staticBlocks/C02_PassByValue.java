package day24_staticKeyword_staticBlocks;

public class C02_PassByValue {
    public static void main(String[] args) {

        double price = 200;

        discount10(price);
        System.out.println("After calling the discount10 method, price is: " + price);  //the price is still 200. It doesn't change.
                            // Java is creating a copy of the price value and uses it for calculations.

        discount25(price);
        System.out.println("After calling the discount25 method, price is: " + price);


    }
    public static void discount10 (double price) {

        price = price * 0.9;        // same named variables can be created within different methods.
        System.out.println(price);
    }

    public static void discount25 (double price) {
        price = price * 0.75;
        System.out.println("After 25% discount, the new price is: " + price);
    }
//    public static int discount10BringResult (double price) {
//
//        price = price * 0*9;
//       return price;
//    }
}

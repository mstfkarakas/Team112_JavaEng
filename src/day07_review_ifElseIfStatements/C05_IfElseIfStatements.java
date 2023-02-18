package day07_review_ifElseIfStatements;

import java.util.Scanner;

public class C05_IfElseIfStatements {

    //Question 3- Get the number of products purchased from the user
    // and the list price,
    // and ask the user if they have a customer card.
    // If the customer has a card and buys more than 10 items, 20% off, otherwise 15% off.
    //	If the customer does not have a card, 15% off if he buys more than 10 products, 10% off if he does not



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Number of the products");
        int numberOfPro = scan.nextInt();;

        System.out.println("Please enter list price");
        int listPrice = scan.nextInt();

        // we did not choose a boolean to enter the data because sometimes it is hard to store a boolean
        System.out.println("Plese enter 1 if you have a card, if you dont have please enter 0");
        int haveCard = scan.nextInt();

        if (haveCard==1 && numberOfPro>=10){
            System.out.println("with 20% discount with card, number >= 10 : "+listPrice*numberOfPro*80/100);

        } else if (haveCard ==1 && numberOfPro<10) {
            int newPrice = listPrice - listPrice*15/100;

            System.out.println("with 15% discount with card, number < 10 : " + newPrice*numberOfPro);
        } else if (haveCard==0 && numberOfPro>=10) {
            System.out.println("with 15% discount without card, number > 10 : "+listPrice*numberOfPro*85/100);

        } else if (haveCard ==0 && numberOfPro<10) {
            System.out.println("with 10% discount without card, number < 10: "+listPrice*numberOfPro*90/100);

        }
    }
}

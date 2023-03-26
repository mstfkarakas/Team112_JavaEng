package Book2;

import java.util.Scanner;

public class BookStoreApplication2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        BookStore2 book2 = new BookStore2();
        boolean flag = true;

        while (true) {
        System.out.println("============ Online Book Store ============\n" +
                "Please input one of the below numbers: \n\n" +
                "1. Add a Book\n" +
                "2. Delete a Book with a Number\n" +
                "3. List all Books\n" +
                "4. Finish");
        int option2 = scan.nextInt();
        switch (option2) {
            case 1:
                book2.addBook2();
                break;
            case 2:
                book2.delete_the_Book();
                break;
            case 3:
                book2.listAllBooks2();
                break;
            case 4:
                System.out.println("You successfully quit the app!");
                flag = false;
            default:
                System.out.println("Invalid entry. Try again.");
        }
    }
    }
}

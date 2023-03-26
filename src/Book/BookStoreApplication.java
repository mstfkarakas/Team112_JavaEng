package Book;

import java.util.Scanner;

public class BookStoreApplication {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        BookStore book = new BookStore();
        //boolean flag = true;

        while (true) {
            System.out.println("============ Online Book Store ============");
            System.out.println("1. Add a Book\n" +
                    "2. Delete a Book with a Number\n" +
                    "3. List all Books\n" +
                    "4. Finish");

            System.out.println("Please input one of the options above.");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    book.addBook();
                    break;
                case 2:
                    book.deleteBook();
                    break;
                case 3:
                    book.listAllBooks();
                    break;
                case 4:
                    System.out.println("You quit the app.");
                    //flag = false;
                    System.exit(0);
                default:
                    System.out.println("Invalid entry.");
            }
        }
    }
}

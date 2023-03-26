package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {

    Scanner scan = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();
    int bookID = 1001;

    public void addBook() {
        System.out.println("Enter the book name: ");
        String book_Name = scan.next();

        System.out.println("Enter the author's name: ");
        String author_Name = scan.next();

        System.out.println("Enter the book's publication year: ");
        int pub_Year = scan.nextInt();

        System.out.println("Enter the book's price: ");
        double price = scan.nextDouble();

        Book eachbook = new Book(bookID,book_Name,author_Name,pub_Year,price);

        books.add(eachbook);
        bookID++;  // kitap ID'sini bir artiriyor ki her kitab farkli ID ile kaydedilsin.

        System.out.println("Your book is successfully added to the list.");
    }

    public void deleteBook() {
        if (isBookDeleted()) {
            System.out.println("Your books is deleted.");
        }else {
            System.out.println("Wrong ID entry.");
        }
    }
    public boolean isBookDeleted () {
        System.out.println("Enter the book ID that you want to delete: ");
        int inputBookID = scan.nextInt();
        for (int i = 0; i < books.size(); i++) {
             Book each_book = books.get(i);
             if (each_book.bookID == inputBookID) {
                 books.remove(i);
                 return true;
             }
        } return false;
    }
    public void listAllBooks() {
        for (Book each : books) {
            System.out.println(each.toString());
        }
    }
}

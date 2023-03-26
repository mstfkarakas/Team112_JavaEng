package Book2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStore2 {

    Scanner scan = new Scanner(System.in);
    ArrayList<Book2> book_s_List = new ArrayList<>();
    int book_s_ID = 1001;

    public void addBook2() {
        System.out.println("Enter (i) the name of the book: ");
        String book_s_Name = scan.next();

        System.out.println("Enter (ii) the author's name: ");
        String author_s_Name = scan.next();

        System.out.println("Enter (iii) the publication year: ");
        int pub_s_Year = scan.nextInt();

        System.out.println("Enter (iv) the price of the book: ");
        double book_s_Price = scan.nextDouble();

        // we add the new book as an object in the Book2 class
        // we add the new book in the list of the books.
        Book2 new_Book = new Book2(book_s_ID,book_s_Name,author_s_Name,pub_s_Year,book_s_Price);
        book_s_List.add(new_Book);
        // we increase the book ID number by 1
        book_s_ID++;
        System.out.println("Your book is successfully added to the list ツ");
    }
    public void delete_the_Book() {
        if (is_the_Book_Deleted()){
            System.out.println("The book was successfully deleted");
        } else {
            System.out.println("ID doesn't match");
        }
    }
    public boolean is_the_Book_Deleted(){
        System.out.println("Enter the book ID that you want to delete: ");
        int book_ID_to_remove = scan.nextInt();
        for (int i = 0; i < book_s_List.size(); i++) {
           Book2 eachBook = book_s_List.get(i);
            if (eachBook.book_s_ID == book_ID_to_remove){
                book_s_List.remove(i);
                return true;
            }
        }return false;
    }
    public void listAllBooks2(){
        for (Book2 each_new_book : book_s_List) {
            System.out.println(each_new_book.toString());
        }
    }
}
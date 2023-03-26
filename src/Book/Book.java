package Book;

public class Book {

    int bookID;
    String bookName;
    String authorName;
    int publicationYear;
    double bookPrice;

    public Book(int bookID, String bookName, String authorName, int publicationYear, double bookPrice) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        this.bookPrice = bookPrice;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publicationYear='" + publicationYear + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}

package Book2;

public class Book2 {

    int book_s_ID;
    String book_s_Name;
    String author_s_Name;
    int publication_s_Year;
    double book_s_Price;

    public Book2(int book_s_ID, String book_s_Name, String author_s_Name, int publication_s_Year, double book_s_Price) {
        this.book_s_ID = book_s_ID;
        this.book_s_Name = book_s_Name;
        this.author_s_Name = author_s_Name;
        this.publication_s_Year = publication_s_Year;
        this.book_s_Price = book_s_Price;
    }

    public int getBook_s_ID() {
        return book_s_ID;
    }

    public void setBook_s_ID(int book_s_ID) {
        this.book_s_ID = book_s_ID;
    }

    public String getBook_s_Name() {
        return book_s_Name;
    }

    public void setBook_s_Name(String book_s_Name) {
        this.book_s_Name = book_s_Name;
    }

    public String getAuthor_s_Name() {
        return author_s_Name;
    }

    public void setAuthor_s_Name(String author_s_Name) {
        this.author_s_Name = author_s_Name;
    }

    public int getPublication_s_Year() {
        return publication_s_Year;
    }

    public void setPublication_s_Year(int publication_s_Year) {
        this.publication_s_Year = publication_s_Year;
    }

    public double getBook_s_Price() {
        return book_s_Price;
    }

    public void setBook_s_Price(double book_s_Price) {
        this.book_s_Price = book_s_Price;
    }
}

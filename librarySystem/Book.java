package librarySystem;

public class Book {
    private int bookId;
    String title;
    double price;

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    void showBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        int intPrice = (int) (price);
        System.out.println("Price: " + intPrice);
    }

}

package librarySystem;

public class Librarian extends Student {
    final String libraryName = "UniLibrary";

    Librarian(String name, int rollNo) {
        super(name, rollNo);
    }

    final void removeBook(Book b) {
        System.out.println("Removing book: " + b.getTitle());
    }

}

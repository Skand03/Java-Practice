package librarySystem;

public class Mainborrowed {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Teravision", 500.0);
        Book b2 = new Book(102, "Caos", 10000.0);
        Book b3 = new Book(103, "Club", 50000.0);

        Student s1 = new Student("SKand", 1272251121);
        Student s2 = new Student("Radhe", 1234567890);

        Librarian l = new Librarian("FutureBright", 98765432);

        System.out.println(Student.studentCount);
        b1.showBook();
        b2.showBook();
        b3.showBook();

        Borrow b = new Borrow(101);
        Borrow.Innerborrow ib = b.new Innerborrow();
        ib.daysborrowed = 7;
        ib.b = b1;
        ib.s = s1;
        ib.showBorrow();

        l.removeBook(b3);

        s1.showDetails();
        s2.showDetails();
    }
}

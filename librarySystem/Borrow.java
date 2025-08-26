package librarySystem;

public class Borrow {
    int borrowId;

    Borrow(int borrowId) {
        this.borrowId = borrowId;
    }

    public class Innerborrow {
        Book b;
        Student s;
        int daysborrowed;

        void showBorrow() {

            int daysborrowedTotal = (int) (b.getPrice() * daysborrowed);
            System.out.println("Borrow ID: " + borrowId);
            System.out.println(b.getTitle());
            System.out.println(b.getPrice());
            System.out.println(daysborrowedTotal);
            System.out.println(s.name);
            System.out.println(daysborrowed);
        }
    }

}

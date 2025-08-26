package librarySystem;

public class Student {
    String name;
    int rollNo;
    static int studentCount = 0;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        studentCount++;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Students: " + studentCount);
    }

}

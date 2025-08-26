public class Student {
    String name;
    int rollNo;

    static int studentCount = 0;

    public Student(String name, int rollNo) {

        this.name = name;
        this.rollNo = rollNo;
        studentCount++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void enroll(Course c) {
        System.out.println("Student enrolled in course: " + c.getCourseName());
    }

}

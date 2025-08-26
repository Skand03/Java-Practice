public class Mainuniversity {
    public static void main(String[] args) {
        Course c1 = new Course(101, "Java", 50000.0);
        Course c2 = new Course(102, "Python", 10000.0);
        Course c3 = new Course(103, "C++", 20000.0);

        Student s1 = new Student("Alice", 1);
        Student s2 = new Student("Bob", 2);
        Student s3 = new Student("Charlie", 3);

        System.out.println("Total Students: " + Student.studentCount);

        Faculty f1 = new Faculty("Dr. Smith", 101);
        Faculty f2 = new Faculty("Dr. Johnson", 102);
        Faculty f3 = new Faculty("Dr. Williams", 103);

        f1.assignCourse(c1);
        f2.assignCourse(c2);
        f3.assignCourse(c3);

        Enrollment e1 = new Enrollment(101);
        Enrollment.Details ed = e1.new Details();
        ed.s = s1; // ✅ assign student
        ed.c = c1; // ✅ assign course
        ed.monthDuration = 6;
        ed.showEnrollment(); // ✅ now works properly
    }
}

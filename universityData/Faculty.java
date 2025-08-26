public class Faculty extends Student {

    final String universityName = "Abc University";

    Faculty(String name, int rollNo) {
        super(name, rollNo);
    }

    final void assignCourse(Course c) {
        System.out.println("Course assigned: " + c.getCourseName());
    }

}

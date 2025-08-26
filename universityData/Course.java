package universityData;

public class Course {
    private int courseId;
    private String courseName;
    private double fees;

    public Course(int courseId, String courseName, double fees) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.fees = fees;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public double getFees() {
        return fees;
    }

    public void showCourse() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Fees in double: " + fees);

        int intFees = (int) (fees);
        System.out.println(intFees);

    }

}

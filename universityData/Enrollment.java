package universityData;

public class Enrollment {
    int enrollId;

    public Enrollment(int enrollId) {
        this.enrollId = enrollId;

    }

    public class Details {
        Student s;
        Course c;
        int monthDuration;

        public void showEnrollment() {
            System.out.println("Enrollment Details " + enrollId);
            System.out.println("Student: " + s.getName());
            System.out.println("Course: " + c.getCourseName());
            System.out.println("Duration: " + monthDuration + " months");
        }
    }

}

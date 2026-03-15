public class Course {
    private String courseCode;
    private String courseName;
    private String instructorId;

    public Course(String courseCode, String courseName, String instructorId) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructorId = instructorId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructorId() {
        return instructorId;
    }

    @Override
    public String toString() {
        return courseCode + " - " + courseName + " (Instructor: " + instructorId + ")";
    }
}
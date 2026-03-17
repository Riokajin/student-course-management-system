// Simple class that represents a course in the system. Each course has a code, a name, and the ID of the instructor teaching it.
public class Course {
    private String courseCode;
    private String courseName;
    private String instructorId;
    
    // Basic constructor that sets all the course info.
    public Course(String courseCode, String courseName, String instructorId) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructorId = instructorId;
    }
    
    // Returns the course code
    public String getCourseCode() {
        return courseCode;
    }
    
    // Returns the full course name
    public String getCourseName() {
        return courseName;
    }
    
    // Returns the ID of the instructor assigned to this course
    public String getInstructorId() {
        return instructorId;
    }

    // Makes it easy to print a course in a readable format. This is used when displaying course lists
    @Override
    public String toString() {
        return courseCode + " - " + courseName + " (Instructor: " + instructorId + ")";
    }
}

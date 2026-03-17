public class Course {
    private String courseCode;
    private String courseName;
    private String instructorId;

    public Course(String courseCode, String courseName, String instructorId) {
        setCourseCode(courseCode);
        setCourseName(courseName);
        setInstructorId(instructorId);
    }

    public void setCourseCode(String courseCode) {
        try {
            if (courseCode.trim().equals(null) || courseCode.trim().equals("")) {
                System.out.println("Error setting Course Code: Course Code cannot be empty.");
            }
            else {
                String ccRegex = "^[A-Za-z0-9]{6}$";
                if (courseCode.matches(ccRegex)) {
                    this.courseCode = courseCode;
                    System.out.println("Course Code successfully set.");
                }
                else {
                    System.out.println("Error setting course: Course Code is in an invalid format, format is '######' (letters or numbers)");
                }
            }
        }
        catch (NullPointerException e) {
            System.out.println("Error setting Course Code: Course Code cannot be empty.");
        }
    }

    public void setCourseName(String courseName) {
        try {
            if (courseName.trim().equals(null) || courseName.trim().equals("")) {
                System.out.println("Error setting Course Name: Course Name cannot be empty.");
            }
            else {
                String cnRegex = "^[A-Za-z0-9\\s]+$";
                if (courseName.matches(cnRegex)) {
                    this.courseName = courseName;
                    System.out.println("Course Name successfully set.");
                }
                else {
                    System.out.println("Error setting course name: Course Name contains invalid characters (only use letters, numbers, and spaces)");
                }
            }
        }
        catch (NullPointerException e) {
            System.out.println("Error setting Course Name: Course Name cannot be empty.");
        }
    }

    public void setInstructorId(String id) {
        try {
            if (id.trim().equals(null) || id.trim().equals("")) {
                System.out.println("Error setting Instructor ID: ID cannot be empty.");
            }
            else {
                String idRegex = "^\\d{6}$";
                if (id.matches(idRegex)) {
                    this.instructorId = id;
                    System.out.println("Instructor ID successfully set.");
                }
                else {
                    System.out.println("Error setting Instructor ID: ID is improperly formatted, format is '######' (only numbers)");
                }                
            }
        }
        catch (NullPointerException e) {
            System.out.println("Error setting Instructor ID: ID cannot be empty.");
        }
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
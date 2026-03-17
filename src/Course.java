public class Course {
    // Properties
    private String courseCode;
    private String courseName;
    private String instructorId;

    // Constructor
    public Course(String courseCode, String courseName, String instructorId) {
        setCourseCode(courseCode);
        setCourseName(courseName);
        setInstructorId(instructorId);
    }

    // Validates the course code
    public void setCourseCode(String courseCode) {
        // If the course code is null for some reason, the system will crash. This first try catch prevents that
        try {
            // If the course code has nothing, it is invalid. Display an error to the user
            if (courseCode.trim().equals(null) || courseCode.trim().equals("")) {
                System.out.println("Error setting Course Code: Course Code cannot be empty.");
            }
            // Else, continue the program
            else {
                // Regex
                String ccRegex = "^[A-Za-z0-9]{6}$";
                // If the course code matches the regex, set it, if not, display an error
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

    // Do the same thing as done for the course code, but with the course name
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

    // Do the same again with the instructor id
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

    // Methods to get the various pieces of information
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructorId() {
        return instructorId;
    }

    // Returns the students information
    @Override
    public String toString() {
        return courseCode + " - " + courseName + " (Instructor: " + instructorId + ")";
    }
}
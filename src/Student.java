import java.util.ArrayList;

// Student is a type of PErson, so it inherits the basic name/ID/email stuff.
// This class adds program info, year level, and a list of courses the student is taking.
public class Student extends Person {
    private ArrayList<String> courses;
    private String program;
    private int yearLevel;

    // Constructor sets up the Student-specific fields and also calls the Person constructor.
    public Student(String name, String id, String email, String program, int yearLevel) {
        super(name, id, email);
        this.program = program;
        this.yearLevel = yearLevel;
        this.courses = new ArrayList<>();
    }
    // Adds a course code to the student's list
    public void addCourse(String courseCode) {
        courses.add(courseCode);
    }
    // Removes a course from the list if it exists
    public void removeCourse(String courseCode) {
        courses.remove(courseCode);
    }
    // Returns the full list of courses the student is taking
    public ArrayList<String> getCourses() {
        return courses;
    }
    // Formats all the student's info into a readable string for display
    @Override
    public String getDetails() {
        return "Student: " + getName() +
               "\nID: " + getId() +
               "\nEmail: " + getEmail() +
               "\nProgram: " + program +
               "\nYear Level: " + yearLevel +
               "\nCourses: " + courses;
    }
}

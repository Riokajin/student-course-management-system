import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> courses;
    private String program;
    private int yearLevel;

    public Student(String name, String id, String email, String program, int yearLevel) {
        super(name, id, email);
        this.program = program;
        this.yearLevel = yearLevel;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String courseCode) {
        courses.add(courseCode);
    }

    public void removeCourse(String courseCode) {
        courses.remove(courseCode);
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    @Override
    public String getDetails() {
        return "Student: " + getName() +
               "\nID: " + getID() +
               "\nEmail: " + getEmail() +
               "\nProgram: " + program +
               "\nYear Level: " + yearLevel;
               "\nCourses: " + courses;
    }
}
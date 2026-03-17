import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> courses;
    private String program;
    private int yearLevel;

    public Student(String name, String id, String email, String program, int yearLevel) {
        super(name, id, email);
        setProgram(program);
        setYearLevel(yearLevel);
        this.courses = new ArrayList<>();
    }
    
    public void setProgram(String program) {
        try {
            if (program.trim().equals(null) || program.trim().equals("")) {
                System.out.println("Error setting Program: Program cannot be empty.");
            }
            else {
                String programRegex = "^[A-Za-z0-9\\s]+$";
                if (program.matches(programRegex)) {
                    this.program = program;
                    System.out.println("Program successfully set.");
                }
                else {
                    System.out.println("Error setting program: Program contains invalid characters (only use letters, numbers, and spaces)");
                }
            }
        }
        catch (NullPointerException e) {
            System.out.println("Error setting Program: Program cannot be empty.");
        }
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
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
               "\nID: " + getId() +
               "\nEmail: " + getEmail() +
               "\nProgram: " + program +
               "\nYear Level: " + yearLevel +
               "\nCourses: " + courses;
    }
}
import java.util.ArrayList;

public class Student extends Person {
    // Properties
    private ArrayList<String> courses;
    private String program;
    private int yearLevel;

    // Constructor
    public Student(String name, String id, String email, String program, int yearLevel) {
        super(name, id, email);
        setProgram(program);
        setYearLevel(yearLevel);
        this.courses = new ArrayList<>();
    }
    
    // Sets the program
    public void setProgram(String program) {
        try {
            if (program.trim().equals(null) || program.trim().equals("")) {
                System.out.println("Error setting Program: Program cannot be empty.");
            }
            else {
                // Regex only allows letters, numbers, and spaces
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

    // Sets the year level, It's a simple integer, no regex, just checking if it's above 0
    public void setYearLevel(int yearLevel) {
        if (yearLevel > 0) {
            this.yearLevel = yearLevel;
        }
        else {
            System.out.println("Error setting year level: Year level must be larger then 0.");
        }
    }

    // Method to add a course to the course array
    public void addCourse(String courseCode) {
        // Prevents activating .trim on 
        try {
            // If not empty, continue program, else show an error
            if (courseCode.trim().equals(null) || courseCode.trim().equals("")) {
                System.out.println("Error setting Course: Course cannot be empty.");
            }
            else {
                // Regex
                String courseRegex = "^[A-Za-z0-9\\s]+$";
                // Check if regex matches the course code inputted
                if (courseCode.matches(courseRegex)) {
                    courses.add(courseCode);
                    System.out.println("Course successfully added.");
                }
                else {
                    System.out.println("Error adding course: Program contains invalid characters (only use letters, numbers, and spaces)");
                }
            }
        }
        catch (NullPointerException e) {
            System.out.println("Error added Course: Course cannot be null.");
        }
    }

    // Removes a course from the Array
    public void removeCourse(String courseCode) {
        courses.remove(courseCode);
    }

    // Method to get all courses
    public ArrayList<String> getCourses() {
        return courses;
    }

    // Method to print the details
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
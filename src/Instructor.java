// Instructor is another type of Person, so it reuses the name/ID/email from the Person class and just adds the department field.
public class Instructor extends Person {
    private String department;

    // Constructor sets up the Instructor-specific field and also calls the Person constructor to handle the shared attributes.
    public Instructor(String name, String id, String email, String department) {
        super(name, id, email);
        this.department = department;
    }

    // Returns all the instructor's info in a readable format. Each subclass of Person has its own version of this.
    @Override
    public String getDetails() {
        return "Instructor: " + getName() +
               "\nID: " + getId() +
               "\nEmail: " + getEmail() +
               "\nDepartment: " + department;
    }
}

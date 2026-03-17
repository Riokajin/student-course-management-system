public class Instructor extends Person {
    // Property
    private String department;

    // Constructor
    public Instructor(String name, String id, String email, String department) {
        super(name, id, email);
        setDepartment(department);
    }

    // Validates the department
    public void setDepartment(String department) {
        // If the department is null for some reason, the system will crash. This first try catch prevents that
        try {
            // If the deparment variable has nothing, it is invalid. Display an error to the user
            if (department.trim() == null || department.trim().equals("")) {
                System.out.println("Error setting Department: Department cannot be empty.");
            }
            // Else, continue the program
            else {
                // Regex
                String departmentRegex = "^[A-Za-z0-9\\s]+$";
                // If the deparment string matches the regex, set it, if not, display an error
                if (department.matches(departmentRegex)) {
                    this.department = department;
                    System.out.println("Department set successfully.");
                }
                else {
                    System.out.println( "Error setting Department: Department name contains invalid characters (only use letters, numbers, and spaces)");
                }
            }
        }
        catch (NullPointerException e) {
            System.out.println("Error setting Department: Department cannot be empty.");
        }
    }

    // Returns the instructors information
    @Override
    public String getDetails() {
        return "Instructor: " + getName() +
                "\nID: " + getId() +
                "\nEmail: " + getEmail() +
                "\nDepartment: " + department;
    }
}
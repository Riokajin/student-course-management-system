public class Instructor extends Person {
    private String department;

    public Instructor(String name, String id, String email, String department) {
        super(name, id, email);
        setDepartment(department);
    }

    public void setDepartment(String department) {
        try {
            if (department.trim() == null || department.trim().equals("")) {
                System.out.println("Error setting Department: Department cannot be empty.");
            }
            else {
                String departmentRegex = "^[A-Za-z0-9\\s]+$";
                if (department.matches(departmentRegex)) {
                    this.department = department;
                    System.out.println("Department set successfully.");
                }
                else {
                    System.out.println(
                            "Error setting Department: Department name contains invalid characters (only use letters, numbers, and spaces)");
                }
            }
        }
        catch (NullPointerException e) {
            System.out.println("Error setting Department: Department cannot be empty.");
        }
    }

    @Override
    public String getDetails() {
        return "Instructor: " + getName() +
                "\nID: " + getId() +
                "\nEmail: " + getEmail() +
                "\nDepartment: " + department;
    }
}